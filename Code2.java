class Bank{

    private double balance;

    Bank(double initialBalance){
        this.balance=initialBalance;
    }

    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Code2{
    public static void main(String[] args) {
        Bank b1=new Bank(890777790);
      
        b1.deposit(7876);
        System.out.println("current balance:"+b1.getBalance());
    }
}