package com.solvd.designpatterns.os.windows;

import com.solvd.designpatterns.interfaces.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WindowsButton implements Button {
    private static final Logger LOGGER = LogManager.getLogger(WindowsButton.class);
    @Override
    public void click() {
        LOGGER.info("Windows Button");
    }
}
