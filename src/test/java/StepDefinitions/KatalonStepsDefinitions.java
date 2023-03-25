package StepDefinitions;

import Steps.KatalonSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class KatalonStepsDefinitions {
    KatalonSteps katalonSteps;
    public KatalonStepsDefinitions() {
        this.katalonSteps = new KatalonSteps();
    }
    @Given("^ingrese al website de Katalon, de clic sobre el botón princiapl$")
    public void homePage() throws IOException{
        katalonSteps.verificationHomePage();
    }
    @And("^extraiga los datos de inicio de sesion usuario y contraseña para loggearme$")
    public void getText(){
        katalonSteps.getTextCredentiales();
        katalonSteps.getTextLoggin();
    }
    @When("^registre la (.*), (.*) (.*) y agregue un (.*)$")
    public void inputData(String facility, String program, String fecha, String comentario){
        katalonSteps.inputInformation(facility, program, fecha, comentario);
    }
    @Then("^me dirige a una pantalla de confirmación y luego al homepage$")
    public void verificationHomeFinal(){
        katalonSteps.isVisibleHomeFinal();
    }

}
