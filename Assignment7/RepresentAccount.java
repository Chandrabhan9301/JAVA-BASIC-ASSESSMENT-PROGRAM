package Assignment7;

class Account{
    int accountNumber;
    String customerName;
    double balance;
    public static double rateOfInterest;

    void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }
    void setAccountName(String name){
        this.customerName = name;
    }
    void setBalance(double balance){
        this.balance= balance;
    }
    public static void setRateOfInterest(int interest){
        rateOfInterest = interest;
    }

    void SimpleInterest(int time){

        double simpleInterest = (balance*rateOfInterest*time)/100;
        System.out.println("Simple Interest = "+simpleInterest);
    }

    void getAccountNumber(){
        System.out.println("Account Number = "+accountNumber);
    }
    void getBalance(){
        System.out.println("Balance = "+balance);
    }
    void getCustomerName(){
        System.out.println("Customer Number = "+customerName);
    }

}

public class RepresentAccount {
    public static void main(String[] args) {
        Account obj = new Account();

        obj.setAccountNumber(84947374);
        obj.setAccountName("Chandrabhan");
        obj.setBalance(100000);
        Account.setRateOfInterest(8);
         
        obj.SimpleInterest(2);
        
        obj.getAccountNumber();
        obj.getCustomerName();
        obj.getBalance();
    }
}
