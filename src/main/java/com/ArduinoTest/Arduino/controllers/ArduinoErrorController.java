package com.ArduinoTest.Arduino.controllers;

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

    private ArduinoErrorService arduinoErrorService;

    @PostMapping("/error")
    public ArduinoError newArduinoError(@RequestBody ArduinoErrorData arduinoError) {

        System.out.println("ERROR ERROR ERROR ERROR ERROR ERROR");
        System.out.println(arduinoError.toString());
        System.out.println("ERROR ERROR ERROR ERROR ERROR ERROR");

        return arduinoErrorService.newArduinoError(arduinoError);
    }

}
