package model;

import static model.constants.Colour.COLOR_RED;
import static model.constants.Discount.DISCOUNT_RED;
import static model.constants.Discount.DISCOUNT_NEWER;

public class Apple extends Food {
    String colour;

    public Apple(double priceApple, int amountApple, String colourApple) {
        super(priceApple, amountApple, true);
        this.colour = colourApple;
    }

    @Override
    public double getDiscount() {
        if (COLOR_RED.equals(colour)) {
            return DISCOUNT_RED;
        }
        return DISCOUNT_NEWER;
    }
}








