import java.util.Scanner;

public class Pattern1 {

     /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<row;j++)
            {
                if(i==0 || j==0 || i==(row-1) || j==(row-1))
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }*/

       /*  public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int k=1;
           for(int i=1;i<=num;i++)
           {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                if(k==1)
                k=0;
                else
                k=1;
            }
            System.out.println();
           }
        }*/

      /*   public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            for(int j=num;j>=1;j--)
            {
                for(int i=1;i<=num;i++)
                {
                    if(i>=j)
                    {
                        System.out.print("*");
                    }
                    else
                    System.out.print(" ");
                }
                for(int k=1;k<j;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }*/



       /*  public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int num=sc.nextInt();
            for(int j=1;j<=num;j++)
            {
                int p=j;
                for(int k=num;k>=1;k--)
                {
                    if(k>j)
                    System.out.print(" ");
                    else{
                    System.out.print(p);
                    p--;
                    }
                }
                for(int s=2;s<=j;s++)
                {
                    System.out.print(s);

                }
                System.out.println();
            }
        }*/



      /*   public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int num=sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=num;j++)
                {
                    if(j<=i)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                for(int p=num;p>=1;p--)
                {
                    if(p>i)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int a=num;a>=1;a--)
            {
                for(int b=1;b<=num;b++)
                {
                    if(b<=a)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                for(int c=num;c>=1;c--)
                {
                    if(c<=a)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }*/

       /*  public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                for(int j=num;j>=1;j--)
                {
                    if(j<=i)
                        System.out.print(i+" ");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }*/

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                for(int j=num;j>=1;j--)
                {
                    if(j<=i)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                for(int k=2;k<=num;k++)
                {
                    if(k<=i)
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int p=num;p>=1;p--)
            {
                for(int m=num;m>=1;m--)
                {
                    if(m<=p)
                    System.out.print("*");
                    else
                    System.out.print(" ");

                }

                for(int n=2;n<=p;n++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    } 



    

