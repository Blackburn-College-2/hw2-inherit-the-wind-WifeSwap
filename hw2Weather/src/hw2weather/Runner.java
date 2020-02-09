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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Day day1 = new Day();
        System.out.println("Day 1:" + day1);
        Day day2 = new Day(day1.today);        
        System.out.println("Day 2:" + day2);        
        Day day3 = new Day(day2.today);        
        System.out.println("Day 3:" + day3);
        Day day4 = new Day(day3.today);        
        System.out.println("Day 4:" + day4);        
        Day day5 = new Day(day4.today);        
        System.out.println("Day 5:" + day5);
    }
    
}
