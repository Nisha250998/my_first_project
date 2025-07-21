import java.util.Scanner;

/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Pattern -1
       
      /*   for(int i=0;i<4;i++)
        {
            for(int p=0;p<=4;p++)
            {
                if(p==0 || p==4 || i==0 || i==3)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();

        }  */

        // Pattern - 2
       /*  for (int i=4;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }   */

     //Pattern - 3
    /*   System.out.println("Enter the number of rows");
      int row=sc.nextInt();
      for (int j=row;j>=1;j--)
      {
        for (int i=1;i<=row;i++)
        {
            if (i>=j)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
      } */


     //Pattern - 4

    /*  System.out.println("Enter the Number of rows");
     int row=sc.nextInt();
     for (int i=1;i<=row;i++)
     {
        for (int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
     }  */

     //Pattern - 5

    /*System.out.println("Enter the number of rows");
    int row=sc.nextInt();
    for (int i=row; i>=1;i--)
    {
        for (int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    } */

    //Pattern - 6
   /*  System.out.println("Enter the number of rows");
    int row=sc.nextInt();
    int p=1;
    for (int i=1;i<=row;i++)
    {
        for (int j=1;j<=i;j++)
        {
            System.out.print(p+" ");
            p++;
        }
        System.out.println();
    } */

    //Pattern - 7
   /*  System.out.println("Enter the number of rows");
    int row=sc.nextInt();
    int p;
    for (int i=1;i<=row;i++)
    {
        if (i%2 ==0)
        p=0;
        else
        p=1;
        for (int j=1;j<=i;j++)
        {
            System.out.print(p+" ");
            if(p==1)
            p=0;
            else
            p=1;
        }
        System.out.println();
    }*/




    }
}