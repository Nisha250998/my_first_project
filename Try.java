import java.util.Scanner;

/**
 * Try
 */
public class Try {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.print("Enter the number : ");
       int num=sc.nextInt();
       while(num==1)
       {
        System.out.print("Enter the marks : ");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("This is Good");
        }
        else if (marks<=89 && marks >=60 ) {
            System.out.println("This is also Good");;
            
        }
        else
        System.out.println("This is Good as well");
        System.out.print("Enter the number : ");
        num=sc.nextInt();
       }
    }
}