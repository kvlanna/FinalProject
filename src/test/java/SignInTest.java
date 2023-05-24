import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class SignInTest extends BaseTest{

    @Test
    public void successSighIn(){
        Configuration.fastSetValue = true;
        signIn.clickOnSignInButton();
        signIn.enterEmail("ivanivanovtest@gmail.com");
        signIn.enterPassword("qwerty");
        signIn.clickOnLoginButton();


    }
    @Test
    public void invalidPassword(){

        signIn.clickOnSignInButton();
        signIn.enterEmail("ivanivanovtest@gmail.com");
        signIn.enterInvalidPassword("qwert");
        signIn.clickOnLoginButton();
        signIn.errorMassageText();
    }
    @Test
    public void invalidEmail(){
       signIn.clickOnSignInButton();
       signIn.clickOnSignInButton();
       signIn.enterEmail("ahsdg£hdh");
       signIn.enterPassword("qwerty");
       signIn.clickOnLoginButton();
       signIn.errorMassageText();
    }


}
