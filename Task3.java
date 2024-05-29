package Projects;

import java.util.Scanner;
class BankAccount
{
    int balance;
    public BankAccount(int balance)
    {
        this.balance=balance;
    }
    public void deposit(int amount)
    {
       if(amount>0)
     {
         balance+=amount;
       System.out.println("Amount of rupess "+amount+" deposition is successfull\n");
     }
       else {
           System.out.println("The amount to be deposited should be greater than zero\n");

       }

    }
    public void checkbalance()
    {
        System.out.println("Your balance is rupess "+balance+"\n");
    }
    public  void withdraw(int withdraw) {
        if (withdraw > 0 && withdraw <= balance) {
            System.out.println("Your amount of rupess " + withdraw + " withdraw is successfull\n");

            balance -= withdraw;
        } else {
            System.out.println("Opps! You do not have sufficient balance or Entered number is not greater than negative\n");
        }

    }
}
class Atm
{
    BankAccount bank;
Atm(BankAccount bank)
{
    this.bank=bank;
}
public void run()
{
    int options;
    do {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any one of the options");
        System.out.println("Option 1 Deposit the amount");
        System.out.println("Option 2 Check the Balance");
        System.out.println("Option 3 Withdraw the amount");
        System.out.println("Option 4 To leave");
       options=sc.nextInt();
        switch(options)
        {
            case 1:
                System.out.println("Enter the Amount to be deposited");
                int amount= sc.nextInt();;
                bank.deposit(amount);
                break;
            case 2:
                bank.checkbalance();
                break;
            case 3:
                System.out.println("Enter the amount to be withdrawn");
                int withdraw=sc.nextInt();
                bank.withdraw(withdraw);
                break;
            case 4:
                System.out.println("Thank you! visit again");
        }
    }while(options!=4);


}
}
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount rk=new BankAccount(3000);
        Atm kr=new Atm(rk);
        System.out.println("Enter your PIN");
       int r=sc.nextInt();

        if(r==8915)
        {
            kr.run();
        }
        else
        {
            System.out.println("Enter of Pin is wrong");
        }
    }

}
