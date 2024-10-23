package com.abhishek.java.collectionapi;


import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.get(3);

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list.stream().map(i->i*2).toList());
        System.out.println(list1);
        list1.get(3);

        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(list1.stream().map(i->i*2).toList());
        System.out.println(collection);

        //like set in python
        HashSet<Integer> hashSet = new HashSet<>(); //Hashset doesn't have any order
        hashSet.addAll(collection);
        System.out.println(hashSet);

        Map<Integer,String> map = new HashMap<>(); // like a dictionary in python
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map.get(2));
        System.out.println(map);

    }
}
