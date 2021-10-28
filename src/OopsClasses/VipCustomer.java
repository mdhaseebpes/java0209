package OopsClasses;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("John" ,100000);
        System.out.println("Empty constructor");

    }
    public VipCustomer(String name , double creditLimit){
        this(name,creditLimit,"xyz@gmail.com");
        System.out.println("2 parameters constructor");
    }
    public VipCustomer(String name,double creditLimit ,String email){
        System.out.println("3 parameters constructor ");
        this.name = name;
        this.creditLimit= creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmail());
        System.out.println(vip.getName());
    }
}
