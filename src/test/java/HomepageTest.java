import StepObject.HomepageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.HomepageData.srch_product;
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
        sleep(3000);
        assertEquals(homepage.open_srch_out.getValue(),srch_product);
    }

}
