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
public class Wind extends WeatherEffect {
    public int windDirection;
    public Measurement windSpeed;
    
    public Wind(){
        windDirection=(int)(Math.random()*2)+1;
        windSpeed.setValue((int)Math.round(Math.random()*25));
        windSpeed.setUnit("kph");
    }
    public int getWindDirection(){
        return windDirection;
    }
    public double getWindSpeed(){
        return windSpeed.getValue();
    }
    
    @Override
    public Measurement getWeatherEffect(){
        if(windDirection == 1){
            weatherEffect.setValue(windSpeed.getValue()*-.65);
        }else{
            weatherEffect.setValue(windSpeed.getValue()*.5);
        }
        return weatherEffect;
    }
}
