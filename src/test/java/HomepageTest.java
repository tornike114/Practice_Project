import StepObject.HomepageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.HomepageData.*;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.AssertJUnit.*;


public class HomepageTest extends ChromeRunner {
    HomepageSteps homepage = new HomepageSteps();
    @Test
    @Description("Test #1")
    @Severity(SeverityLevel.NORMAL)
    public void search_test(){
        homepage.click_search();
        assertTrue(homepage.open_srch_out.is(Condition.visible));
    }
    @Test
    @Description("Test #2")
    @Severity(SeverityLevel.NORMAL)
    public void search_product(){
        homepage.click_search()
                .srch_item(srch_product);
        assertEquals(homepage.open_srch_out.getValue(),srch_product);
    }
    @Test
    @Description("Test #3")
    @Severity(SeverityLevel.NORMAL)
    public void search_product_incorrect_value(){
        homepage.click_search()
                .srch_item(incor_product)
                .srch_item_click();
        assertEquals(homepage.srch_pg_input.getText(),warning_text);

    }
    @Test
    @Description("Test #4")
    @Severity(SeverityLevel.NORMAL)
    public void adding_item_to_cart(){
        homepage.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click()
                .wait_add_cart_msg();
        assertTrue(homepage.addtocart_msg.is(Condition.visible));
    }

}
