package com.company.barista;

public interface BaristaSay {
    default void sayDeneyOrderByAbsenceOfCoffee(){
        System.out.println("바리스타 :손님 그런 커피는 없어요~");
    }
    default void sayDeneyOrderByNotEnoughCoffee(){
        System.out.println("바리스타 :손님 돈이 모자라시네요 소지금이 적어 주문하실 수 없어요~");
    }
}
