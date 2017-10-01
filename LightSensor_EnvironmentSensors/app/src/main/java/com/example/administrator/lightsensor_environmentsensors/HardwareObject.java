package com.example.administrator.lightsensor_environmentsensors;

/**
 * Created by Administrator on 9/20/2017.
 */

public class HardwareObject {
    private String hardware;
    private String hardwareMeaning;

    public HardwareObject(String hardware, String hardwareMeaning) {
        this.hardware = hardware;
        this.hardwareMeaning = hardwareMeaning;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getHardwareMeaning() {
        return hardwareMeaning;
    }

    public void setHardwareMeaning(String hardwareMeaning) {
        this.hardwareMeaning = hardwareMeaning;
    }
}
