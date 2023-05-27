package StepObject;

import PageObject.HomepagePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.HomepageData.approve_msg;

public class HomepageSteps extends HomepagePage {
    @Step("clicking on search button")
    public HomepageSteps click_search(){
        srch_btn.click();
        return this;
    }
    @Step("searching product - {item}")
    public HomepageSteps srch_item(String item){
        open_srch_out.setValue(item);
        return this;
    }
    @Step("clicking on search icon")
    public HomepageSteps srch_item_click(){
        click_search_icon.click();
        return this;
    }
    @Step("adding product to cart")
    public HomepageSteps addtocart_click(){
        cart_icon.click();
        return this;
    }
    @Step("wait for item added text")
    public HomepageSteps wait_add_cart_msg(){
        addtocart_msg.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }

}
