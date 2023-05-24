import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class SighUpTest extends BaseTest{
    @Test
    public void signUpTest(){
        Configuration.fastSetValue = true;
        signUp.clickOnSignUpButton();
        signUp.selectRoleTeacher();
        signUp.enterFullName("Victor New");
        signUp.enterEmail("ivanivanovtest@gmail.com");
        signUp.enterPassword("qwerty");
        signUp.clickAgree();
        signUp.viewSignUpButton();

    }

    @Test
    public void invalidEmail(){

        signUp.clickOnSignUpButton();
        signUp.selectRoleTeacher();
        signUp.enterFullName("Victor New");
        signUp.enterInvalidEmail("test1£gmail.com");
        signUp.enterPassword("qwerty");
        signUp.clickAgree();
        signUp.viewSignUpButton();
        signUp.errorMassageText();
    }

    @Test
    public void invalidPassword(){

        signUp.clickOnSignUpButton();
        signUp.selectRoleTeacher();
        signUp.enterFullName("Victor New");
        signUp.enterInvalidEmail(generatedEmail);
        signUp.enterPassword("qwer");
        signUp.clickAgree();
        signUp.viewSignUpButton();
        signUp.errorMassageText();
    }
}
