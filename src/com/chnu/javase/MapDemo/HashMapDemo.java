package com.chnu.javase.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 111);
        map.put("abd", 222);
        map.put("abe", 333);
        map.put("abd", 444);

        //Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("键："+entry.getKey()+"，值："+entry.getValue());
        }

        System.out.println("------------");
        //Set<K> keySet()
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            System.out.println("key = "+key+"，value"+map.get(key));
        }

        System.out.println("------------");
        //Collection<V> values()
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = "+value);
        }

    }
}
