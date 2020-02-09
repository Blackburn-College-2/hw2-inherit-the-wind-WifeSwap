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
public class Precipitation extends WeatherEffect {

    public int amount;
    public boolean snow;

    public Precipitation() {
        amount = (int) Math.round(Math.random() * 30);
    }

    public void setSnow(Measurement temperature) {
        if (temperature.getValue() < 0) {
            snow = true;
        } else {
            snow = false;
        }
    }

    @Override
    public Measurement getWeatherEffect(){
        if (snow) {
            weatherEffect.setValue(5);
        }
        return weatherEffect;
    }
}
