package com.ArduinoTest.Arduino.models;

public class ArduinoWeatherData {

    private String brightness;
    private int temperature;

    public ArduinoWeatherData() {
    }

    public ArduinoWeatherData(String brightness, int temperature) {
        this.brightness = brightness;
        this.temperature = temperature;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
