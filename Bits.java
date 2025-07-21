import java.util.Scanner;

public class Bits {

/*     public static int getBit(int n,int pos)
    {
        int a=0001<<(pos-1);
        int txt=a&n;
        System.out.println(txt);
        if(txt==0)
        return 0;
        else 
        return 1;
    }

    public static int UpdateBitMask(int n,int pos,int oper)
    {
        int bitmask=1<<(pos-1);
        int fin=0;
        if(oper==1)
        {
             fin=bitmask | n;
        }
        else{
            int notbitmask= ~(bitmask);
            System.out.println(notbitmask);
             fin=notbitmask & n;
             System.out.println(fin);
        }
        return fin;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number , position and operation");
        int num = sc.nextInt();
        int pos=sc.nextInt();
        int oper=sc.nextInt();
       // System.out.println(getBit(num, pos));
        System.out.println(UpdateBitMask(num,pos,oper));
    }*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to check ");
        int num=sc.nextInt();
        int number=num;
        int flag=0;
        while (num>1) {
            if(num%2==0)
            {
                num=num/2;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(number+" is a power of 2");
        }
        else
        System.out.println(number+" is not a power of 2");
    }
    
}
