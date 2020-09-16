package com.chnu.javase.SetDemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("abc");
        set.add("acd");
        set.add("abd");

        for (String s : set) {
            System.out.println("s = "+s);
        }
    }
}
