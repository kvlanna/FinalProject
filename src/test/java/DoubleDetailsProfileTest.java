import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class DoubleDetailsProfileTest extends BaseTest {

    @Test
    public void bagDoubleDetails(){
        signIn.clickOnSignInButton();
        signIn.successfulLogin("roxanne@example.com","123456");
        doubleDetailsInProfilePage. doubleDetailsInProfile();
        doubleDetailsInProfilePage.enterNameInSearchField("Cordelia Taraby");
        doubleDetailsInProfilePage.viewProfile();





    }
}
