package StepObject;

import PageObject.HomepagePage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static DataObject.HomepageData.approve_msg;

public class HomepageSteps extends HomepagePage {
    public HomepageSteps click_search(){
        srch_btn.click();
        return this;
    }
    public HomepageSteps srch_item(String item){
        open_srch_out.setValue(item);
        return this;
    }
    public HomepageSteps srch_item_click(){
        click_search_icon.click();
        return this;
    }
    public HomepageSteps addtocart_click(){
        cart_icon.click();
        addtocart_msg.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }
    public HomepageSteps wait_add_cart_msg(){
        addtocart_msg.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }

}
