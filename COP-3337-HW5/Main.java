import java.util.Scanner;
 
class Main
{
 public static void main(String[] args)
 {
   int a [][] = new int [3][3];
   int b [][] = new int [3][3];
  
   Scanner input = new Scanner (System.in);
 
   for (int x = 0; x < 3; x++)
   {
     for (int y = 0; y < 3; y++)
     {
       System.out.printf ("Enter Value for a [%d][%d]:" , x , y);
       a[x][y] = input.nextInt();
     }
   }
  
   for (int x = 0; x < 3; x++)
    {
     for (int y = 0; y < 3; y++)
     {
       System.out.printf ("Enter Value for b [%d][%d]:" , x , y);
       b[x][y] = input.nextInt();
     }
   
 int c [][] = new int [3][3];
  for (int i = 0; i < 3; i++) //Rows
   {
     for (int j = 0; j < 3; j++) //Columns
     {
       c[i][j] = 0;
       for (int k = 0; k < 3; k++)
       {
         c[i][j] += a[i][k] * b[k][j];
       }
       System.out.print(c[i][j] + " ");
     }
     System.out.println();
   }
 }
}
}

