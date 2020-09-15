package com.chnu.javase.ForDemo;

import java.util.Scanner;
import java.lang.Math;

public class CaiShuZi {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        //System.out.println("随机数为："+num);

        for (int i = 0;i<=6;i++){
            System.out.println("请输入一个数字：");
            int a = sc.nextInt();

            if (a < num){
                System.out.println("太小了，再大一点！");
            }
            else if (a>num){
                System.out.println("太大了，再小一点！");
            }
            else{
                System.out.println("恭喜你猜对了！");
                break;
            }
            if (i == 6){
                System.out.println("你的7次答题次数已经用尽！");
            }
        }
    }
}
