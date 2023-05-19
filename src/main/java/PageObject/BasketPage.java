package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Selectors.by;
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
    cart_minus_button = $(".fa-minus"),
    cart_price = $(".prod_price",0),
    cart_x_btn=$(".delete_item"),
    cart_empty_text = $(byText("კალათა ცარიელია")),
    clear_cart_btn = $(".clear_btn",1),
    cart_icon1 = $(by("onclick","updateCartItemColor(1488)")),
    item_in_cart = $(".cartItem"),
    cart_continue_btn = $(".continue"),
    iur_person = $("#pis"),
    fiz_person = $("#iur"),
    sum_price = $(".fullPriceFor");



   public Double price_in_cart,
           summed_price;

}
