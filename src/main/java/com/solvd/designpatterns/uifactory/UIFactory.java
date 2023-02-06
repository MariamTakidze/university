package com.solvd.designpatterns.uifactory;

import com.solvd.designpatterns.interfaces.Button;
import com.solvd.designpatterns.interfaces.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
