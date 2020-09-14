package com.chnu.javase.IfDemo;

import java.util.Scanner;

public class JiPiao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入订票日期：");
        Double data=sc.nextDouble();

        System.out.println("请输入机票定价：");
        Double price=sc.nextDouble();

        if ((data>=1.1 & data<=1.3)||(data>=5.1 & data<=5.3)||(data>=10.1 & data<=10.7)){
            System.out.println("机票无优惠,定价为："+price);
        }
        else{
            Double q=0.8*price;
            System.out.println("机票有优惠,定价为："+q);
        }
    }
}
