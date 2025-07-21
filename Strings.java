import java.util.Scanner;

public class Strings {
   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName="Nisha Agarwal";
        String lastName="Nisha";
        String str ="123";
        int num2=2345;
        String str2=Integer.toString(num2);
        System.out.println(str2);
        int num=Integer.parseInt(str);
        System.out.println(num);
        System.out.println(firstName.substring(6,9));
      /*   if(firstName == lastName)
        {
            System.out.println("Equal");
        }
        else if(firstName.compareTo(lastName)< 0)
        {
            System.out.println("First Name is smaller");
        }
        else
        System.out.println("First name is larger");
      /*   String finalName=firstName+" "+lastName;
        String name = "Nisha Agarwal";
        System.out.println(name.length());
        for(int i=0;i<name.length();i++)
        System.out.println(name.charAt(i));
        if(finalName == name)
        System.out.println(name);
        else if (finalName.equals(name))
        System.out.println("Equal");
        else
        System.out.println("Not equal");*/
    //}


  /*   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of number of strings");
        int count=sc.nextInt();
        String [] name=new String[count];
        int len=0;
        System.out.println("Enter the names");
        for(int i=0;i<count;i++)
        {

            name[i]=sc.next();
            len=len+name[i].length();
        }
        System.out.println("Total length = "+len);
        
    }*/




   /*  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String result="";
        int i=0;
        while(name.charAt(i)!='@')
        {
            result=result+name.charAt(i);
            i++;
        }
        System.out.println(result);
    }  */


    // String Builder ---------->


   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        sb.insert(2, 'A');
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.append(" Agarwal");
        System.out.println(sb);
    }*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
