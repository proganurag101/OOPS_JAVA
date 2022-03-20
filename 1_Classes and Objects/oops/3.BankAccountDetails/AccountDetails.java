import java.util.*;
public class AccountDetails{
    
    public Account getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("Enter account id:");
        a.setAccountId(sc.nextInt());
        sc.nextLine(); //to reset scanner cursor
        System.out.println("Enter account type:");
        a.setAccountType(sc.nextLine());
      
        while(true){
            System.out.println("Enter balance:");
            int bal = sc.nextInt();
            if(bal<=0){
                System.out.println("Balance should be positive");
                continue;
            }else{
                a.setBalance(bal);
                break;
            }
        }
        return a;
    }
public int getWithdrawAmount(){
    
   
    Scanner sc = new Scanner(System.in);
    int amt;
    
    while(true){
        System.out.println("Enter amount to be withdrawn:");
        amt = sc.nextInt();
        if(amt<=0){
            System.out.println("Balance should be positive");
        }else{
            break;
        }
    }
    return amt;
}
    public void main (String[] args) {
        AccountDetails ad = new AccountDetails(); //Account details class's object
        Account a = ad.getAccountDetails();
        
        boolean res = a.withdraw(ad.getWithdrawAmount());
    }
    
}
