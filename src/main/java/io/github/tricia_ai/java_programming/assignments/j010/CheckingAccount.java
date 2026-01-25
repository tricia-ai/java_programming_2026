package io.github.tricia_ai.java_programming.assignments.j010;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, String accountHolder, int balance){
        super(accountNumber, accountHolder, balance);

    }

    @Override
    public int deposit(int amount){
        if (amount < 100000){
            balance = getBalance() + amount;
            System.out.println("The new balance after depositing "+amount+" is: "+balance);
            return balance;
        } else {
            System.out.println("Your deposit amount is too high");
            return 0;
        }

    }
}
