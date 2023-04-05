/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class SumPlusDigit {
    public static void main(String[] args) {
       isPalindrome(121);
        
    }
   
    public static boolean isPalindrome(int number) {
       if (number < 0) {
          number *= -1;
       }
       int rev_new_num = 0; 
       int numStorage = number;
       // need a variable to compare the original number
       // to reverse number
       while (numStorage > 0) {
                int lastDigit = numStorage % 10;
                rev_new_num = (rev_new_num * 10) + lastDigit;
                System.out.println(rev_new_num);
                numStorage = numStorage / 10;
               
       } 
       if (number == rev_new_num) {
          
       return true;
       } else {
          return false;
       }
       
    }
    
}