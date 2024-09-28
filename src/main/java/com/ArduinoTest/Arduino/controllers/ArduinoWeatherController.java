package com.ArduinoTest.Arduino.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    private ArduinoWeatherService arduinoService;

    @PostMapping("/test")
    public ArduinoWeather addBrightnessToDatabase(@RequestBody ArduinoWeatherData arduinoWeatherData) {

        System.out.println("Detta kom in i requestbody: " + arduinoWeatherData);

        return arduinoService.newArduinoWeatherEntry(arduinoWeatherData);
    }
}
