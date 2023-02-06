package com.solvd.designpatterns;

import com.solvd.designpatterns.uifactory.MacUIFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        App application
                = new App(new MacUIFactory());
        application.click();
    }
}
