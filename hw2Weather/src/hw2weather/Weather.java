/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 * weather class
 * @author Gabl
 */
public class Weather {
    public Clouds clouds;
    public Wind wind;
    public Precipitation precipitation;
    public Measurement morningTemperature = new Measurement();
    public Measurement middayTemperature = new Measurement();
    
    public Weather(){
        clouds = new Clouds();
        wind = new Wind();
        precipitation = new Precipitation();
    }
}
