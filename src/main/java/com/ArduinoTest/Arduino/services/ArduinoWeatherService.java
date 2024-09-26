package com.ArduinoTest.Arduino.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.ArduinoTest.Arduino.models.ArduinoWeather;

@Service
public class ArduinoWeatherService {

    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");

    @Autowired
    private MongoOperations mongoOperations;

    public ArduinoWeather newArduinoWeatherEntry(int brightnessFromArduinoAsInt) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Detta är dagens datum :" + formatDate.format(dateTime));
        System.out.println("Detta är tiden just nu : " + formatTime.format(dateTime));

        String brightnessNote = setBrightnessNote(brightnessFromArduinoAsInt);
        System.out.println("Jag är brightnessNote:  " + brightnessNote);

        ArduinoWeather arduinoWeather = new ArduinoWeather(brightnessNote, brightnessFromArduinoAsInt,
                formatDate.format(dateTime), formatTime.format(dateTime));

        return mongoOperations.save(arduinoWeather);
    }

    public String setBrightnessNote(int brightnessFromArduinoAsInt) {

        String brightnessNote = "";

        if (brightnessFromArduinoAsInt < 100) {
            brightnessNote = ("It's extermly bright");
        } else if (brightnessFromArduinoAsInt < 300) {
            brightnessNote = ("It's very bright");
        } else if (brightnessFromArduinoAsInt < 500) {
            brightnessNote = ("It's bright");
        } else if (brightnessFromArduinoAsInt < 700) {
            brightnessNote = ("It's dark");
        } else if (brightnessFromArduinoAsInt < 900) {
            brightnessNote = ("It's very dark");
        } else if (brightnessFromArduinoAsInt >= 900) {
            brightnessNote = ("It's extremly dark");
        }

        return brightnessNote;

    }

}
