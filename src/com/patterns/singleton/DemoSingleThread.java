package com.patterns.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was refused (yay!)"
        +"\n"
        +"If you see different values, then 2 singleton were created (booo!!!)"
        +"\n"
        +"RESULT" + "\n");
        Singleton singleton = Singleton.getInstance("foo");
        Singleton anotherSingleton=Singleton.getInstance("bar");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
