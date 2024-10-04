package com.ArduinoTest.Arduino.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.ArduinoTest.Arduino.models.ArduinoError;
import com.ArduinoTest.Arduino.models.ArduinoErrorData;

@Service
public class ArduinoErrorService {

    DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Autowired
    private MongoOperations mongoOperations;

    public ArduinoError newArduinoError(ArduinoErrorData arduinoErrorData) {

        LocalDateTime dateTime = LocalDateTime.now();

        ArduinoError arduinoError = new ArduinoError(arduinoErrorData.getStatusCode(),
                arduinoErrorData.getResponseString(),
                formatDateTime.format(dateTime));

        return mongoOperations.save(arduinoError);
    }

}
