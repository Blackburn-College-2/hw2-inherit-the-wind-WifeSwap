/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 * abstract class used to give weatherEffects the getWeatherEffect method
 * @author Gabl
 */
public abstract class WeatherEffect {
    Measurement weatherEffect;
    
    public WeatherEffect(){
        weatherEffect = new Measurement(0, "C");
    }
    
    public abstract Measurement getWeatherEffect();
    
}
