/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 * precipitation effect
 * @author Gabl
 */
public class Precipitation extends WeatherEffect {

    public Measurement amount = new Measurement();
    public boolean snow;

    public Precipitation() {  
        amount.setValue(Math.round(Math.random()*8));
        amount.setUnit("cm");
    }
/**
 * checks if there is snow and sets the presence of snow to true/false
 * @param temperature current temperature
 */
    public void setSnow(Measurement temperature) {
        if (temperature.getValue() < 0) {
            snow = true;
        } else {
            snow = false;
        }
    }
/**
 * 
 * @return measurement used to represent change to weather (affect on weather, Celsius) 
 */
    @Override
    public Measurement getWeatherEffect() {
        if (snow) {
            weatherEffect.setValue(-1.5 * amount.getValue());
        } else {
            weatherEffect.setValue(-.9 * amount.getValue());
        }
        return weatherEffect;
    }
/**
 * 
 * @return concatenated string of (precipitation amount, cm), (precipitation amount, in), snow or rain
 */
    @Override
    public String toString() {
        if (snow) {
            return (Math.round(10 * amount.getValue()) + " " + amount.getUnit() + "/" + Math.round(10.0 * amount.getValue() / 2.54)) + "in Snow";
        } else {
            return amount.toString() + "/" + amount.toIN() + " rain";
        }
    }
}
