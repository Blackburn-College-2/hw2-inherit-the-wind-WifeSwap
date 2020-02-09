/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2weather;

/**
 * values with associated units
 * @author Gabl
 */
public class Measurement {

    public double value;
    public String unit;

    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public Measurement (){
        
    }
    
    /**
     * sets unit
     * @param unit unit to set the current unit to 
     */
    public void setUnit(String unit){
        this.unit = unit;
    }
    /**
     * gets unit
     * @return unit
     */
    public String getUnit(){
        return unit;
    }
    
    /**
     * sets value
     * @param value value to set the current value to 
     */
    public void setValue(double value){
        this.value = value;
    }
    
    /**
     * 
     * @return current value
     */
    public double getValue(){
        return value;
    }
/**
 * 
 * @return string in form "value unit"
 */
    @Override
    public String toString() {
        return Math.round(value) + " " + unit;
    }
    /**
     * treats current measurement as Celsius and concatenates to a Fahrenheit string
     * @return string in form "value unit"
     */
    public String toF(){
      return Math.round(value*9.0/5.0 + 32) + " F";
    }
    /**
     * treats current measurement as kph and concatenates to a mph string
     * @return string in form "value unit"
     */
    public String toMPH(){
        return Math.round(value*1.609) + " mph";
    }
    
    /**
     * treats current string as cm and concatenates to a inch string
     * @return string in form "value unit"
     */
    public String toIN(){
        return Math.round(value/2.54) + " in";
    }

}
