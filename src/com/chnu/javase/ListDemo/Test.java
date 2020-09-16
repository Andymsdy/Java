package com.chnu.javase.ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        User u1 = new User("张三","a123456");
        User u2 = new User("李四","b123456");
        User u3 = new User("王五","c123456");
        User u4 = new User("小明","d123456");
        User u5 = new User("小张","e123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        A:for(int i = 0;i<3;i++){
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();

            B:for (User user : list) {
                if (name.equals(user.getAdmin()) && pwd.equals(user.getPassword())){
                    System.out.println("恭喜你，登录成功！");
                    flag = true;
                    break A;
                }
            }
            System.out.println("用户名或密码错误，请重试！");
        }

        if(!flag){
            System.out.println("登陆失败，请下次再来！");
        }
    }

}
