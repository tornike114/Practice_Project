import StepObject.HomepageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.HomepageData.*;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.AssertJUnit.*;


public class HomepageTest extends ChromeRunner {
    HomepageSteps homepage = new HomepageSteps();
    @Test
    public void search_test(){
        homepage.click_search();
        assertTrue(homepage.open_srch_out.is(Condition.visible));
    }
    @Test
    public void search_product(){
        homepage.click_search();
        homepage.srch_item(srch_product);
        assertEquals(homepage.open_srch_out.getValue(),srch_product);
    }
    @Test
    public void search_product_incorrect_value(){
        homepage.click_search();
        homepage.srch_item(incor_product);
        homepage.srch_item_click();
        assertEquals(homepage.srch_pg_input.getText(),warning_text);

    }
    @Test
    public void adding_item_to_cart(){
        homepage.click_search();
        homepage.srch_item(srch_product);
        homepage.srch_item_click();
        homepage.addtocart_click();
        homepage.wait_add_cart_msg();
        assertTrue(homepage.addtocart_msg.is(Condition.visible));
    }

}
