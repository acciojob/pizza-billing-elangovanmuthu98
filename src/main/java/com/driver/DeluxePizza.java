package com.driver;

public class DeluxePizza extends Pizza {

       private int ExtraToppingsForVegPizza = 70;
 private int ExtraToppingsForNonvegPizza = 120;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraToppings();
      
        if(isVeg)
        super.price+=this.ExtraToppingsForVegPizza;
        else super.price+=this.ExtraToppingsForNonvegPizza;
            
    }
}
