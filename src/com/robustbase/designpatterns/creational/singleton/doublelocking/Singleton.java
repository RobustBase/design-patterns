package com.robustbase.designpatterns.creational.singleton.doublelocking;

/**
 * @author Atul Dwivedi
 * @date 03/07/21
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void doSomething() {
    }
}
