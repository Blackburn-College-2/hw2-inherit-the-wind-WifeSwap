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

    /**
     * sets current morning temperature based on yesterday midday temperature and weather phenomenons (if yesterday's weather class was passed in when making today) 
     * or
     * sets current morning temperature to a random value (if yesterday's weather class wasn't passed in when making today)
     * @return Measurement of current morning temperature
     */
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
/**
 * sets current morning temperature based on earlier temperature and weather phenomenons (clouds)
 * sets snow to true or false based on temperature
 * @return Measurement of current midday temperature
 */
    public Measurement getMiddayTemperature() {
        today.middayTemperature.setValue(today.morningTemperature.getValue() + today.clouds.getWeatherEffect().getValue());
        today.precipitation.setSnow(today.middayTemperature);

        return today.middayTemperature;
    }

    /**
     * 
     * @return concatenated string that can be seen in the souts in runner
     */
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
