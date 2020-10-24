package com.company;

import com.company.customer.Customer;
import com.sun.istack.internal.NotNull;

public interface OrderSay {
    default void sayOrderRequest(){
        System.out.print("주문 음료 입력(ex: 아메리카노) : ");
    }

    default void sayRequestedOrder(@NotNull Customer customer, String requestedCoffeeName){
        System.out.println("손님("+ customer.getName()+ ",소지금 " + customer.getMoney()+"원) - " + requestedCoffeeName + "선택, " + requestedCoffeeName + "주문" );
    }

    default void sayRequestResultInfo(@NotNull Customer customer){
        System.out.println("남은돈 : 손님("+ customer.getName()+ ",소지금 " + customer.getMoney()+"원)");
    }
}
