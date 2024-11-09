package Pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
public class Locators {



    public SelenideElement addElement = $x("//*[@id=\"login\"]/ul/li[2]/b[1]");
    public SelenideElement passwordLocator =  $("ul li b:nth-of-type(2)");
    public SelenideElement usernameElement = $("#username");
    public SelenideElement passwordElement = $("#password");
    public SelenideElement submitButton = $("#submit");
    public SelenideElement verificationElement = $(".post-title");
    public SelenideElement errorMessage = $(".show");

}
