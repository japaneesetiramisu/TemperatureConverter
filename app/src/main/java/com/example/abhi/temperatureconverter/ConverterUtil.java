package com.example.abhi.temperatureconverter;

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(float temp) {
        return ((temp - 32) * 5 / 9);
    }

    public static float convertCelsiusToFahrenheit(float temp) {
        return ((temp * 9) / 5) + 32;
    }
}
