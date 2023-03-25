package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KatalonPageObject extends KatalonWebBasePage{
    String inputDay = "//tr//td[contains(text(),'Replaceable')]";
    String optionFacility = "//option[contains(text(),'Replaceable')]";
    String radioProgram ="//input[contains(@value,'Replaceable')]";
    @FindBy(id = "top")
    private WebElement homePage1;
    @FindBy(id = "btn-make-appointment")
    private WebElement clicBottonHome;
    @FindBy(xpath = "//div//h2[contains(text(),'Login')]")
    private WebElement homeLogin;
    @FindBy(xpath = "//input[contains(text(),'')]")
    private WebElement getTextUserName;
    @FindBy(xpath = "//input[@value='ThisIsNotAPassword']")
    private WebElement getTextPassword;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUserName;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//div//button[@id='btn-login']")
    private WebElement clicBottonLogin;
    @FindBy(xpath = "//div//h2[contains(text(),'Make Appointment')]")
    private WebElement homePage2;
    @FindBy(xpath = "//label[@class='checkbox-inline']")
    private WebElement clicCHheckBox;
    @FindBy(id = "txt_visit_date")
    private WebElement clicDate;
    @FindBy(xpath = "//div//textarea[@id='txt_comment']")
    private WebElement clicComment;
    @FindBy(id = "btn-book-appointment")
    private WebElement clicContinueBook;
    @FindBy(xpath = "//div[@class='col-xs-12 text-center']")
    private WebElement homePage3;
    @FindBy(xpath = "//div//p//a[@class='btn btn-default']")
    private WebElement clicContinueHomePage;
    @FindBy(xpath = "//div[@class='text-vertical-center']")
    private WebElement isVisibleHomeFinal;


    public boolean isVisibleHomePage1() {
        esperaElemnento(homePage1, 5);
        return homePage1.isDisplayed();
    }

    public void clicBottonMakeAppointment() {
        esperaElemnento(clicBottonHome, 5);
        clicBottonHome.click();
        esperaElemnento(homeLogin, 5);
    }

    public String obtainsTextUserName() {
        esperaElemnento(getTextUserName, 10);
        return getTextUserName.getAttribute("value");
    }
    public String obtainsTextPassword() {
        esperaElemnento(getTextPassword, 5);
        return getTextPassword.getAttribute("value");
    }

    public void sendKeysUsername(String user) {
        inputUserName.click();
        inputUserName.sendKeys(user);
    }

    public void sendKeysPassword(String password) {
        inputPassword.click();
        inputPassword.sendKeys(password);
    }
    public void cliclBottonLoggin(){
        esperaElemnento(clicBottonLogin,5);
        clicBottonLogin.click();
    }

    public void sendKeysFacility(String facility) {
        WebElement element = returnElement(optionFacility, facility);
        element.click();
        clicCHheckBox.click();
    }
    public void selectProgram(String program) {
        WebElement element = returnElement(radioProgram, program);
        element.click();
    }

    public void sendKeysData(String fecha) {
        esperaElemnento(homePage2,5);
        clicDate.click();
        WebElement element = returnElement(inputDay, fecha);
        element.click();
    }

    public void sendKeysComment(String comentario) {
        esperaElemnento(clicComment, 5);
        clicComment.click();
        clicComment.sendKeys(comentario);
    }
    public void clicBottonConfirm(){
        esperaElemnento(clicContinueBook,5);
        clicContinueBook.click();
    }

    public void clicBottonHomePage() {
        esperaElemnento(homePage3,5);
       clicContinueHomePage.click();
    }

    public boolean isVisibleHomePage2() {
        esperaElemnento(isVisibleHomeFinal,5);
        return isVisibleHomeFinal.isDisplayed();
    }


}
