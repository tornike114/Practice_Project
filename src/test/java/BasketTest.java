import PageObject.BasketPage;
import StepObject.Basketsteps;
import StepObject.HomepageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.HomepageData.srch_product;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.*;

public class BasketTest extends ChromeRunner {
    Basketsteps basketsteps=new Basketsteps();
    HomepageSteps home_basket=new HomepageSteps();
    @Test
    @Description("Test #5")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_name(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_name.is(Condition.visible));
    }
    @Test
    @Description("Test #6")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_colour(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_colour.is(Condition.visible));
    }
    @Test
    @Description("Test #7")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_code(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_code.is(Condition.visible));
    }
    @Test
    @Description("Test #8")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_quantity(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_quantity.is(Condition.visible));
    }
    @Test
    @Description("Test #9")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_price(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_price.is(Condition.visible));
    }
    @Test
    @Description("Test #10")
    @Severity(SeverityLevel.NORMAL)
    public void check_cart_sum(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_sum.is(Condition.visible));
    }
    @Test
    @Description("Test #11")
    @Severity(SeverityLevel.NORMAL)
    public void check_increased_quantity(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart()
                .save_price()
                .increase_quantity()
                .save_sum_price();
        double updated_price = basketsteps.price_in_cart * 2;
        assertEquals(basketsteps.summed_price,updated_price);
    }
    @Test
    @Description("Test #12")
    @Severity(SeverityLevel.NORMAL)
    public void check_decreased_quantity(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart()
                .save_price()
                .increase_quantity()
                .save_sum_price()
                .decrease_quantity()
                .save_sum_price();
        assertEquals(basketsteps.price_in_cart,basketsteps.summed_price);
    }
    @Test
    @Description("Test #13")
    @Severity(SeverityLevel.NORMAL)
    public void delete_cart_x_btn() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart()
                .del_itm_cart()
                .wait_item_disappear();
        assertTrue(basketsteps.item_in_cart.is(Condition.disappear));
    }
    @Test
    @Description("Test #14")
    @Severity(SeverityLevel.NORMAL)
    public void clear_cart_items_checking_with_item_desappear() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.adding_second_item_to_cart()
                .click_cart()
                .clear_cart();
        assertTrue(basketsteps.item_in_cart.is(Condition.disappear));
    }
    @Test
    @Description("Test #15")
    @Severity(SeverityLevel.NORMAL)
    public void clear_cart_items_checking_with_empty_cart_text() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.adding_second_item_to_cart()
                .click_cart()
                .clear_cart()
                .wait_item_disappear();
        assertTrue(basketsteps.cart_empty_text.is(Condition.visible));
    }
    @Test
    @Description("Test #16")
    @Severity(SeverityLevel.NORMAL)
    public void clear_cart_items_checking_with_empty_continue_btn() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.adding_second_item_to_cart()
                .click_cart()
                .clear_cart()
                .wait_item_disappear();
        assertTrue(basketsteps.cart_continue_btn.is(Condition.disappear));
    }
    @Test
    @Description("Test #17")
    @Severity(SeverityLevel.NORMAL)
    public void clear_cart_items_checking_with_clear_cart_btn() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.adding_second_item_to_cart()
                .click_cart()
                .clear_cart()
                .wait_item_disappear();
        assertTrue(basketsteps.cart_continue_btn.is(Condition.disappear));
    }
    @Test
    @Description("Test #18")
    @Severity(SeverityLevel.NORMAL)
    public void cart_continue_action() {
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart()
                .cart_continue_click()
                .iur_fiz_fields();
        assertTrue(basketsteps.iur_person.is(Condition.visible));
        assertTrue(basketsteps.fiz_person.is(Condition.visible));
    }
}
