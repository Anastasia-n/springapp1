package ru.nastia.springcourse;

public class Basket {
    private int numberOfItems;
    private double totalCost;

    public Basket(int numberOfItems, double totalCost) {
        this.numberOfItems = numberOfItems;
        this.totalCost = totalCost;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
