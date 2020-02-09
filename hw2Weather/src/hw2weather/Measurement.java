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
public class Measurement {

    public double value;
    public String unit;

    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public Measurement (){
        
    }
    
    public void setUnit(String unit){
        this.unit = unit;
    }
    
    public String getUnit(){
        return unit;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return Math.round(value) + " " + unit;
    }
    
    public String toF(){
      return Math.round(value*9.0/5.0 + 32) + " F";
    }
    
    public String toMPH(){
        return Math.round(value*1.609) + " mph";
    }
    
    public String toIN(){
        return Math.round(value/2.54) + " in";
    }

}
