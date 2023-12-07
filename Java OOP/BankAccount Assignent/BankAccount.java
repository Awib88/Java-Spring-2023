import java.util.Scanner;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts = 0;
    public static double totalAmountOfMoney = 0.0;

        // ! constructors
    public BankAccount() {
        this(0.0,0.0);
        numberOfAccounts++;
    }

    public BankAccount(double checkingBalance,double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

            //! getters
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
            return savingsBalance;
        }

            //! setters
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance += checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
            this.savingsBalance += savingsBalance;
        }

        // TODO: #1 deposit money method 

    public void depositCash(double money){
        Scanner scanner = new Scanner(System.in);
        char option;
        boolean isFinished = false;

        do{
            System.out.println("Choose an option:");
            System.out.println("Type 1 : Deposit to checking Account");
            System.out.println("Type 2 : Deposit to Savings Account");
            System.out.println("Type q : Quit");


            option = scanner.next().charAt(0);

            switch(option){
                case '1':
                    setCheckingBalance(money);
                    BankAccount.totalAmountOfMoney += money;
                    isFinished = true;
                    break;
                case '2':
                    setSavingsBalance(money);
                    BankAccount.totalAmountOfMoney += money;
                    isFinished = true;
                    break;
                case 'q':
                    System.out.println("Quitting...");
                    isFinished = true;
                    break;
                default:
                    System.out.println("\n -----------Invalid option. Please try again.-----------\n");
            }
        } while( isFinished != true );
        }

        // TODO: #2 withdraw money method 

    public String withdraw(double amount){
        Scanner scanner = new Scanner(System.in);
        char option;
        boolean isFinished = false;

        do{
            System.out.println("Choose an option:");
            System.out.println("Type 1 : withdraw of checking Account");
            System.out.println("Type 2 : withtraw from Savings Account");
            System.out.println("Type q : Quit");


            option = scanner.next().charAt(0);

            switch(option){
                case '1':
                    if (amount > getCheckingBalance()){
                        isFinished = true;
                        return "Insufficient funds!";
                        
                    }else{
                        this.checkingBalance -= amount;
                        BankAccount.totalAmountOfMoney -= amount;
                        isFinished = true;
                        return "Successful!";
                        
                    }

                case '2':
                    if (amount > getSavingsBalance()){
                        isFinished = true;
                        return "Insufficient funds!";
                        
                    }else{
                        this.savingsBalance -= amount;
                        BankAccount.totalAmountOfMoney -= amount;
                        isFinished = true;
                        return "Successful!";
                        
                    }
                case 'q':
                    System.out.println("Quitting...");
                    isFinished = true;
                    break;
                default:
                    System.out.println("\n -----------Invalid option. Please try again.-----------\n");
            }
        } while( isFinished != true );
        return "";
        }

        // TODO: #3 Check balance method 

    public void checkBalance(){
        double total = getCheckingBalance() + getSavingsBalance();
        System.out.println("Checking account: $" + getCheckingBalance());
        System.out.println("Saving account: $" + getSavingsBalance());
        System.out.println("Total: $" + total);
    }
    }
