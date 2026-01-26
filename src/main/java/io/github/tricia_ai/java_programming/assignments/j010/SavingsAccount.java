package io.github.tricia_ai.java_programming.assignments.j010;

public class SavingsAccount extends BankAccount{
    private int savingsBalance;
    public SavingsAccount(String accountNumber, String accountHolder, int balance, int savingsBalance){
        super(accountNumber, accountHolder, balance);
        setSavingsBalance(savingsBalance);


    }
    public void setSavingsBalance(int savingsBalance){
        if (savingsBalance > 0){
            this.savingsBalance = savingsBalance;
        } else {
            this.savingsBalance = 0;
        }
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }

    @Override
    public int withdraw(int amount){
        if (amount < getBalance() && getBalance() - amount >= 100){
            balance = getBalance() - amount;
            savingsBalance = getSavingsBalance() + amount;
            System.out.println("The new savings balance is: "+savingsBalance);
            System.out.println("The new balance after withdrawing "+amount+" is: ");
            return balance;
        } else {
            System.out.println("Your balance is low");
            return 0;
        }

    }

    public int savingsInterest(int rate){
        if (savingsBalance > 0){
            int totalInterestPerYear = getSavingsBalance() * rate/100 + getSavingsBalance();
            System.out.println("The new balance after the yearly interest: ");
            return totalInterestPerYear;
        } else {
            return 0;
        }
    }
}
