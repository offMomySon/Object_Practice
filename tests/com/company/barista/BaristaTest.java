package com.company.barista;

import com.company.coffee.Coffee;
import com.company.coffee.CoffeeInfo;
import com.company.coffee.board.CoffeeMenu;
import com.company.customer.Customer;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

class BaristaTest {

    @Test
    @DisplayName("하이")
    void testMakingCoffeeEnoughMoney() {
        // Given
        Barista barista = new Barista();
        Optional<CoffeeMenu> optionalCoffeeMenu = Optional.of(new CoffeeMenu(CoffeeInfo.CARAMELMACCIATO));
        Customer customer = new Customer(5000, "jihun");

        // When
        Optional<Coffee> optionalCoffee  = barista.makeCoffee(optionalCoffeeMenu, customer);

        // 가급적이면 하나만 써야함.
        // Then
        assertThat(optionalCoffee.get(),samePropertyValuesAs(new Coffee(CoffeeInfo.CARAMELMACCIATO.getName())));
        //junit 5만 쓰기위해.
        //Assert.assertEquals();
    }

    @Test
    void testMakingCoffeeNotEnoughMoney() {
        Barista barista = new Barista();
        Optional<CoffeeMenu> optionalCoffeeMenu = Optional.of(new CoffeeMenu(CoffeeInfo.CARAMELMACCIATO));
        Customer customer = new Customer(1000, "jihun");

        Optional<Coffee> optionalCoffee = barista.makeCoffee(optionalCoffeeMenu, customer);

        Assert.assertFalse(optionalCoffee.isPresent());
    }
}