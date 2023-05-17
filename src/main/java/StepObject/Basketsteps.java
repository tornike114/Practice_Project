package StepObject;

import PageObject.BasketPage;

public class Basketsteps extends BasketPage {
    public Basketsteps click_cart(){
        cart_btn.click();
        return this;
    }
    public Basketsteps save_price() {
        price_in_cart = Double.parseDouble(cart_price.innerText().replace(" ","").replace("A",""));
        return this;
    }
    public Basketsteps increase_quantity() {
        cart_plus_btn.click();
        return this;
    }
    public Basketsteps save_quantity() {
        quantity_in_cart = Double.parseDouble(quantity_input.getValue());
        return this;
    }
    public Basketsteps save_sum_price(){
        summed_price = Double.parseDouble(sum_price.getText());
        return this;
    }
}
