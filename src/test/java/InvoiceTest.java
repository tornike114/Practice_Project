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
    @Test  /*id 19*/
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
    @Test   /*id 20*/
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
    @Test /*id 21*/
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
    @Test /*id 22*/
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
    @Test /*id 23*/
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
    @Test /*id 24*/
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
    @Test /*id 25*/
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
        assertFalse(invoiceSteps.companyId_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test /*id 26*/
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
    @Test /*id 27*/
    public void checking_compantID_field_with_less_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_less_digits)
                        .click_send()
                .waitColorChange();
        assertEquals(invoiceSteps.companyId_input.getCssValue("border"),expected_color_for_ID);
    }
    @Test /*id 28*/
    public void checking_compantID_field_with_more_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_more_digits)
                .click_send();
        assertNotSame(invoiceSteps.companyId_input.getValue(),companyID_more_digits);
    }
    @Test /*id 29*/
    public void checking_compantID_field_with_correct_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_companyID(companyID_correct_digits)
                .click_send();
        assertFalse(invoiceSteps.companyId_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test /*id 30*/
    public void checking_companyAddress_correct(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyAddress(srch_cat)
                .click_send();
        assertFalse(invoiceSteps.companyId_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test /*id 31*/
    public void checking_companyPhone_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(srch_cat);
        assertTrue(invoiceSteps.comapany_phone_input.has(Condition.empty));
    }
    @Test /*id 32*/
    public void checking_compantPhone_less_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_less_digits)
                .click_send()
                .waitColorChange();
        assertEquals(invoiceSteps.comapany_phone_input.getCssValue("border"),expected_color_for_ID);
    }
    @Test /*id 33*/
    public void checking_compantPhone_more_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_more_digits);
        sleep(3000);
        assertNotSame(invoiceSteps.comapany_phone_input.getValue(),companyID_more_digits);
    }
    @Test /*id 34*/
    public void checking_compantPhone_correct_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_correct_digits)
                .click_send()
                .waitColorChange();
        assertFalse(invoiceSteps.comapany_phone_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test /*id 35*/
    public void checking_dateReceive_field_less_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_datereceive(srch_cat)
                .click_send();
        assertTrue(invoiceSteps.date_field.has(Condition.attribute("style")));
        System.out.println(invoiceSteps.date_field);
    }





}
