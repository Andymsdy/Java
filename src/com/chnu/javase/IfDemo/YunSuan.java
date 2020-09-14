package com.chnu.javase.IfDemo;

import java.util.Scanner;

public class YunSuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------请输入第一个数字：");
        int a = scanner.nextInt();

        System.out.println("------请输入第二个数字：");
        int b = scanner.nextInt();

        System.out.println("------请输入运算符号：");
        String str = scanner.next();

        if(str.equals("+")){
            System.out.println("------"+a+"+"+b+"="+(a+b));
        }
        else if (str.equals("-")){
            System.out.println("------"+a+"-"+b+"="+(a-b));
        }
        else if (str.equals("*")){
            System.out.println("------"+a+"*"+b+"="+(a*b));
        }
        else if (str.equals("/")){
            System.out.println("------"+a+"/"+b+"="+(a/b));
        }
        else{
            System.out.println("输入的字符有误！");
        }
    }
}