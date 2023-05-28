import StepObject.Basketsteps;
import StepObject.HomepageSteps;
import StepObject.InvoiceSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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
    @Description("Test #19")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyName_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.company_name_input.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #20")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyID_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.companyId_input.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #21")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyAddress_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.company_address_input.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #22")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyPhone_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.comapany_phone_input.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #23")
    @Severity(SeverityLevel.NORMAL)
    public void checking_dateReceive_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.date_field.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #24")
    @Severity(SeverityLevel.NORMAL)
    public void checking_email_field(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send();
        assertTrue(invoiceSteps.email_field.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #25")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyName_field1(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_companyName(srch_cat);
        invoiceSteps.click_send()
                .waitColorChange();
        assertFalse(invoiceSteps.company_name_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #26")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantID_field_with_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_text);
        assertNotSame(invoiceSteps.companyId_input.getValue(),companyID_text);
    }
    @Test
    @Description("Test #27")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantID_field_with_less_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_less_digits)
                        .click_send()
                .waitColorChange();
        assertEquals(invoiceSteps.companyId_input.getCssValue("border"),expected_color_for_ID);
    }
    @Test
    @Description("Test #28")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantID_field_with_more_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyID(companyID_more_digits)
                .click_send();
        assertNotSame(invoiceSteps.companyId_input.getValue(),companyID_more_digits);
    }
    @Test
    @Description("Test #29")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantID_field_with_correct_digits(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_companyID(companyID_correct_digits)
                .click_send();
        assertFalse(invoiceSteps.companyId_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #30")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyAddress_correct(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyAddress(srch_cat)
                .click_send();
        assertFalse(invoiceSteps.company_address_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #31")
    @Severity(SeverityLevel.NORMAL)
    public void checking_companyPhone_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(srch_cat);
        assertTrue(invoiceSteps.comapany_phone_input.has(Condition.empty));
    }
    @Test
    @Description("Test #32")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantPhone_less_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_less_digits)
                .click_send()
                .waitColorChange();
        assertEquals(invoiceSteps.comapany_phone_input.getCssValue("border"),expected_color_for_ID);
    }
    @Test
    @Description("Test #33")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantPhone_more_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_more_digits);
        assertNotSame(invoiceSteps.comapany_phone_input.getValue(),companyID_more_digits);
    }
    @Test
    @Description("Test #34")
    @Severity(SeverityLevel.NORMAL)
    public void checking_compantPhone_correct_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.setvalue_companyPhone(companyID_correct_digits)
                .click_send()
                .waitColorChange();
        assertFalse(invoiceSteps.comapany_phone_input.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #35")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_dateReceive_field_less_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_datereceive(srch_cat)
                .click_send();
        assertTrue(invoiceSteps.date_field.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #36")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_dateReceive_correct_symbols(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_datereceive(companyID_text)
                .click_send();
        assertFalse(invoiceSteps.date_field.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #37")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_email_field_correct_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_email(test_email)
                .click_send();
        assertFalse(invoiceSteps.email_field.getTagName().equalsIgnoreCase("style"));
    }
    @Test
    @Description("Test #38")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_email_field_incorrect_text(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_email(incorrect_email)
                .click_send();
        assertTrue(invoiceSteps.email_field.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #39")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_email_field_incorrect_text1(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_email(incorrect_email1)
                .click_send();
        assertTrue(invoiceSteps.email_field.has(Condition.attribute("style")));
    }
    @Test
    @Description("Test #40")
    @Severity(SeverityLevel.CRITICAL)
    public void checking_email_field_incorrect_text2(){
        home_invoice.click_search()
                .srch_item(srch_product)
                .srch_item_click()
                .addtocart_click();
        home_invoice.wait_add_cart_msg();
        basket_invoice.click_cart()
                .cart_continue_click();
        invoiceSteps.click_send()
                .setvalue_email(incorrect_email2)
                .click_send();
        assertTrue(invoiceSteps.email_field.has(Condition.attribute("style")));
    }
}
