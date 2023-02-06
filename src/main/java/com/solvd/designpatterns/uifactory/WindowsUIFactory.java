package com.solvd.designpatterns.uifactory;

import com.solvd.designpatterns.interfaces.Button;
import com.solvd.designpatterns.interfaces.CheckBox;
import com.solvd.designpatterns.os.windows.WindowsButton;
import com.solvd.designpatterns.os.windows.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
