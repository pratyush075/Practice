package com.practice.functionalProgrammingLambdas;

public class Greet{

    public static void main(String[] args) {

        //Normal way of implementation . Anonymous classes.
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("GREET "+name);
            }
        };

        gm.greet("Pratyush");

        //Using Lambda expressions
        // Pass te variables in () brackets
        GreetingMessage gm2 = (String name) -> {
            System.out.println("GREET "+name);
        };

        gm2.greet("Pratyush");
    }
}
