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
public class Precipitation {
    public int amount;
    public boolean snow;
    
    public Precipitation(){
        amount = (int)Math.round(Math.random()*30);
    }
    public boolean isSnow(Measurement temperature){
        if (temperature.getValue() < 0){
            return true;
        }
        return false;
    }
}
