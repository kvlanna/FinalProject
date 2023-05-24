import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasePage {

    private SelenideElement siteIcon = $(byCssSelector("[class='sw-width-5xs']"));


    public void searchInputIsDisplayed(){
       siteIcon.shouldBe(visible);

   }
}
