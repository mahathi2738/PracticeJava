class Bank{
    String name;
    double balance,depositAmount;
    Bank(String name,double balance,double depositAmount){
        this.name=name;
        this.balance=balance;
        this.depositAmount=depositAmount;
    }
    void deposit(){
         balance+=depositAmount;
    }
    void showBalance(){
        if(balance<500){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Balance:"+balance);
        }
    }
}
public class BankAccount {
    public static void main(String[]args){
        Bank b=new Bank("Mahathi",20,100);
        b.deposit();
        b.showBalance();
    }
    
}
