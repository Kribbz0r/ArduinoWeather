package com.ArduinoTest.Arduino.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ArduinoErrors")
public class ArduinoError {
    @Id
    private String id;
    private int statusCode;
    private String responseString;
    private String date;
    private String time;

    public ArduinoError() {
    }

    public ArduinoError(int statusCode, String responseString, String date, String time) {
        this.statusCode = statusCode;
        this.responseString = responseString;
        this.date = date;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
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
