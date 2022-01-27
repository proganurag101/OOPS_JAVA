
class first_proj{



    public static void main(String[] args) {
        Bank_account acc1 = new Bank_account(123456,"My account ",1000.0);
        acc1.deposit(200);
        acc1.withdraw(300);
        acc1.displayBalance();
        acc1.withdraw(-200);
        acc1.displayBalance();


        /*   ---OUTPUT--
        Successfully deposited! 200.0 Current Balance: 1200.0
        Withdrawl Successful! 300.0 Current Balance: 900.0
        Balance in My account Acc. number:123456 is Rs.900.0
        Can not deposit: -200.0
        Balance in My account Acc. number:123456 is Rs.900.0 */
    }
}
