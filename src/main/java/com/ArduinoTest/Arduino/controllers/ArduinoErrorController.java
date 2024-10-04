package com.ArduinoTest.Arduino.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ArduinoTest.Arduino.models.ArduinoError;
import com.ArduinoTest.Arduino.models.ArduinoErrorData;
import com.ArduinoTest.Arduino.services.ArduinoErrorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
public class ArduinoErrorController {

    @Autowired
    private ArduinoErrorService arduinoErrorService;

    @PostMapping("/error")
    public ArduinoError newArduinoError(@RequestBody ArduinoErrorData arduinoErrorData) {

        return arduinoErrorService.newArduinoError(arduinoErrorData);
    }

}
