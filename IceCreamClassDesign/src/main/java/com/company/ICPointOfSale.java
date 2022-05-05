package com.company;

public class ICPointOfSale {
    private float costTotal;
    private String flavor;
    private int amountScoops;
    private String toppings;
    private String ingredients;
    private final float costPerScoop = 1.5f;

    public void IceCreamPos(float costTotal, String flavor, int amountScoops, String toppings, String ingredients){
        this.costTotal = costTotal;
        this.flavor = flavor;
        this.amountScoops = amountScoops;
        this.toppings = toppings;
        this.ingredients = ingredients;
    }

    public float iceCreamTotal() {
        costTotal = costPerScoop * amountScoops;
        return costTotal;
    }

    public void receipt () {
        System.out.println("Your Total comes to: " + costTotal);
    }

    public float getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(float costTotal) {
        this.costTotal = costTotal;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getAmountScoops() {
        return amountScoops;
    }

    public void setAmountScoops(int amountScoops) {
        this.amountScoops = amountScoops;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }



}
