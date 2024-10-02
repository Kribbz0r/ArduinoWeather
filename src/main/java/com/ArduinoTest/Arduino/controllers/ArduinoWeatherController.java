package com.ArduinoTest.Arduino.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ArduinoTest.Arduino.models.ArduinoWeather;
import com.ArduinoTest.Arduino.models.ArduinoWeatherData;
import com.ArduinoTest.Arduino.services.ArduinoWeatherService;

@RestController
@CrossOrigin("*")
public class ArduinoWeatherController {

    @Autowired
    private ArduinoWeatherService arduinoWeatherService;

    @GetMapping("/getWeatherData")
    public List<ArduinoWeather> getArduinoWeatherData() {
        return arduinoWeatherService.getArduinoWeatherData();
    }

    @PostMapping("/test")
    public ArduinoWeather addBrightnessToDatabase(@RequestBody ArduinoWeatherData arduinoWeatherData) {

        System.out.println("SWEET SWEET SWEET SWEET SWEET SWEET");
        System.out.println(arduinoWeatherData.toString());
        System.out.println("SWEET SWEET SWEET SWEET SWEET SWEET");

        return arduinoWeatherService.newArduinoWeatherEntry(arduinoWeatherData);
    }

}
