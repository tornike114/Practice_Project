package StepObject;

import PageObject.InvoicePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class InvoiceSteps extends InvoicePage {
    @Step("clicking send button on invoice section")
    public InvoiceSteps click_send(){
        invoice_send_btn.click();
        return this;
    }
    @Step("setting value for companyName {srch}")
    public InvoiceSteps setvalue_companyName(String srch){
        company_name_input.setValue(srch);
        return this;
    }
    @Step("wait for change color")
    public synchronized InvoiceSteps waitColorChange() {
        try {
            wait(1000);
        } catch (InterruptedException colorchange) {
        }
        return this;
    }
    @Step("setting value for companyiD {text}")
    public InvoiceSteps setvalue_companyID(String text){
        companyId_input.setValue(text);
        return this;
    }
    @Step("setting value for companyAddress {text1}")
    public InvoiceSteps setvalue_companyAddress(String text1){
        company_address_input.setValue(text1);
        return this;
    }
    @Step("setting value for companyPhone {text1}")
    public InvoiceSteps setvalue_companyPhone(String text1){
        comapany_phone_input.setValue(text1);
        return this;
    }
    @Step("setting value for date receive {text2}")
    public InvoiceSteps setvalue_datereceive(String text2){
        date_field.setValue(text2);
        return this;
    }
    @Step("setting value for email {text2}")
    public InvoiceSteps setvalue_email(String text2){
        email_field.setValue(text2);
        return this;
    }





}
