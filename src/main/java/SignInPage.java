import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class SignInPage {



    private SelenideElement signInButton = $ (byCssSelector("[href='/sign-in']:nth-child(1)"));

    private SelenideElement emailField =  $(byCssSelector("[id='sw-form-capture-email-input']"));

    private SelenideElement passwordField = $(byCssSelector("[id='sw-form-password-input']"));

    private SelenideElement signInLogin = $(byCssSelector("[id='sw-sign-in-submit-btn']"));

    private SelenideElement errorMessage = $(byCssSelector("#signin > div > div.error-message.login-error.d-block"));



    private SelenideElement professorsButton = $(byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[1]/a[3]/span"));

    private SelenideElement searchProfessorField =$(byCssSelector("#\\:r0\\:"));

    private SelenideElement viewProfileButton = $(byCssSelector("#teacher-spotlight-logged-in > section > div > div.filters-middle-section.container.MuiBox-root.css-0 > div > div > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-8.css-wh0kks > div.MuiBox-root.css-old1by > div > div.element-container.sw-text-align-left.MuiBox-root.css-bns4tv > div > div > a"));

    private SelenideElement imageProfile = $(byCssSelector("#teacher-details-list > section > div > div > div > div > div > div.css-fzj0g9 > div.css-11vnvw5 > div > div > div > div"));


    public void clickOnSignInButton(){
        signInButton.click();
    }

    public void successfulLogin(String email, String password){
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue(email);
        passwordField.setValue(password);
        signInLogin.click();

    }

    public void enterEmail(String emailTeacher){
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue(emailTeacher);
    }
    public void enterInvalidEmail(String invalidEmailTeacher){
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue(invalidEmailTeacher);

    }



    public void enterPassword(String password){
        passwordField.setValue(password);
    }

    public void enterInvalidPassword(String wrongPassword){passwordField.setValue(wrongPassword);}

    public void errorMassageText(){
        errorMessage.shouldHave(text("Invalid email or password"));
    }

    public void clickOnLoginButton(){
        signInLogin.click();
    }
}




