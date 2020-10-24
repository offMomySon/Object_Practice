package com.company.barista;

import com.company.coffee.Coffee;
import com.company.coffee.board.CoffeeMenu;
import com.company.customer.Customer;
import com.sun.istack.internal.NotNull;

import java.util.Optional;

public class Barista implements BaristaSay{

    // optional 로 주는게 좋은지 아니면 빈리스트로 주는게 좋은지?
    // optional 때문에 코드 간결성이 사라지는것 같다.
    public Optional<Coffee> makeCoffee(CoffeeMenu  coffeeMenu, @NotNull Customer customer){
        if(isNotEnoughMoney(coffeeMenu.getPrice(), customer)){
            return Optional.empty();
        }

        calculateMoney(coffeeMenu.getPrice(), customer);

        return Optional.of(new Coffee(coffeeMenu.getName()));
    }

    private boolean isNotEnoughMoney(int coffeePrice, Customer customer){

        if(coffeePrice > customer.getMoney()){
            sayDeneyOrderByNotEnoughCoffee();
            return true;
        }
        return false;
    }

    private void calculateMoney(int coffeePrice ,Customer customer){
        customer.pay(customer.getMoney() - coffeePrice);
    }
}
