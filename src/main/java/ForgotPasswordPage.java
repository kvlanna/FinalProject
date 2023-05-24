import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    private SelenideElement forgotPassword = $(byAttribute("href", "/forgot-password"));

    private SelenideElement emailInputField = $(byCssSelector("[placeholder='Email']"));
    public void clickOnForgotPass(){
        forgotPassword.shouldBe(visible);
        forgotPassword.click();
        emailInputField.shouldBe(visible);
    }
}
