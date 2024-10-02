package com.ArduinoTest.Arduino.models;

public class ArduinoErrorData {

    private int statusCode;
    private String responseString;

    public ArduinoErrorData() {
    }

    public ArduinoErrorData(int statusCode, String responseString) {
        this.statusCode = statusCode;
        this.responseString = responseString;
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
