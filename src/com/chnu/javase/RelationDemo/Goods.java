package com.chnu.javase.RelationDemo;

public class Goods {
    private String name;
    private Double price;

    public Goods() {
    }

    public Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void showGoods(){
        System.out.println("商品名称："+name);
        System.out.println("商品价格："+price);
    }
}
