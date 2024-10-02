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

    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");

    @Autowired
    private MongoOperations mongoOperations;

    public ArduinoError newArduinoError(ArduinoErrorData arduinoErrorData) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Detta är ERROR dagens datum :" + formatDate.format(dateTime));
        System.out.println("Detta är ERROR tiden just nu : " + formatTime.format(dateTime));

        ArduinoError arduinoError = new ArduinoError(arduinoErrorData.getStatusCode(),
                arduinoErrorData.getResponseString(),
                formatDate.format(dateTime), formatTime.format(dateTime));

        return mongoOperations.save(arduinoError);
    }

}
