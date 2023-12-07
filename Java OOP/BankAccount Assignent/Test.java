public class Test{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.depositCash(200.0);
        //account2.depositCash(300.0);
        //account3.depositCash(400.0);

        //account1.depositCash(150.0);

        /*BankAccount[] accounts = {account1,account2,account3};
        double[] deposits = {200.0,300.0,400.0};

        if ( accounts.length == deposits.length){
            for (int i=0 ; i < accounts.length; i++){
                accounts[i].depositCash(deposits[i]);
            }
        }else{
            System.out.println("Arrays don't match !");
        }
*/

        System.out.println(account1.withdraw(100));

        //System.out.println(BankAccount.totalAmountOfMoney);

        //System.out.println("account1 checking balance:"+account1.getCheckingBalance());
        //System.out.println("account1 saving balance:"+account1.getSavingsBalance());
        account1.checkBalance();

    }
}