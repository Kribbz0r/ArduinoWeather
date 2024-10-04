package com.ArduinoTest.Arduino.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ArduinoWeather")
public class ArduinoWeather {

    @Id
    private String id;
    private String brightnessNote;
    private int brightnessValue;
    private String dateTime;
    private int temperature;

    public ArduinoWeather() {
    }

    public ArduinoWeather(String brightnessNote, int brightnessValue, String dateTime,
            int temperature) {
        this.brightnessNote = brightnessNote;
        this.brightnessValue = brightnessValue;
        this.dateTime = dateTime;
        this.temperature = temperature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrightnessNote() {
        return brightnessNote;
    }

    public void setBrightnessNote(String brightnessNote) {
        this.brightnessNote = brightnessNote;
    }

    public int getBrightnessValue() {
        return brightnessValue;
    }

    public void setBrightnessValue(int brightnessValue) {
        this.brightnessValue = brightnessValue;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}
