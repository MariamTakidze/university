package com.solvd.designpatterns.uifactory;

import com.solvd.designpatterns.interfaces.Button;
import com.solvd.designpatterns.interfaces.CheckBox;
import com.solvd.designpatterns.os.mac.MacButton;
import com.solvd.designpatterns.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
