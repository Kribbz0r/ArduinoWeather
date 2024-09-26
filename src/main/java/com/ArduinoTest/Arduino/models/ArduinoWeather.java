package com.ArduinoTest.Arduino.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "ArduinoWeather")
public class ArduinoWeather {

    @Id
    private String id;
    private String brightnessNote;
    private int brightnessValue;
    private String date;
    private String time;

    public ArduinoWeather() {
    }

    public ArduinoWeather(String brightnessNote, int brightnessValue, String date,
            String time) {
        this.brightnessNote = brightnessNote;
        this.brightnessValue = brightnessValue;
        this.date = date;
        this.time = time;
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
}
