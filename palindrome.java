import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args)
    {
     Scanner ok=new Scanner(System.in);  
     System.out.println("enter a number to check ");
     int num=ok.nextInt();
     int number=0,r ;
     int ori_num=num;
     while(num>0)
     {
         r=num%10;
         num=num/10;
         number=number*10+r;
        }
        if(ori_num==number)
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("not");
    }
    }
}



         
         
         
         
