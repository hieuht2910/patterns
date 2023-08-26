package com.hieu.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello world!");
        Singleton anotherSingleton = Singleton.getInstance("Hello galaxy!");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        // Value should be
        // Hello world!
        // Hello world!
    }
}
