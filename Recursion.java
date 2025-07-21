import java.util.Scanner;

public class Recursion {

  /*   public static int print(int n)
    { 
        if(n==0)
        return 0;


        else
        {
          return n+print(n-1);
        }
    }*/

  /*   public static int findFactorial(int n)
    {
        if(n==0)
        return 1;
        else
        return n*findFactorial(n-1);
    }*/

    /*public static void fibonacci(int a,int b,int n)
    {
        if(n==0)
        return;
        else
        {
            System.out.print(a+" ");
            fibonacci(b, a+b, n-1);
        }
    }*/
    /*public static long power(int x,int n)
    {
        if(n==0)
        return 1;
        else 
        return x*power(x, n-1);
    }*/

    /*public static long power(int x,int n)
    {
        if(n==0)
        return 1;
        else if(n%2==0)
        return power(x, n/2)*power(x, n/2);
        else
        return x*power(x, n/2)*power(x, n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x=sc.nextInt();
        System.out.println("Enter the power u want to find");
        int n=sc.nextInt();
        System.out.println(x+"^"+n+" = "+power(x, n));
        /*System.out.println("Enter the number u want to find factorial of :");
        int num=sc.nextInt();
        fibonacci(0, 1, num);
        //System.out.println("Factorial is : "+findFactorial(num));
       
       // System.out.println("Sum is : "+print(5));
        
    }*/
    /*public static void towerOfHanoi(int n, String src, String helper, String Destination)
    {
        if(n==1){
        System.out.println("Transferd Disk from "+src+" -------> "+Destination);
        return;
        }

        else{
        towerOfHanoi(n-1, src, Destination, helper);
        System.out.println("Transferd Disk from "+src+" -------> "+Destination);
        towerOfHanoi(n-1, helper, src, Destination);}
    }*/

    /*public static void Reverse(String str,int index)
    {
        if(index<0)
        return;
        else{
            System.out.print(str.charAt(index));
            Reverse(str, index-1);
        }

    }*/


    public static void elementOcuurance(String str,char ch,int index,int fistocc,int lastocc)
    {
        if(index==str.length())
        return;
        else{
            if(ch==str.charAt(index))

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string u want to revers");
        String str=sc.nextLine();
        Reverse(str, str.length()-1);
       // towerOfHanoi(3, "S", "H", "D");
    }
    
}
