package Steps;

import PageObject.KatalonPageObject;
import StepDefinitions.Hooks;
import Reports.Reports;
import org.junit.Assert;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class KatalonSteps {
    String user = "";
    String password = "";
    KatalonPageObject katalonPageObject;

    public KatalonSteps() {
        this.katalonPageObject = new KatalonPageObject();
        katalonPageObject.setDriver(Hooks.getDriver());
    }

    public void verificationHomePage() throws IOException {
        Properties configuration = new Properties();
        configuration.load(Files.newInputStream(Paths.get("Configuration.properties")));
        Hooks.getDriver().get(configuration.getProperty("url"));
        katalonPageObject.isVisibleHomePage1();
        katalonPageObject.clicBottonMakeAppointment();
    }
    public void getTextCredentiales(){
        user = katalonPageObject.obtainsTextUserName();
        Reports.reports("INFO", "Se obtiene el userName: "+user, Reports.takeSnapShot(Hooks.getDriver()));
        password = katalonPageObject.obtainsTextPassword();
        Reports.reports("INFO", "Se obtiene el Password: "+password, Reports.takeSnapShot(Hooks.getDriver()));
    }

    public void getTextLoggin() {
        katalonPageObject.sendKeysUsername(user);
        Reports.reports("INFO", "Se ingresa el userName", Reports.takeSnapShot(Hooks.getDriver()));
        katalonPageObject.sendKeysPassword(password);
        Reports.reports("INFO", "Se ingresa el Password", Reports.takeSnapShot(Hooks.getDriver()));
        katalonPageObject.cliclBottonLoggin();
    }
    public void inputInformation (String facility, String program, String fecha, String comentario){
        katalonPageObject.sendKeysFacility(facility);
        katalonPageObject.selectProgram(program);
        katalonPageObject.sendKeysData(fecha);
        katalonPageObject.sendKeysComment(comentario);
        Reports.reports("INFO", "Se completa el formulario de registro", Reports.takeSnapShot(Hooks.getDriver()));
        katalonPageObject.clicBottonConfirm();
    }

    public void isVisibleHomeFinal () {
        katalonPageObject.clicBottonHomePage();
        if (!katalonPageObject.isVisibleHomePage2()) {
            Reports.reports("FAIL", "Registro no Exitoso", Reports.takeSnapShot(Hooks.getDriver()));
            Assert.fail("Registro no Exitoso");
        }
        Reports.reports("PASS", "Registro Exitoso", Reports.takeSnapShot(Hooks.getDriver()));
    }
}



