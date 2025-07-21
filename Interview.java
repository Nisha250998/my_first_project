import java.util.Arrays;
import java.util.Scanner;

public class Interview {
    public static int fibonacci(int n,int a,int b)
    {
        if(n==0)
        return 0;
        else{
            System.out.print(a+" ");
            return fibonacci(n-1,b,a+b);

        }
    }

    public static void stringCount(String str)
    {
        int count=0, i=0;
        while(i<str.length())
        {
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z'))
            {
                count++;
            }
            i++;

        }
        System.out.println(count);
    }
    public static void stringWordCount(String str)
    {
        long count=Arrays.stream(str.split("\\s")).count();
        System.out.println(count);
    }
    public static int[] sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void median(int arr[])
    {
        int len=arr.length;
        if(len%2==0)
        {
            int med=len-1;
            int num1=arr[med/2];
            int num2=arr[len/2];
            double median=(double)((num1+num2)/2.0);
            System.out.println(median);
        }
        else{
            System.out.println((arr[len/2]));
        }
    }

    public static void permutate(String str, String permutate)
    {
        
        if(str.length()==0)
        {
            System.out.println(permutate);
            return;
        }
        else{
            for(int i=0;i<str.length();i++)
            {
                char initial=str.charAt(i);
                String new_str=str.substring(0, i)+str.substring(i+1);
                permutate(new_str,permutate+initial);
            }
        }
    }

    public static void towerOfHanoi(int n,String source,String Helper,String Destination)
    {
        if(n==1)
        {
            System.out.println(" Transferring disk from source : "+source+" --------> "+Destination);
            return;
        }
        else
        {
            towerOfHanoi(n-1, source, Destination, Helper);
            System.out.println("Transferring disk from source : "+source+" ---------> "+Destination);
            towerOfHanoi(n-1,Helper,source, Destination);

        }
    }

    public static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is : "+a+"\nValue of b is : "+b);
    }
    public static int reverse(int num,int reverse)
    {
        if(num==0){
       // System.out.println(reverse);
        return reverse;
        }
        else{
           return reverse(num/10,reverse*10+(num%10));
        }


    }
    public static StringBuilder reverseString(String str)
    {
        int i=0;
        int j=str.length()-1;
        StringBuilder sb=new StringBuilder(str);
        //System.out.println("String before reverse is : "+sb);
        while(i<j)
        {
            char ch=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        return sb;
       // System.out.println("String post reverse is : "+sb);
    }
    public static String reverseString2(String str)
    {
        String new_str="";
      //  System.out.println("String before reverse is : "+str);
        for(int j=str.length()-1;j>=0;j--)
        {
            new_str=new_str+str.charAt(j);
        }
        //System.out.println("String post reverse is : "+new_str);
        return new_str;
    }
    public static void pallidrome(int num,int rev)
    {
        if(num==rev)
        {
            System.out.println("Given number is pallidrome");
        }
        else
        System.out.println("Given number is not a pallidrome");
    }
    public static void pallidromeString(String str,String rev)
    {
      //  StringBuilder sb=new StringBuilder(str);
        if(str.equals(rev))
        System.out.println("Pallidrome");
        else
        System.out.println("Not Pallidrome");
    }
    public static int digitCount(int num,int count)
    {
        if(num==0)
        return count;
        else
        {
            //count=count+1;
        return digitCount(num/10, count+1);
        }
    }
    public static void countEvenOrOdd(int n,int even,int odd)
    {
        if(n==0)
        {
            System.out.println("Number of even digits are : "+even);
            System.out.println("Number of odd digits are : "+odd);
        }
        else{
        int num=n%10;
        if(num%2==0)
        {
            countEvenOrOdd(n/10, even+1, odd);
        }
        else
        countEvenOrOdd(n/10, even, odd+1);
    }

    }
    public static void digitSum(int n,int sum)
    {
        if(n==0)
        {
            System.out.println("Digit sum is : "+sum);
            return;
        }
        else{
            digitSum(n/10, sum+(n%10));
        }
    }
    public static void largestOfThree(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            System.out.println("First Number is largest");
            else
            System.out.println("Third number is largest");
        }
        else
        {
            if(b>c)
            System.out.println("Second number is largest");
            else
            System.out.println("Third Number is largest");
        }
    }
    public static void largestOfThree2(int a,int b,int c)
    {
        int large=((a>b?a:b)>c?(a>b?a:b):c);
        System.out.println("Largest of all three Number is : "+large);
    }
    public static void checkPrime(int num)
    {
        int count=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            count++;
            else
            continue;
        }
        if(count>0)
        System.out.println("Given Number : "+num+" is not Prime");
        else
        System.out.println("Given number : "+num+ " is Prime");

    }
    public static void findFactorial(int n)
    {
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of : "+n+" is : "+fact);
    }
    public static int findArraySum(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void printEvenOrOddFromArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" is : Even");
            }
            else{
                System.out.println(arr[i]+" is Odd");
            }
        }
    }

    public static boolean checkTwoArrayEqual(int arr1[],int arr2[])
    {
        boolean status=Arrays.equals(arr1, arr2);
       /*  boolean status =true;
        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    status=false;
                    break;
                }
            }

        }
        else
        status=false;*/
        return status;
    }

    public static void duplicateElementsInAnArray(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                count++;
            }
            if(count>0)
            System.out.println(arr[i]+ " has duplicate values");
            //else
            //System.out.println(arr[i]+" doesn't have duplicate values");
        }
    }

    public static void missingNumberInArray(int arr[], int start,int end)
    {
        int sum1=0;
        int sum2=(((arr.length)+1)*(start+end))/2;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];

        }
        System.out.println("Missing Number in the array is : "+(sum2-sum1));
    }

    public static void findMaximumAndMinimumInArray(int arr[])
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println("Maximum element is : "+max+"\nMinimum Element is : "+min);
    }
    public static int linerSearch(int arr[],int num)
    {
        int pos=-1;
        for(int i=0;i<arr.length;i++)
        {
            if ((arr[i]==num)) 
            {
                pos=i+1;
                break;
            }
        }
        return pos;
    }

    public static int matrixTotalPath(int m, int n,int i,int j)
    {
        if(i==m || j==n)
        return 0;
        if(i==(m-1) && j==(n-1))
        {
            return 1;
        }
            int downcount = matrixTotalPath(m, n, i+1, j); 
            int rightcount= matrixTotalPath(m, n, i, j+1);
            int count=downcount+rightcount;
            return count;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(matrixTotalPath(m, n, 0, 0));
        /*System.out.println("Enter number of elements in an Array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements in the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number u want to search : ");
        int num=sc.nextInt();
        if(linerSearch(arr, num)==-1)
        {
            System.out.println("Number is not present ");
        }
        else
        System.out.println("Number is present in position : "+linerSearch(arr, num));
        //findMaximumAndMinimumInArray(arr);
        /*System.out.println("Enter the start range : ");
        int start=sc.nextInt();
        System.out.println("Enter the end range : ");
        int end=sc.nextInt();
        //System.out.println("Enter number of elements in the array");
        int n=end-start;
        int arr[]=new int[n];
       // String str[]=new String[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           // str[i]=sc.next();
        }
        missingNumberInArray(arr, start, end);
        //duplicateElementsInAnArray(str);

        /*System.out.println("Enter Numbers of elements in the array1");
        int a=sc.nextInt();
        int arr1[]=new int[a];
        System.out.println("Enter the elements in the array1");
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();

        }
        System.out.println("Enter Numbers of elements in the array2");
        int b=sc.nextInt();
        int arr2[]=new int[b];
        System.out.println("Enter the elements in the array2");
        for(int j=0;j<b;j++)
        {
            arr2[j]=sc.nextInt();

        }
        if(checkTwoArrayEqual(arr1, arr2))
        {
            System.out.println("Two arrays are equal");
        }
        else
        System.out.println("Two arrays are not equal");


        //printEvenOrOddFromArray(5);
        //System.out.println("Sum of elemets of the array is : "+findArraySum(arr));
        //findFactorial(a);
        //checkPrime(a);
        //int b=sc.nextInt();
        //int c=sc.nextInt();
        /*largestOfThree(a, b, c);
        largestOfThree2(a, b, c);
        //System.out.println("Enter the number u want to check digit count");
        //int num=sc.nextInt();
       // digitSum(num, 0);
        //countEvenOrOdd(num, 0, 0);
        //int count=digitCount(num, 0);
        //System.out.println("Number of digits is : "+count);
       /*  System.out.println("Enter the string u want to check");
        String str=sc.nextLine();
        String rev=reverseString2(str);
        pallidromeString(str, rev);
        /*System.out.println("Enter the number you want to check");
        int a=sc.nextInt();
        int rev=reverse(a, 0);
        pallidrome(a, rev);

     //   System.out.println("Enter the String u want to reverse");
     //   String str=sc.nextLine();
      //  reverseString2(str);
      //  System.out.println("Enter two numbers : ");
      //  int a=sc.nextInt();
       // reverse(a, 0);
        //int b=sc.nextInt();
       // swap(a, b);
      //  System.out.print("Enter the number of disk in tower : ");
      //  int n=sc.nextInt();
        //towerOfHanoi(n, "S", "H", "D");
       // System.out.println("Enter the string to find permutation");
       // String str=sc.next();
       // permutate(str, "");
        /*System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sortarr[]=sort(arr);
        //Arrays.sort(arr);
        median(sortarr);
       

        //String str=sc.nextLine();
       // stringWordCount(str);
        //System.out.println("Enter the count of elements u want to print");
        //int n=sc.nextInt();
        //fibonacci(n,0,1);*/
        
    }
    
}
