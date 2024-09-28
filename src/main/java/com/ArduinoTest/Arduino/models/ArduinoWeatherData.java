package com.ArduinoTest.Arduino.models;

public class ArduinoWeatherData {

    private int brightness;
    private int temperature;

    public ArduinoWeatherData() {
    }

    public ArduinoWeatherData(int brightness, int temperature) {
        this.brightness = brightness;
        this.temperature = temperature;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
