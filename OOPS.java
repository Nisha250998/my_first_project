import java.util.Scanner;

class Student{
    String name;
    int age;
    int marks;

    public void getInfo()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Marks : "+this.marks);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        System.out.println("Enter student info : ");
        s1.name=sc.nextLine();
        s1.age=sc.nextInt();
        s1.marks=sc.nextInt();
        s1.getInfo();
    }
    
}
