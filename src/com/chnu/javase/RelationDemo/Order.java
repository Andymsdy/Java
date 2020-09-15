package com.chnu.javase.RelationDemo;

public class Order {
    private String num;
    private Goods[] g;

    public Order() {
    }

    public Order(String num, Goods[] g) {
        this.num = num;
        this.g = g;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Goods[] getG() {
        return g;
    }

    public void setG(Goods[] g) {
        this.g = g;
    }

    public void showOrder(){
        System.out.println("订单号："+num);
        System.out.println("------商品信息如下------");
        for (int i = 0;i<g.length;i++){
            g[i].showGoods();
            System.out.println("------------");
        }
    }
}
