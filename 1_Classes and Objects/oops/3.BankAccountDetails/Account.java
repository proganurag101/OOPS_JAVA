public class Account{
 private int accountId;   
 private String accountType;
 private int balance;
 //setter accountid                               
 public void setAccountId(int id){
     accountId = id;
 }
  public int getAccountId(){
     return accountId;
 }
 
 //setter account Type                           //we don't need accountType to print anywhere so we only set and don't use a getter                    
 public void setAccountType(String type){
     accountType = type;
 }
 public String getAccountType(){
     return accountType;
 }
 
 //setter balance                                  //we need to set the balance and also print it so we use both getter and setter
 public void setBalance(int val){
     balance = val;
 }
 //getter balance
 public int getBalance(){
     return balance;
 }
 
 
 
 
 public boolean withdraw(int val){
     if(val<=balance){
         balance -= val;
         System.out.println("Balance amount after withdraw: "+balance);
         return true;
     }else{
         System.out.println("Sorry!!! No enough balance");
         return false;
     }
 }
 
}
