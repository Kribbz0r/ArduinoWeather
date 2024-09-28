package com.ArduinoTest.Arduino.models;

public class ArduinoWeatherData {

    private String brightness;
    private String temperature;

    public ArduinoWeatherData() {
    }

    public ArduinoWeatherData(String brightness, String temperature) {
        this.brightness = brightness;
        this.temperature = temperature;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

}
