package com.chnu.javase.SwitchDemo;

import java.util.Scanner;

public class ChengJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入该学生的成绩：");
        int grade = sc.nextInt();

        if (grade<0 || grade >100){
            System.out.println("输入的成绩有误！");
        }
        else{
            switch (grade/10){
                case 10:
                case 9:
                    System.out.println("该学生的成绩为A级");
                    break;
                case 8:
                    System.out.println("该学生的成绩为B级");
                    break;
                case 7:
                    System.out.println("该学生的成绩为C级");
                    break;
                case 6:
                    System.out.println("该学生的成绩为D级");
                    break;
                default:
                    System.out.println("该学生的成绩不及格");
            }
        }
    }
}
