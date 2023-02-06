package com.solvd.designpatterns.os.windows;

import com.solvd.designpatterns.interfaces.CheckBox;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WindowsCheckBox implements CheckBox {
    private static final Logger LOGGER = LogManager.getLogger(WindowsCheckBox.class);
    @Override
    public void click() {
        LOGGER.info("Windows Checkbox");
    }
}
