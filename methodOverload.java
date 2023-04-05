/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class methodOverload {
    public static void main(String[] args) {
        
        System.out.println("5Ft 8 inches = " + convertToCentimeters(5, 8) + "inches");
        System.out.println("68 inches = " + convertToCentimeters(68) + "cm");
    
    }
    public static double convertToCentimeters(int a) {
        return a * 2.54;
    }
    
    public static double convertToCentimeters(int a, int b) {
        //return convertToCentimeters((a * 12) + b);
        
        //or
        int feetToInches = a * 12;
        System.out.println(feetToInches);
        int totalInches = feetToInches + b;
        System.out.println(totalInches);
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
