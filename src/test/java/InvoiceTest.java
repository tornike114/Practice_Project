import StepObject.Basketsteps;
import StepObject.HomepageSteps;
import StepObject.InvoiceSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static DataObject.HomepageData.srch_product;
import static DataObject.InvoiceData.*;
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
    @Test
    public void checking_companyID_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.companyId_input.has(Condition.attribute("style")));
    }
    @Test
    public void checking_companyAddress_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.company_address_input.has(Condition.attribute("style")));
    }
    @Test
    public void checking_companyPhone_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.comapany_phone_input.has(Condition.attribute("style")));
    }
    @Test
    public void checking_dateReceive_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.date_field.has(Condition.attribute("style")));
    }
    @Test
    public void checking_email_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.email_field.has(Condition.attribute("style")));
    }
    @Test
    public void checking_companyName_field1(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_companyName(srch_cat);
        invoiceSteps.click_send()
                .waitColorChange();
        assertEquals(expected_colour,invoiceSteps.company_name_input.getCssValue("border"));
    }
    @Test
    public void checking_compantID_field_with_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_text);
        assertNotSame(invoiceSteps.companyId_input.getValue(),companyID_text);
    }
    @Test
    public void checking_compantID_field_with_less_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_less_digits)
                        .click_send();
                /*.waitColorChange();*/
        /*sleep(2000);*/
        assertEquals(invoiceSteps.companyId_input.getCssValue("border"),expected_color_for_ID);
        System.out.println(invoiceSteps.companyId_input);
    }





}
