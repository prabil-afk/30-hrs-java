import java.util.Scanner;
public class atm{
    public static void main(String[]args)
    {
        char bankname='X' ,customer='Y';
        int D_amount,W_amount,Balance=50000;
        System.out.println("press 1::deposite 2::withdraw 3::balance");
        Scanner sc=new scanner(System.in);
        int choice=sc.nextInt();
        Swtich(choice)
        {
            case 1:
           System.out.println("welcome to +bankname");
           System.out.println("Account of +customer");
           System.out.println("please enter amount to deposite");
           D_amount=sc.nextInt();
           balance=balance +D_amount;
           System.out.println(" your new banalce is"+balance);
           break;
           case 2:
           System.out.println("welcome to " +bankname);
           System.out.println("amount of"+customer);
           System.out.println("please enter amount to "+balance);
           W_amount=sc.nextInt();
           if(W_amount>balance)
           {
               System.out.println("insufficient balance");
           

