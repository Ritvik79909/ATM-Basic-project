package project;
import java.util.Scanner;
public class UserInterface {
    private static int status;
    public static void main(String[] args) {
        AtmOperationImpl imp = new AtmOperationImpl();
        Scanner sc = new Scanner(System.in);
        int atmnumber=123456;
        int atmpin=123;
        System.out.println("WELCOME TO ATM MACHINE");
        System.out.println("ENTER THE ATM NUMBER");
        int atmnum2 = sc.nextInt();
        System.out.println("ENTER THE ATM PIN");
        int atmpin2 = sc.nextInt();
        if(atmnumber==atmnum2 && atmpin==atmpin2){
            while(true){
        System.out.println("1.viewBalance\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewministatement\n 5.exit");
        System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            if(ch==1){
                imp.viewBalance();
            }else if(ch==2){
                System.out.println("enter the amout to withdraw");
                double withdrawamount=sc.nextDouble();
                imp.withdrawAmount(withdrawamount);
            }else if(ch==3){
                System.out.println("Enter the amount to deposit");
                double depositeamount=sc.nextDouble();
                imp.depositAmount(depositeamount);
            }else if(ch==4){
                imp.viewMiniStatement();
            }else if(ch==5){
                System.out.println("collect your card\n Thankyou");
                System.exit(status);
            }
        }
        }else{
        System.out.println("INCORRECT ATM NUMBER OR PIN");
        }
    }  
}
