import java.util.Scanner;

class New{
    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
         /*System.out.print("Enter the name : ");
         String name=sc.nextLine();
         System.out.println(name);
         char gender=sc.next().charAt(0);
         System.out.println(gender);
         int age=sc.nextInt();
         System.out.println(age);
         double salary=sc.nextDouble();
         System.out.println(salary);
         System.out.println("Name : "+name+" Age : "+age+" Gender : "+gender+" Salary :"+salary);
         if(age>=18)
         {
            System.out.println("Is Adult");
         }
         else
         System.out.println("Not Adult"); */

         System.out.println("Enter a numbers");
         int a=sc.nextInt();
        switch (a) {
         case 1:
            System.out.println("Hello");
            break;
        case 2:
        System.out.println("Namaste");
        break;
        case 3:
        System.out.println("Bonjour");
        break;
         default:
         System.out.println("Wrong number");
            break;
        }
    }

    }
