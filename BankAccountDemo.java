/*Write a java program to create an abstract class with abstract method deposite and withdrawl . create a subclass saving account 
and credit acoount that extends the bankaccount class and implement irrespective method to handle deposite and withdrawl an 
each account*/


abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public abstract void deposit(double amount);
    public abstract void withdrawal(double amount);

    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}
class SavingAccount extends BankAccount {

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Savings Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}


class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(double initialBalance, double creditLimit) {
        super(initialBalance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Credit Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdrawal(double amount) {
        if (amount > 0 && (balance - amount >= -creditLimit)) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Credit Account.");
        } else {
            System.out.println("Credit limit exceeded or invalid withdrawal amount.");
        }
    }
}

// Main class to test the program
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount(1000);
        CreditAccount credit = new CreditAccount(500, 1000); // initial balance, credit limit

        System.out.println("----- Saving Account -----");
        saving.deposit(200);
        saving.withdrawal(500);
        saving.showBalance();

        System.out.println("\n----- Credit Account -----");
        credit.deposit(300);
        credit.withdrawal(1000);
        credit.showBalance();
    }
}

