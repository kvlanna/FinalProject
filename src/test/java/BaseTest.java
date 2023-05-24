import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest extends BasePage {
    // public final String Base_URL = "https://jere237.softr.app";

    public final String Base_URL = "https://erich416.softr.app/sign-in";

    BasePage baseclass = new BasePage();
    SignInPage signIn = new SignInPage();

    SingUpPage signUp = new SingUpPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    DoubleDetailsInProfilePage doubleDetailsInProfilePage = new DoubleDetailsInProfilePage();

    String generatedEmail = generateRandomEmail();





        @Before
        public void setUp(){

            Configuration.fastSetValue = true;
            System.setProperty("chromeoptions.args", "--remote-allow-origins=*");

            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
            open(Base_URL);

        }

    public String generateRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String randomEmail = "User"+ randomInt + "@gmail.com";
        return randomEmail;


    }

        @After
        public void tearDown(){
            closeWebDriver();
        }








}
