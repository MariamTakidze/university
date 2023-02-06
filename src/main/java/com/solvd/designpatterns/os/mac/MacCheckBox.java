package com.solvd.designpatterns.os.mac;

import com.solvd.designpatterns.interfaces.CheckBox;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacCheckBox implements CheckBox {
    private static final Logger LOGGER = LogManager.getLogger(MacCheckBox.class);
    @Override
    public void click() {
        LOGGER.info("Mac Checkbox");
    }
}
