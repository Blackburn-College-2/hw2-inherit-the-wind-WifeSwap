/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 * Wind effect
 * @author Gabl
 */
public class Wind extends WeatherEffect {
    public int windDirection;
    public Measurement windSpeed = new Measurement();
    
    public Wind(){
        windDirection=(int)(Math.random()*2)+1;
        windSpeed.setValue((int)Math.round(Math.random()*25));
        windSpeed.setUnit("kph");
    }
    /**
     * 
     * @return int value used to represent wind direction
     */
    public int getWindDirection(){
        return windDirection;
    }
    /**
     * 
     * @return measurement associated with wind speed (wind speed, kph)
     */
    public double getWindSpeed(){
        return windSpeed.getValue();
    }
    /**
     * 
     * @return measurement used to represent change to weather (affect on weather, Celsius) 
     */
    @Override
    public Measurement getWeatherEffect(){
        if(windDirection == 1){
            weatherEffect.setValue(windSpeed.getValue()*-.65);
        }else{
            weatherEffect.setValue(windSpeed.getValue()*.5);
        }
        return weatherEffect;
    }
    /**
     * 
     * @return Concatenated string of (wind speed, kph), (wind speed, mph)  and direction
     */
    @Override
    public String toString(){
        if(windDirection == 1){
        return windSpeed.toString() + "/" + windSpeed.toMPH()+ " N";
        }else{
            return windSpeed.toString() + "/" + windSpeed.toMPH()+ " S";
        }
    }
}
