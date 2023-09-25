package work04;
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    // Constructor
    public BankAccount(int number , Person owner){
        this.number = number;
        this.owner = owner;
    }

    // Getter Setter
    public Person getOwner() {return owner;}
    public double getBalance() {return balance;}

    //Method
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public void transfer(double amount , BankAccount account){
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount(" + number + ")";
    }

}
