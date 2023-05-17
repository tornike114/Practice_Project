import PageObject.BasketPage;
import StepObject.Basketsteps;
import StepObject.HomepageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.HomepageData.srch_product;
import static org.testng.Assert.*;

public class BasketTest extends ChromeRunner {
    Basketsteps basketsteps=new Basketsteps();
    HomepageSteps home_basket=new HomepageSteps();
    @Test
    public void check_cart_name(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_name.is(Condition.visible));
    }
    @Test
    public void check_cart_colour(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_colour.is(Condition.visible));
    }
    @Test
    public void check_cart_code(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_code.is(Condition.visible));
    }
    @Test
    public void check_cart_quantity(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_quantity.is(Condition.visible));
    }
    @Test
    public void check_cart_price(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_price.is(Condition.visible));
    }
    @Test
    public void check_cart_sum(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        assertTrue(basketsteps.header_sum.is(Condition.visible));
    }
    @Test
    public void check_increased_quantity(){
        home_basket.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basketsteps.click_cart();
        basketsteps.save_price();
        basketsteps.increase_quantity();
        basketsteps.save_quantity();
        basketsteps.save_sum_price();
        double updated_price = basketsteps.price_in_cart * basketsteps.quantity_in_cart;
        assertEquals(basketsteps.summed_price,updated_price);
        System.out.println(basketsteps.summed_price);
        System.out.println(updated_price);
    }

}
