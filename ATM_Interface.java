import java.util.*;
/*
        String user_id="User";
        String user_password= "12345";
 */
public class ATM_Interface {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM Interface!");
        System.out.println("Enter the User id and Password to Login into the Interface.");
        String uid=sc.next();
        String up=sc.next();
        if(uid.equals("User") && up.equals("12345")){
            System.out.println("You have Successfully logged In");
            int balance= 10000,withdraw,deposit;
            while (true) {
                System.out.println("The following functions are available choose\n" +
                        "1 for Withdraw \n 2 for Deposit \n 3 for Transfer" +
                        " \n 4 to Check Balance \n 5 to Exit");
                System.out.print("Choose the operation you want to perform:");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Enter the Account number in which money is to be transferred:");
                        int s = sc.nextInt();
                        System.out.println("Enter the amount to be transferred:");
                        int a = sc.nextInt();
                        if (balance >= a) {
                            balance = balance - a;
                            System.out.println("Money transferred to Account " + s);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 5:
                        System.exit(0);
                }
            }
        }
        else {
            System.out.println("Invalid Credentials");
        }

    }
}
