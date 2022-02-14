package com.robustbase.designpatterns.structural.decorator.impl01;

/**
 * @author Atul Dwivedi
 */
public class SMSDecorator extends BaseNotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("Notifying over SMS.");
    }
}
