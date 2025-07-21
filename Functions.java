import java.security.PublicKey;
import java.util.Scanner;

public class Functions {

    /*  static void namePrint(String name)
    {
        System.out.println("Name is : "+name);
        return;
    }*/

   /*  public static int addTwoNumber(int a,int b)
    {
       // int sum=a+b;
        return a+b;
    }

    public static int productTwoNumber(int a,int b)
    {
       // int sum=a+b;
        return a*b;
    }*/

   /*  public static int findFactorial(int a)
    {
        if(a==1 || a==0)
        return 1;
        else
        return a*findFactorial(a-1);
    }*/

  /*   public static void findPrime(int n)
    {
        int count =0;
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            count++;

        }

            if(count==0)
            System.out.println(" Prime");
            else
            System.out.println("Not Prime");

    }*/

  /*   public static void checkEven(int a)
    {
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        System.out.println("Not Even");
    }
*/

/* public static void printTable(int n)
{
    int p=1;
    while (p<=10) {
        System.out.println(n+" * "+p+" = "+n*p );
        p++;

        
    }


}*/
   /*public static float findAverage(int a, int b , int c)
   {
    return (float)(a+b+c)/3;
   }*/

  /*  public static int findOddSum(int a){
    int sum=0;
    for(int i=1;i<=a;i++)
    {
        if(i%2!=0)
        sum=sum+i;
    }
    return sum;
   }*/

  /*  public static int findGreater(int a, int b)
   {
    if(a>b)
    return a;
    else if(b>a)
    return b;
    else
    return 1;
   }*/

  /*  public static double findCircumference(int a)
   {
    return 2*3.14*a;
   }*/

 /*   public static void eligibleForVote(int age)
   {
    if(age >= 18)
    System.out.println("Eligible for vote");
    else
    System.out.println("Not eligible for vote");
   }*/


  /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Number");
        int a=sc.nextInt();
        do{
            System.out.println(a);
        }while(a>1)
       // eligibleForVote(a);
       // System.out.println("Circumference of "+a+" is : "+findCircumference(a));
        //System.out.println("Sum of all odd numbers is : "+findOddSum(a));
       // int b=sc.nextInt();
        //System.out.println("Greater among two number is : "+findGreater(a, b));
        //int c=sc.nextInt();
       // System.out.println("Average of three Number is : "+findAverage(a, b, c));
       // printTable(a);
      //  checkEven(a);
        //findPrime(a);
       // System.out.println(a+" is : "+findPrime(a));

       /*  int b=sc.nextInt();
        System.out.println("Sum of two number is : "+addTwoNumber(a,b));
        System.out.println("Product of two number is : "+productTwoNumber(a,b));
       // String name=sc.nextLine();
        //namePrint(name);

       // System.out.println("Factorial of number "+a+"! is : "+findFactorial(a));
        System.out.println("Out of function");
    

    }*/
    


 /*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to insert number ? Press Y for yes and N for No :");
        char ch= sc.next().charAt(0);
        int p=0,n=0,z=0;
        while(ch!='N')
        {
            int num=sc.nextInt();
            if(num>0)
            p++;
            else if(num<0)
            n++;
            else
            z++;
            System.out.println("Do you want to insert number ? Press Y for yes and N for No :");
            ch= sc.next().charAt(0);

        }
        System.out.println("Positive count : "+p+"\nNegative Count : "+n+"\nZeros count : "+z);
    }*/

   /*  public static long findPower(int x, int n)
    {
        if (n==0)
        return 1;
        else
        return x*findPower(x, n-1);
    }*/


  /*   public static int GCD(int a,int b)
    {
        int gcd=1;
        if(a>b)
        {
            for(int i=2;i<=b;i++)
            {
                if(a%i==0 && b%i==0)
                {
                    gcd=gcd*i;
                    a=a/i;
                    b=b/i;
                    i=2;
                }
                else
                continue;
            }
        }

        else
        {
            for(int i=2;i<=a;i++)
            {
                if(a%i==0 && b%i==0)
                {
                    gcd=gcd*i;
                    a=a/i;
                    b=b/i;
                    i=2;
                }
                else
                continue;
            
        }
    
    }
    return gcd;
}
*/
/*public static void fibonacci(int n)
{
    int a=0, b=1;
    System.out.print(a+" "+b+" ");
    while(n>2)
    {
        int sum=a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
        n--;
    }

}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
       // int x=sc.nextInt();
        int n=sc.nextInt();
       // fibonacci(n);
        //System.out.println("GCD of two number is : "+GCD(x, n));
       // System.out.println("Power of the number is : "+findPower(x, n));
    }
}
