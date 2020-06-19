package com.practice.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(1,2);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
