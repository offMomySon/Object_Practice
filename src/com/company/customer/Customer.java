package com.company.customer;

import com.company.barista.Barista;
import com.company.coffee.Coffee;
import com.company.coffee.board.CoffeeMenu;
import com.company.coffee.board.CoffeeMenuBoard;

import java.util.Optional;

public class Customer implements CustomerSay{
    private int money;
    private String name;

    public Customer(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void pay(int coffeePrice) {
        money = money-coffeePrice;
    }

    public String getName() {
        return name;
    }

    public void order(String menuName) throws Exception {
        CoffeeMenu coffeeMenu = new CoffeeMenuBoard().findMenu(menuName);

        Barista barista = new Barista();
        Optional<Coffee> optCoffee = barista.makeCoffee(coffeeMenu ,this);
        if(!optCoffee.isPresent()){
            return;
        }

        Coffee coffee = optCoffee.get();
        sayTasteOfCoffee(getName(), coffee.getName());
    }
}
