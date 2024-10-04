package com.ArduinoTest.Arduino.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.ArduinoTest.Arduino.models.ArduinoWeather;
import com.ArduinoTest.Arduino.models.ArduinoWeatherData;

@Service
public class ArduinoWeatherService {

    DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Autowired
    private MongoOperations mongoOperations;

    public List<ArduinoWeather> getArduinoWeatherData() {

        return mongoOperations.findAll(ArduinoWeather.class);
    }

    public ArduinoWeather newArduinoWeatherEntry(ArduinoWeatherData arduinoWeatherData) {
        LocalDateTime dateTime = LocalDateTime.now();

        String brightnessNote = setBrightnessNote(arduinoWeatherData.getBrightness());

        ArduinoWeather arduinoWeather = new ArduinoWeather(brightnessNote, arduinoWeatherData.getBrightness(),
                formatDateTime.format(dateTime), arduinoWeatherData.getTemperature());

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
