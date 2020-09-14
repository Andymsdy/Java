package com.chnu.javase.IfDemo;

import java.util.Scanner;

public class RuWu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入性别：");
        String sex = sc.next();

        System.out.println("请输入年龄：");
        int a = sc.nextInt();

        System.out.println("请输入身高：");
        Double b = sc.nextDouble();

        if (sex.equals("男")) {
            if (b >= 170 && a >= 20 & a <= 26) {
                System.out.println("符合入伍条件！");
            } else {
                System.out.println("不符合入伍条件！");
            }
        } else if (sex.equals("女")) {
            if (b >= 162 && a >= 20 & a <= 22) {
                System.out.println("符合入伍条件！");
            } else {
                System.out.println("不符合入伍条件！");
            }
        }
        else{
            System.out.println("输入的性别有误！");
        }
    }
}