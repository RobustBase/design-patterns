package com.robustbase.designpatterns.creational.factory.impl04;

/**
 * @author Atul Dwivedi
 */
public abstract class Laptop {
    public abstract Laptop createLaptop();

    public abstract void start();

    public abstract void operate();

    public abstract void shutDown();
}
