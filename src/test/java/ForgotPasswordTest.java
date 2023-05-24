import org.junit.Test;

public class ForgotPasswordTest extends BaseTest{

    @Test
    public void bagForgotPass(){

        signIn.clickOnSignInButton();
        forgotPasswordPage.clickOnForgotPass();

    }
}
