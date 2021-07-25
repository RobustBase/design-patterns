package com.robustbase.designpatterns.creational.abstractfactory.impl01;

/**
 * @author Atul Dwivedi
 */
public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("WindowsButton is drawn.");
    }
}
