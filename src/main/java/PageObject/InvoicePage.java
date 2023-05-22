package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class InvoicePage {
    public SelenideElement
    invoice_send_btn = $("#btn2"),
    company_name_input = $(by("name","name")),
    companyId_input = $(by("name","personalId")),
    company_address_input = $(byName("address")),
    comapany_phone_input = $(byName("phone")),
    date_field = $(byName("date")),
    email_field = $(byName("email"));
}
