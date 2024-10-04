package com.ArduinoTest.Arduino.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ArduinoErrors")
public class ArduinoError {
    @Id
    private String id;
    private int statusCode;
    private String responseString;
    private String dateTime;

    public ArduinoError() {
    }

    public ArduinoError(int statusCode, String responseString, String dateTime) {
        this.statusCode = statusCode;
        this.responseString = responseString;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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

}
