import java.util.Scanner;
import java.lang.Math;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter the starting number divisible by 2");
		int start = input.nextInt();
		System.out.println("Enter the ending number divisible by 2");
		int end = input.nextInt();
    System.out.println("");

		for (int i = start; i <= end; i += 2)
    {
      System.out.println("");
      System.out.println(i);

      System.out.println("log("+ i + ") = " + Math.log(i));

      System.out.println(i +" * log("+ i + ") = " + i * Math.log(i));
			
      System.out.println("log("+ i + "^2) = " + Math.pow(i,2));
	
      System.out.println("log("+ i + "^3) = " + Math.pow(i,3));
			
		}
  }
}