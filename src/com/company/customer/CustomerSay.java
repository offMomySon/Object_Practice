package com.company.customer;

// 인터페이스 굳이?
public interface CustomerSay {

    // 좀더 개선할 수 있는가?
    default void sayTasteOfCoffee(String customerName, String coffeeName){
        System.out.println(customerName+":음~ 이 맛은 " + coffeeName +"맛이야~ 맛있는걸");
    }
}
