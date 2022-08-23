package day3.task3;

class Main {
    public static void main(String[] args) {
        BankAccount bank_a = new BankAccount(1000);
        BankAccount bank_b = new BankAccount(2000);
        BankAccount bank_c = new BankAccount(3000);

        bank_a.withdraw(1001);
        bank_a.deposit(6000);
        bank_b.transferFrom(bank_c,4000);

    }
}

public class BankAccount {
    private double balance;
    public BankAccount(double input_balance){
        this.balance = input_balance;
    }
    public BankAccount(){};

    public void deposit(double amount) {
        if (amount>5000){
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: "+amount);
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount>this.balance){
            System.out.println("There is not enough funds.");
        }else{
            this.balance -= amount;
        }
    }

    public void printBalance() {

        System.out.println("the current balance is "+ this.balance);
    }
    public void transferFrom(BankAccount from_banc, double amount) {
        if (amount>from_banc.balance){
            System.out.println("Transfer canceled. You are trying to transfer "+amount+" units, but only "+from_banc.balance+" are available.");
        }else {
            this.balance += amount;
            from_banc.withdraw(amount);
        }
    }
}
