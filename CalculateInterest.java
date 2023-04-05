/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class CalculateInterest {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calInt(10000, rate);
            System.out.println("10000 at " + rate + "% interest = " + interestAmount);
        }
        
        for (double rate = 7.5; rate <= 10; rate += .25) {
            double intAmount = calInt(100, rate);
            System.out.println("100 dollars at " + rate + "%interest = " + intAmount);
        }
    }
        
        public static double calInt(double amount, double interestRate) {
            return (amount * (interestRate / 100));
        }
        
        
    }
    

