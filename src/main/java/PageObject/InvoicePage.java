package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class InvoicePage {
    public SelenideElement
    invoice_send_btn = $("#btn2"),
    required_filed_red = $(by("style","border: 1px solid red;")),
    company_name_input = $(by("name","name")),
    personal_id_input = $(by("name","personalId"));
}
