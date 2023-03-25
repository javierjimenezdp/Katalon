package PageObject;

import StepDefinitions.Hooks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KatalonWebBasePage extends PageObject {
    public void esperaElemnento(WebElement element, int time){
        new WebDriverWait(Hooks.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement returnElement(String xPath, String option){
        return element(By.xpath(xPath.replace("Replaceable",option)));
    }
}

