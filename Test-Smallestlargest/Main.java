import java.util.Arrays;
import java.util.Scanner;
public class Main
{ 
public static void main(String args[]) {
        int count, max, min, i;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        //System.out.println("Enter number of elements");
        //count = in.nextInt();
        System.out.println("Enter elements");
         
        for(i = 0; i < 5; i++) {
            inputArray[i] = in.nextInt();
        }
   
        max = min = inputArray[0];
         
        for(i = 1; i < 5; i++) {
            if(inputArray[i] > max)
                max = inputArray[i];
            else if (inputArray[i] < min)
                min = inputArray[i];
                
        }
        
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
}


