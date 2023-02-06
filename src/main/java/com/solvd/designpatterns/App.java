package com.solvd.designpatterns;
import com.solvd.designpatterns.interfaces.Button;
import com.solvd.designpatterns.interfaces.CheckBox;
import com.solvd.designpatterns.uifactory.UIFactory;

public class App {
    private Button button;
    private CheckBox checkbox;

    public App(UIFactory factory) {
      button = factory.createButton();
      checkbox = factory.createCheckBox();
    }
    public void click(){
        button.click();
        checkbox.click();
    }
}
