package com.company;

import com.company.coffee.CoffeeInfo;
import com.company.customer.Customer;

import java.util.Scanner;

public class App implements OrderSay{

    private Customer customer;
    private Scanner sc;

    public App() {
        customer = new Customer(5000, "Json");
        sc = new Scanner(System.in);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void play() {
        while(true) {
            CoffeeInfo.showList();
            String coffeeName = inputOrderFromCLI();
            customer.order(coffeeName);
            sayRequestResultInfo(getCustomer());
        }
    }

    // 단일 책임원칙에 위배되는가? .. 클래스에만 적용되는건가?
    // 메서드 이름과 다르게 request 요청하는 부분도 있어서 걱정.
    // 단일 책임 원칙(single responsibility principle)이란 모든 클래스는 하나의 책임만 가지며, 클래스는 그 책임을 완전히 캡슐화해야 함을 일컫는다.
    // 커피를 받을 거란걸 모르것같다.
    private String inputOrderFromCLI(){
        sayOrderRequest();

        String coffeeName =  sc.nextLine();

        sayRequestedOrder(customer, coffeeName);

        return coffeeName;
    }

}
