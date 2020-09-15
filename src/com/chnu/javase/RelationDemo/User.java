package com.chnu.javase.RelationDemo;

public class User {
    private String name;
    private long phone;

    private  Order order;

    public User() {
    }

    public User(String name, long phone, Order order) {
        this.name = name;
        this.phone = phone;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void show(){
        System.out.println("------订单信息如下------");
        System.out.println("姓名："+name);
        System.out.println("手机："+phone);
        order.showOrder();
    }
}
