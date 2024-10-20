package POM;

import Steps.changes;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        Configuration.browser = "chrome";
        changes changes = new changes();
        open("https://practicetestautomation.com/practice-test-login/");


        changes.inputUsername();
        changes.inputPassword();
        changes.clickOnBtn();
        changes.verifyText();


    }
}
