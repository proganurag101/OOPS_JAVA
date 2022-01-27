public class Bank_account{
    private int Account_number;
    private String Account_name;
    private double Balance;
  
    public void deposit(double bal){
        if(bal>0){
        Balance += bal;
        System.out.println("Successfully deposited! "+bal+" Current Balance: "+Balance);
        }else{
            System.out.println("Can not deposit: "+bal);
        }
    }
  
    public void withdraw(double am){
        if(am>0){
        Balance -= am;
        System.out.println("Withdrawl Successful! "+am+" Current Balance: "+Balance);
        }else{
            System.out.println("Can not deposit: "+am);
        }
    }
  
    public void displayBalance(){
        System.out.println("Balance in "+Account_name+"Acc. number:"+Account_number+" is Rs."+Balance);
    }
   

    public Bank_account(int acNo,String acName,double acBalance){
        Account_number = acNo;
        Account_name = acName;
        Balance = acBalance;
    }



}
