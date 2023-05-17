package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {
    public SelenideElement
    cart_btn = $(".header_cart"),
    header_name = $(byText("დასახელება")),
    header_colour = $(byText("ფერი"), 0),
    header_code = $(byText("კოდი"), 0),
    header_quantity = $(byText("რაოდენობა")),
    header_price = $(byText("ფასი"),0),
    header_sum = $(byText("ფასი"),0),
    quantity_input = $(".inputvalue"),
    cart_plus_btn = $(".fa-plus"),
    cart_price = $(".prod_price",0),
    sum_price = $(".fullPriceFor");

   public Double price_in_cart,
           summed_price,
           quantity_in_cart;
}
