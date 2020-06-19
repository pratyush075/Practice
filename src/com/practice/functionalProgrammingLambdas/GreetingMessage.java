package com.practice.functionalProgrammingLambdas;

@FunctionalInterface
public interface GreetingMessage {

   public abstract void greet(String name);
}
