package com.company.coffee.board;

import com.company.coffee.CoffeeInfo;

public class CoffeeMenu {
    private CoffeeInfo coffeeInfo;


    public CoffeeMenu() {
    }

    public CoffeeMenu(CoffeeInfo coffeeInfo) {
        this.coffeeInfo = coffeeInfo;
    }

    public int getPrice() {
        return coffeeInfo.getPrice();
    }

    public String getName() {
        return coffeeInfo.getName();
    }
}
