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
public class Wind {
    public int windDirection;
    public Measurement windSpeed;
    
    public Wind(){
        windDirection=(int)(Math.random()*3);
        windSpeed.setValue((int)Math.round(Math.random()*25));
    }
    public int getWindDirection(){
        return windDirection;
    }
    public int getWindSpeed(){
        return windSpeed.getValue();
    }
}
