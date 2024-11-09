package Steps;

import Pages.Locators;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class changes {
    Locators locators = new Locators(); //Constructor


    @Step("Input in Username Field")
    public void inputUsername() {

            locators.usernameElement.sendKeys(locators.addElement.getText()); // Use the instance variable

    }

    @Step("Input in Password Field")
    public void inputPassword() {

        locators.passwordElement.sendKeys(locators.passwordLocator.getText()); // Use the instance variable

    }
    @Step("Input incorrect password in Password Field")
    public void inputIncorrectPassword() {

        locators.passwordElement.sendKeys(locators.passwordLocator.getText() + 123); // Use the instance variable

    }

    @Step("Click on btn")
    public void clickOnBtn() {
        locators.submitButton.click();
    }

    @Step("verifyText")
    public void verifyText() {
        locators.verificationElement.shouldHave(text("Logged In Successfully"));
    }

    @Step("VerifyError")
    public void verifyError() {
        locators.errorMessage.shouldBe(visible);
    }
}
