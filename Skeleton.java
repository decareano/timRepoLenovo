/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimClass;

/**
 *
 * @author mgobelli
 */
public class Skeleton {
    public static void main(String[] args) {
        int[] a1 = {14, 1, 22, 17, 36, 7, -43, 5};
        Skeleton.countInRange(a1, 3, 10);
        
    }

    // trick was to initialize int result to 1 instead of zero
    // but code can be refactored
    
    public static void countInRange(int[] myArr, int min, int max) {
      min = 3;
      max = 10;
      int count = 0;
    
    for (int i = 0; i < myArr.length; i++) {
        if (myArr[i] >= min && myArr[i] <= max) {
            count++;
            
        }
    }
    }
}

