package com.ArduinoTest.Arduino.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ArduinoWeather")
public class ArduinoWeather {

    @Id
    private String id;
    private String brightnessNote;
    private int brightnessValue;
    private String date;
    private String time;
    private int temperature;

    public ArduinoWeather() {
    }

    public ArduinoWeather(String brightnessNote, int brightnessValue, String date,
            String time, int temperature) {
        this.brightnessNote = brightnessNote;
        this.brightnessValue = brightnessValue;
        this.date = date;
        this.time = time;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
