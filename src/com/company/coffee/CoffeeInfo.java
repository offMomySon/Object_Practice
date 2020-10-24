package com.company.coffee;

public enum CoffeeInfo {

    AMERICANO(1500,"아메리카노"),
    CAPPUCCINO(2000,"카푸치노"),
    CARAMELMACCIATO(2500,"카라멜 마키아또"),
    ESPRESSO(2500,"에스프레소");

    private int price;
    private String name;

    CoffeeInfo(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void showList(){
        StringBuffer stringBuffer = new StringBuffer();

        for(CoffeeInfo coffeeInfo: values()){
            stringBuffer.append("커피:" + coffeeInfo.getName()+ ", 가격:" + coffeeInfo.getPrice()+ "\n" );
        }

        System.out.println(stringBuffer);
    }
}
