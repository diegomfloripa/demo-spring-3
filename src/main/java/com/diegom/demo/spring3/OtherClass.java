package com.diegom.demo.spring3;

import org.slf4j.LoggerFactory;

public class OtherClass {

    public boolean isValid(Integer value) {
        if(value == null) {
            LoggerFactory.getLogger(this.getClass()).error("valeu is null");
            throw new RuntimeException("valeu is null");
        }
        return value > 0;
    }

    public boolean isInvalid(Integer value) {
        if(value == null) {
            LoggerFactory.getLogger(this.getClass()).error("valeu is null");
            throw new RuntimeException("valeu is null");
        }
        return value == 0;
    }

    public boolean isNull(Integer value) {
        return value == null;
    }
}
