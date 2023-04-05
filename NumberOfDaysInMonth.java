/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
            isLeapYear(2500);
            System.out.println(getDaysInMonth(2, 1600));
    }
       
    public static boolean isLeapYear (int year) {
       //combine validation and testing together  
         return (year >= 1 && year <= 9999) && (year % 400 == 0 
                        || year % 100 != 0 && year % 4 == 0); 
    }

    public static int getDaysInMonth(int month, int year) {
      if (month < 1 || month > 12 || year < 1 || year > 9999) {
         return -1;
      } 
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
      
    }
    
}
