package com.company;

public class ICFactory {
    private int amountPints;
    private String flavor;
    private float costTotal;
    private final float costPerPint = 4;

    public int getAmountPints() {
        return amountPints;
    }

    public void setAmountPints(int amountPints) {
        this.amountPints = amountPints;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(float costTotal) {
        this.costTotal = costTotal;
    }

    public ICFactory(int amountPints, String flavor, float costTotal) {
        this.amountPints = amountPints;
        this.flavor = flavor;
        this.costTotal = costTotal;
    }

    public float costIC() {
        costTotal = amountPints * costPerPint;
        return costTotal;
    }

    public void receipt() {
        System.out.println("Your Total Comes Out To: " + costTotal);
    }


}
