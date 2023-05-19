package StepObject;

import PageObject.InvoicePage;

public class InvoiceSteps extends InvoicePage {
    public InvoiceSteps click_send(){
        invoice_send_btn.click();
        return this;
    }
    public InvoiceSteps fss(){
        invoice_send_btn.click();
        return this;
    }


}
