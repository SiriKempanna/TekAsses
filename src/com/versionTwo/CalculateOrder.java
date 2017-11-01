package com.versionTwo;

public class CalculateOrder {
    private double totalPrice;
    private double totalTax;

    public CalculateOrder(double total, double totalTax) {
        this.totalPrice = total;
        this.totalTax = totalTax;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
