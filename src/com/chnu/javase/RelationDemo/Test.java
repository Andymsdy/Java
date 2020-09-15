package com.chnu.javase.RelationDemo;

public class Test {


    public static void main(String[] args) {
        Goods g1 = new Goods("牛奶", 28.5);
        Goods g2 = new Goods("饼干", 12.5);
        Goods[] g = {g1, g2};

        Order order  = new Order("S10247", g);

        User u1 = new User("张三", 123456, order);

        u1.show();
    }
}
