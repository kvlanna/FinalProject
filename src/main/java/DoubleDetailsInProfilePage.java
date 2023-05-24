import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DoubleDetailsInProfilePage  {
    private SelenideElement professorsButton = $(byXpath("//*[@id=\"home-header-logged-in-teachers\"]/header/div/div/div[1]/a[3]/span"));

    private SelenideElement searchProfessorField =$(byCssSelector("#\\:r0\\:"));
    private SelenideElement viewProfileButton = $(byCssSelector("#teacher-spotlight-logged-in > section > div > div.filters-middle-section.container.MuiBox-root.css-0 > div > div > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-8.css-wh0kks > div.MuiBox-root.css-old1by > div > div.element-container.sw-text-align-left.MuiBox-root.css-bns4tv > div > div > a"));


    private ElementsCollection imageProfileCollect = $$(byCssSelector("[id=\"teacher-details-list\"] [class=\"static-image\"]"));

    public void doubleDetailsInProfile(){
        professorsButton.click();
        searchProfessorField.shouldBe(visible, Duration.ofSeconds(10));
        searchProfessorField.click();




    }
    public void enterNameInSearchField(String nameTeacher){
        searchProfessorField.setValue(nameTeacher);
        searchProfessorField.shouldBe(visible,Duration.ofSeconds(10));
       // searchProfessorField.pressEnter();
        sleep(2000);
    }
    public void viewProfile(){
        viewProfileButton.click();
        imageProfileCollect.filterBy(visible).shouldHave(CollectionCondition.size(1));

    }
}
