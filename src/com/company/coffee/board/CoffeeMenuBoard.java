package com.company.coffee.board;

import com.company.coffee.CoffeeInfo;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class CoffeeMenuBoard {
    private List<CoffeeMenu> coffeeMenus;

    public CoffeeMenuBoard() {
        coffeeMenus = new ArrayList<>();

        coffeeMenus = stream(CoffeeInfo.values())
                .map(CoffeeMenu::new)
                .collect(Collectors.toList());
    }

    // 람다 슈거 문법
    public CoffeeMenu findMenu(@NotNull String menuName) throws Exception{
        return coffeeMenus
                .stream()
                .filter(coffeeMenu -> (menuName.equals(coffeeMenu.getName()))  )
                .findFirst()
                .orElseThrow(Exception::new);
    }
}
