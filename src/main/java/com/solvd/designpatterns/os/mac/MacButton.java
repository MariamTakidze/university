package com.solvd.designpatterns.os.mac;

import com.solvd.designpatterns.interfaces.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacButton implements Button {
    private static final Logger LOGGER = LogManager.getLogger(MacButton.class);
    @Override
    public void click() {
        LOGGER.info("MacButton");
    }
}
