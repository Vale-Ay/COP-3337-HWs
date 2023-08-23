import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter any positive number: ");
    int num = input.nextInt();
    System.out.println ("Enter start value: ");
    int start = input.nextInt();
    System.out.println ("Enter end value: ");
    int end = input.nextInt();
    
    do 
    {
      System.out.println (num + " x " + start + " = " + (num * start));
      start++;

    } while (start <= end);

  }
}