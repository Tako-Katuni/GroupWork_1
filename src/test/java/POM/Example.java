package POM;

import Steps.changes;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Example {
    changes changes = new changes();
    @BeforeMethod
    public void before() {
        Configuration.browser = "chrome";
        //Configuration.holdBrowserOpen = true;
        open("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public  void firstTC() {
        changes.inputUsername();
        changes.inputPassword();
        changes.clickOnBtn();
        changes.verifyText();
    }
//Add two negative Cases
}