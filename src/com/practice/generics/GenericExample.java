package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        //Generic help is achieving Type Safety
        List aList = new ArrayList();
        aList.add("String");
        aList.add(1);
        System.out.println(aList);
        List<String> aList2 = new ArrayList<>();
        aList2.add("String");
        //aList2.add(1);
        GenericExample genericExample = new GenericExample();
        genericExample.testGenericMethod();

        genericExample.testVarArgs("abc","def","ghi");
        genericExample.testVarArgs("12","34");

    }

    private void testGenericMethod(){
        Integer intArr[] = {1,2,3,4,5};
        Character chArr[] = {'a','b','c'};
        Boolean boolArr[] = {true , false , false};

        List<Integer> intList = arrayToList(intArr);
        System.out.println(intList);
        //No errors at compile time but will throw errors at if used Object
        //As soon as generic method is used, it throws an error at complie time
        //List<String> stringList = arrayToList(intArr);
        List<Integer> stringList = arrayToList(intArr);
        System.out.println(stringList.get(0));
    }

    //Old method where generics were not used
    /*
    private static List arrayToList(Object arr[]){
        List<Object> list = new ArrayList();
        for(Object o : arr){
            list.add(o);
        }
        return list;
    }
    */
    private static <T> List<T> arrayToList(T arr[]){
        List<T> list = new ArrayList();
        for(T o : arr){
            list.add(o);
        }
        return list;
    }

    private void testVarArgs(String... a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}
