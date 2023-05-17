package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomepagePage {
    public SelenideElement
    srch_btn = $(".search"),
    open_srch_out = $(byName("search")),
    click_search_icon = $(".search_button"),
    srch_pg_input = $(".search_result"),
    cart_icon = $(by("onclick","updateCartItemColor(1435)")),
    addtocart_msg = $(byText("პროდუქტი წარმატებით დაემატა კალათაში"));

}
