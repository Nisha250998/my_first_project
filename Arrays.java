import java.util.Scanner;

public class Arrays {
   /*  public static void main(String[] args) {
        int index =0;
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of subjects ");
        int n=sc.nextInt();
        System.out.println("Enter the marks of each subject");
        int marks[]= new int[n];
        for(int j=0;j<marks.length;j++)
        {
            marks[j]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search : ");
        int num=sc.nextInt();
        int tmp=0;
        //int index;
        for (int p=0;p<n;p++){
            if(marks[p]==num)
            {
                index=p;
                tmp=1;
                break;
            }

        }
        if(tmp==1)
        {
            System.out.println("Found Number in : "+index+" position");
        }
        else{
            System.out.println("Number not found");
        }
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println("Min : "+min+"\nMax : "+max);
        //System.out.println(marks[p]);
    }*/



   /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of names u want to enter");
        int size=sc.nextInt();
        String name[]=new String[size];
        System.out.println("Enter the names :");
      //  System.out.println(name.length);
        for(int i=0;i<size;i++)
        name[i]=sc.next();
        System.out.println("Names entered are : ");
        for(int j=0;j<name.length;j++)
        {
            System.out.println(name[j]);
        }
    }*/


   /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<num.length;i++)
        num[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max)
            max=num[i];
            if (num[i]<min) 
            {
              min=num[i];  
            }
        }
        System.out.println("Min value : "+min+"\nMax Value : "+max);
    }*/


   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns ");
        int row=sc.nextInt();
        int columns=sc.nextInt();
        int number[][]=new int[row][columns];
        System.out.println("Enter the number in the array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            number[i][j]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int rw=0,clm=0,count=0;
        for(int p=0;p<row;p++)
        {
            for(int q=0;q<columns;q++)
            {
                if(number[p][q]==num)
                {
                    rw=p;
                    clm=q;
                    count=1;
                    break;
                }
            }
        }
        if(count==1)
        {
            System.out.println("Number :"+num+" fount at : "+rw+" , "+clm);
        }
        else{
            System.out.println("Number not found");
        }

    }*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and colums");
        int row=sc.nextInt();
        int columns=sc.nextInt();
        int number[][]=new int[row][columns];

        System.out.println("Enter the numbers in the matrix :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                number[i][j]=sc.nextInt();
            }
        }
        int rowstart=0;
        int rowend=row-1;
        int columnstart=0;
        int columnend=columns-1;

        while (rowstart<=rowend && columnstart<=columnend) {
            for(int i=columnstart;i<=columnend;i++)
            {
                System.out.print(number[rowstart][i]+" ");
            }
            rowstart++;
            for(int j=rowstart;j<=rowend;j++)
            {
                System.out.print(number[j][columnend]+" ");
            }
            columnend--;
            for(int p=columnend;p>=columnstart;p--)
            {
                System.out.print(number[rowend][p]+" ");
            }
            rowend--;
            for(int q=rowend;q>=rowstart;q--)
            {
                System.out.print(number[q][columnstart]+" ");
            }
            columnstart++;
        }
    }
}
