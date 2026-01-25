package io.github.tricia_ai.java_programming.assignments.j010;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccount(String accountNumber, String accountHolder, int balance){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null){
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = null;
        }
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null){
            this.accountHolder = accountHolder;
        } else {
            this.accountHolder = null;
        }
    }

    public void setBalance(int balance) {
        if (balance >= 0){
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance(){
        return balance;
    }

    public int deposit(int amount){
        if (amount > 0){
            balance = getBalance() + amount;
            return balance;
        } else {
            System.out.println("The amount is less than 0");
            return 0;
        }
    }

    public int withdraw(int amount){
        if (amount < getBalance()){
            balance = getBalance() - amount;
            return balance;
        } else {
            System.out.println("Your balance is low");
            return 0;
        }

    }


}
