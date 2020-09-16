package com.chnu.javase.MapDemo;

import java.util.HashMap;
import java.util.Set;

public class PersonHashMapTest {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();

        Person p1 = new Person("张三",24,'男');
        Person p2 = new Person("李四",18,'男');
        Person p3 = new Person("王五",20,'男');
        Person p4 = new Person("张三",24,'男');
        Person p5 = new Person("王五",20,'女');

        map.put(p1,p1.getName());
        map.put(p2,p2.getName());
        map.put(p3,p3.getName());
        map.put(p4,p4.getName());
        map.put(p5,p5.getName());

        Set<Person> keys = map.keySet();
        for (Person key : keys) {
            System.out.println("key = "+key+",value = "+map.get(key));
        }
    }
}
