package POM;

import Steps.changes;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Example {
    changes changes = new changes();
    @BeforeMethod
    public void before() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        open("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 1, description = "Verify successfull Log in ")
    @Description("Verify successfull Log in")
    @Story("Story 1")

    public  void firstTC() {
        changes.inputUsername();
        changes.inputPassword();
        changes.clickOnBtn();
        changes.verifyText();
    }
    @Epic("Epic 123 Allure")
    @Feature("Feature 1")
    @Test(priority = 2)
    public  void secondTC() {
        changes.inputUsername();
        changes.inputPassword();
        changes.clickOnBtn();
        changes.verifyError();

    }
    @Step("First TC whole steps")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public  void thirdTC() {
        throw new SkipException("Skipped test");

    }





}