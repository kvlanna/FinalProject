import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SingUpPage {
    private SelenideElement signUpButton = $ (byCssSelector("[href='/sign-up']:nth-child(2)"));

    private SelenideElement selectRole = $(byClassName("filter-option-inner-inner"));

    private SelenideElement  roleTeacher = $(byCssSelector("[id='bs-select-1-0']"));

    private SelenideElement  roleStudent = $(byCssSelector("[id='bs-select-1-1']"));


            //$ (byClassName("dropdown-item"));


    private SelenideElement fullName = $(byCssSelector("[placeholder='Full Name']"));

    private SelenideElement email = $(byCssSelector("[placeholder='Email']"));

    private SelenideElement password = $(byCssSelector("[placeholder='Password']"));

    private SelenideElement agreeTermsAndPrivacyPolicy = $(byClassName("checkmark"));

    //sw-sign-up-submit-btn
    private SelenideElement viewSignUp = $(byCssSelector("[id='sw-sign-up-submit-btn']"));

    private SelenideElement errorMessage = $(byXpath("//*[@id=\"signup\"]/div[3]"));


    public void clickOnSignUpButton(){
        signUpButton.click();
    }
    public void selectRoleTeacher(){
        selectRole.shouldBe(Condition.visible, Duration.ofSeconds(50));
        selectRole.click();
        roleTeacher.click();

    }
    public void selectRoleStudent(){
        selectRole.shouldBe(Condition.visible, Duration.ofSeconds(50));
        selectRole.click();
        roleStudent.click();

    }

    public void enterFullName(String newName){
        fullName.shouldBe(Condition.visible,Duration.ofSeconds(10));
        fullName.setValue(newName);
    }
    public void enterEmail(String newEmail){
        email.shouldBe(Condition.visible, Duration.ofSeconds(10));
        email.setValue(newEmail);
    }

    public void enterInvalidEmail(String invalidEmail){
        email.setValue(invalidEmail);
    }
    public void errorMassageText(){
        errorMessage.shouldHave(text("Please make sure there are no empty required fields."));
    }
    public void enterPassword(String newPassword){
        password.shouldBe(Condition.visible,Duration.ofSeconds(10));
        password.setValue(newPassword);
    }
    public void enterInvalidPassword(String invalidPassword){
        password.setValue(invalidPassword);
    }
    public void clickAgree(){
        agreeTermsAndPrivacyPolicy.shouldBe(Condition.visible,Duration.ofSeconds(10));
        agreeTermsAndPrivacyPolicy.click();
    }

    public void viewSignUpButton(){
        viewSignUp.shouldBe(Condition.visible,Duration.ofSeconds(10));
        viewSignUp.click();
    }








}
