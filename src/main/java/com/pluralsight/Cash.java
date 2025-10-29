package com.pluralsight;

public class Cash extends Asset{
    private double money;

    public Cash(String description, String dateAcquired, double originalCost, double money) {
        super(description, dateAcquired, originalCost);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public double getValue(){
        return 0;
    }
}
