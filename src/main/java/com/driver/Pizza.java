package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    //my code
    private int Vegpizzaprice = 300;
    private int Nonvegpizzaprice = 400;
 private int ExtraCheesePrice = 80;
 private int ExtraToppingsForVegPizza = 70;
 private int ExtraToppingsForNonvegPizza = 120;
 private int PaperbagPrice = 20;
// code
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=Vegpizzaprice;
        else this.price=Nonvegpizzaprice;
    }

    public int getPrice(){
        //my code 
        if(isVeg) this.price=Vegpizzaprice;
        else this.price=Nonvegpizzaprice;
        //my code
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price+=ExtraCheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
        this.price+=ExtraToppingsForVegPizza;
        }
        else 
        {
            this.price+=ExtraToppingsForNonvegPizza;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=PaperbagPrice;
    }

    public String getBill(){
        // your code goes here
        this.bill=Integer.toString(this.price);
        return this.bill;
    }
}
