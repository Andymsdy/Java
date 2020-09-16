package com.chnu.javase.SetDemo;

import java.util.HashSet;

public class PersonHashSetTest {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("张三",24,'男');
        Person p2 = new Person("李四",18,'男');
        Person p3 = new Person("王五",20,'男');
        Person p4 = new Person("张三",24,'男');
        Person p5 = new Person("王五",20,'女');

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        for (Person person : set) {
            System.out.println(person);
        }
    }
}
