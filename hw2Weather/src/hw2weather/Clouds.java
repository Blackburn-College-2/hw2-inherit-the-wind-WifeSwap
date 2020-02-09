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
public class Clouds extends WeatherEffect {

    public int cloudType;
    public String cloudTypeName;

    public Clouds() {      
        cloudType = (int) (Math.random() * 4);
    }
    
    @Override
    public Measurement getWeatherEffect() {
        if (cloudType == 0) {
            weatherEffect.setValue(6);
        } else if (cloudType == 1) {
            weatherEffect.setValue(3);
        } else if (cloudType == 2) {
            weatherEffect.setValue(-3);
        } else {
            weatherEffect.setValue(-14);
        }
        return weatherEffect;
    }
    @Override
    public String toString(){
        
        if (cloudType == 0) {
            cloudTypeName="None";
        } else if (cloudType == 1) {
            cloudTypeName="Light";
        } else if (cloudType == 2) {
            cloudTypeName="Medium";
        } else {
            cloudTypeName="Heavy";
        }
        return cloudTypeName;    
    }
}
