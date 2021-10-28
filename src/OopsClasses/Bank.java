package OopsClasses;

public class Bank {

    private String account;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.balance+=amount;
        System.out.println("Amount deposited is "+amount+" + made a new Balance is " + balance );
    }

    public void  withdraw(double amount){
        if(this.balance - amount < 0){
           System.out.println("InSufficient balance..");
        }else {
            this.balance -= amount;
            System.out.println("Amount withdraw is " + amount + " + made a new remaining Balance is " + balance);
        }
    }

    public Bank(){
        this("345678032A" ,100.0,"John" ,"weewr@gmail.com",4220922);
        System.out.println("Empty Constructor ");
    }

    public Bank(String account,double balance,String customerName ,String email, int phoneNumber){
        System.out.println("Parameterized Constructor ....");
        this.account = account;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public static void main(String[] args) {
        Bank b = new Bank();
      //  Bank b1 = new Bank("345678032A" ,100.0,"John" ,"weewr@gmail.com",4220922);

     /*   b.setAccount("345678032A");
        b.setEmail("xerw@gmail.com");
        b.setCustomerName("Jihn");
        b.setPhoneNumber(43636262);
        b.setBalance(0.0);*/

        System.out.println(b.getAccount());
        System.out.println(b.getEmail());
        System.out.println(b.getCustomerName());

        b.depositFunds(50.0);
        b.withdraw(100.0);

        b.depositFunds(51.0);
        b.withdraw(100.0);

    }
}
