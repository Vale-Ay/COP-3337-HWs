import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
 public static void main(String args[]) 
 {
        int[] array = new int[10];
   
        Scanner input = new Scanner(System.in);
  
        System.out.println("Enter a list of 5 numbers to determine the largest and smallest number.");
         
        for(int i = 0; i < 5; i++) 
        {
          array[i] = input.nextInt();
        }
   
        int max = array[0];
        int min = array[0];
         
        for(int i = 1; i < 5; i++) 
        {
            if (array[i] > max)
            {
              max = array[i];
            }
           else if (array[i] < min)
            { 
              min = array[i]; 
            }
           
        }
        
        System.out.println("Largest Number: " + max);
        System.out.println("Smallest Number: " + min);
    }
}

