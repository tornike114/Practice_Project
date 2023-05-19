import StepObject.Basketsteps;
import StepObject.HomepageSteps;
import StepObject.InvoiceSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.HomepageData.srch_product;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.AssertJUnit.*;

public class InvoiceTest extends ChromeRunner {
    Basketsteps basket_invoice = new Basketsteps();
    HomepageSteps home_invoice = new HomepageSteps();
    InvoiceSteps invoiceSteps = new InvoiceSteps();
    @Test
    public void checking_companyName_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.company_name_input.has(Condition.attribute("style")));
    }




}
