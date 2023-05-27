package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;


public class Basketsteps extends BasketPage {
    @Step("clicking on cart button")
    public Basketsteps click_cart(){
        cart_btn.click();
        return this;
    }
    @Step("saving price in cart")
    public Basketsteps save_price() {
        price_in_cart = Double.parseDouble(cart_price.innerText().replace(" ","").replace("A",""));
        return this;
    }
    @Step("pressing plus button in cart")
    public Basketsteps increase_quantity() {
        cart_plus_btn.click();
        return this;
    }
    @Step("saving summed price in cart")
    public Basketsteps save_sum_price(){
        summed_price = Double.parseDouble(sum_price.innerText().replace(" ","").replace("A",""));
        return this;
    }
    @Step("pressing minus button in cart")
    public Basketsteps decrease_quantity(){
        cart_minus_button.click();
        return this;
    }
    @Step("pressing deletete_x button cart")
    public Basketsteps del_itm_cart(){
        cart_x_btn.click();
        return this;
    }
    @Step("pressing clear all icons button")
    public Basketsteps clear_cart(){
        clear_cart_btn.click();
        return this;
    }
    @Step("wait for disappearing item")
    public Basketsteps wait_item_disappear(){
        item_in_cart.shouldNotBe(Condition.visible,Duration.ofMillis(2000));
        return this;
    }
    @Step("adding one more item to cart")
    public Basketsteps adding_second_item_to_cart(){
        cart_icon1.click();
        return this;
    }
    @Step("clicking continue button in cart")
    public Basketsteps cart_continue_click(){
        cart_continue_btn.click();
        return this;
    }
    @Step("waiting to appear fileds")
    public Basketsteps iur_fiz_fields (){
        iur_person.shouldBe(Condition.visible,Duration.ofMillis(2000));
        return this;
    }
}
