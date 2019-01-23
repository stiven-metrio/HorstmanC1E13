/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #13
 * Write a program that prints a lottery combination, picking six 
 * distinct numbers between 1 and 49. To pick six distinct numbers, 
 * start with an array list filled with 1...49. Pick a random index 
 * and remove the element. Repeat six times. Print the result in sorted order.
 */
package java_ex13_arraylottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author jhonatan
 */
public class Java_Ex13_ArrayLottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an Array List to save possible results.
        ArrayList<String> lotteryNumbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++){
            lotteryNumbers.add((String.valueOf(i)));
        }
        System.out.println(lotteryNumbers);
        
        // Take six random numbers and save them in another ArrayList
        ArrayList<String> result = new ArrayList<>();
        Random random = new Random();
        int r;
        for (int i=0;i<=5;i++){
            r = random.nextInt(49-i)+1;
            result.add((String.valueOf(lotteryNumbers.get(r-1))));
            lotteryNumbers.remove(r-1);
            System.out.println(r);
        }
        System.out.println(result);
        // System.out.println(lotteryNumbers);
        
        // Sort result
    }
    
}
