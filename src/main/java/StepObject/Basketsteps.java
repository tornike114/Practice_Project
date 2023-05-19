package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.refresh;

public class Basketsteps extends BasketPage {
    public Basketsteps click_cart(){
        cart_btn.click();
        return this;
    }
    public Basketsteps save_price() {
        price_in_cart = Double.parseDouble(cart_price.innerText().replace(" ","").replace("A",""));
        return this;
    }
    public Basketsteps increase_quantity() {
        cart_plus_btn.click();
        return this;
    }
    public Basketsteps save_sum_price(){
        summed_price = Double.parseDouble(sum_price.innerText().replace(" ","").replace("A",""));
        return this;
    }
    public Basketsteps decrease_quantity(){
        cart_minus_button.click();
        return this;
    }
    public Basketsteps del_itm_cart(){
        cart_x_btn.click();
        return this;
    }
    /*public Basketsteps refresh_cart(){
        refresh();
        return this;
    }*/
    public Basketsteps clear_cart(){
        clear_cart_btn.click();
        return this;
    }
    public Basketsteps wait_item_disappear(){
        item_in_cart.shouldNotBe(Condition.visible,Duration.ofMillis(2000));
        return this;
    }
    public Basketsteps adding_second_item_to_cart(){
        cart_icon1.click();
        return this;
    }
    public Basketsteps cart_continue_click(){
        cart_continue_btn.click();
        return this;
    }
    public Basketsteps iur_fiz_fields (){
        iur_person.shouldBe(Condition.visible,Duration.ofMillis(2000));
        return this;
    }

}
