/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 *
 * @author Gabl
 */
public class Day {

    public Weather today;
    public Weather yesterday;

    public boolean hasYesterday;

    public Day() {
        today = new Weather();
        today.morningTemperature.setUnit("C");
        today.middayTemperature.setUnit("C");
    }

    public Day(Weather yesterday) {
        today = new Weather();
        this.yesterday = yesterday;
        hasYesterday = true;
        today.morningTemperature.setUnit("C");
        today.middayTemperature.setUnit("C");
    }

    public Measurement getMorningTemperature() {
        if (hasYesterday) {
            yesterday.precipitation.setSnow(yesterday.middayTemperature);
            today.morningTemperature.setValue(yesterday.middayTemperature.getValue()
                    + yesterday.wind.getWeatherEffect().getValue()
                    + yesterday.precipitation.getWeatherEffect().getValue());
        } else {
            today.morningTemperature.setValue((Math.random() * 35) + 5);
        }
        return today.morningTemperature;
    }

    public Measurement getMiddayTemperature() {
        today.middayTemperature.setValue(today.morningTemperature.getValue() + today.clouds.getWeatherEffect().getValue());
        today.precipitation.setSnow(today.middayTemperature);

        return today.middayTemperature;
    }

    public String toString() {
        getMorningTemperature();
        getMiddayTemperature();
        return (("\nMorning Temperature: " +  today.morningTemperature + "/ " + today.morningTemperature.toF()) + "\n"
                + "Clouds: " + today.clouds.toString() + "\n"
                + "Midday Temperature: " + today.middayTemperature + "/ " + today.middayTemperature.toF() + "\n"
                + "Precipitation: " + today.precipitation + "\n"
                + "Wind: " + today.wind + "\n");
    }
;
}
