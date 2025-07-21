import java.io.*;
import java.util.Scanner;

public class FirstClass {

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows to print");
      int num=sc.nextInt();
      for(int i=0;i<num;i++)
      {
        for(int j=0;j<=i;j++)
        {
          System.out.print("* ");
        }
        System.out.println();
      }
    }

}
