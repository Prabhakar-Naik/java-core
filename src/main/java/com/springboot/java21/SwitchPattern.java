package com.springboot.java21;

/**
 * @author prabhakar, @Date 28-06-2025
 */

public class SwitchPattern {

    static void identify(Object o) {
        switch (o) {
            case String s   -> System.out.println("String(" + s + ")");
            case Integer i  -> System.out.println("Integer(" + i + ")");
            default         -> System.out.println("Other");
        }
    }

    // Base Account Class
    abstract static class Account {
        abstract double getBalance();
        abstract String accountType();
        abstract Integer accountNumber();
    }

    // Different Account Types
    static class SavingsAccount extends Account {
        private final double savings;
        private final String accountType;
        private final Integer accountNumber;

        SavingsAccount(double savings, String accountType, Integer accountNumber) {
            this.savings = savings;
            this.accountType = accountType;
            this.accountNumber = accountNumber;
        }
        double getSavings() { return savings; }
        String getAccountType() { return accountType; }
        Integer getAccountNumber() { return accountNumber; }

        @Override
        double getBalance() { return savings; }
        @Override
        String accountType() { return accountType; }
        @Override
        Integer accountNumber() { return accountNumber; }
    }

    static class TermAccount extends Account {
        private final double term;
        private final String accountType;
        private final Integer accountNumber;
        TermAccount(double term, String accountType, Integer accountNumber) {
            this.term = term;
            this.accountType = accountType;
            this.accountNumber = accountNumber;
        }

        double getTermAccount() { return term; }
        String getAccountType() { return accountType; }
        Integer getAccountNumber() { return accountNumber; }

        @Override
        double getBalance() { return term; }

        @Override
        String accountType() {
            return accountType;
        }

        @Override
        Integer accountNumber() {
            return accountNumber;
        }
    }

    static class CurrentAccount extends Account {
        private final double current;
        private final String accountType;
        private final Integer accountNumber;
        CurrentAccount(double current, String accountType, Integer accountNumber) {
            this.current = current;
            this.accountType = accountType;
            this.accountNumber = accountNumber;
        }

        String getAccountType() { return accountType; }
        Integer getAccountNumber() { return accountNumber; }
        double getCurrentAccount() { return current; }

        @Override
        double getBalance() { return current; }
        @Override
        String accountType() { return accountType; }
        @Override
        Integer accountNumber() { return accountNumber; }
    }


    static Object getBalanceWithSwitchPattern(Account account) {
        Object result;
        switch (account) {
            case null -> throw new RuntimeException("Oops, account is null");
            case SavingsAccount sa -> result = STR."\{sa.getSavings()} \{sa.getAccountType()} \{sa.getAccountNumber()}";
            case TermAccount ta -> result = STR."\{ta.getTermAccount()} \{ta.getAccountType()} \{ta.getAccountNumber()}";
            case CurrentAccount ca -> result = STR."\{ca.getCurrentAccount()} \{ca.getAccountType()} \{ca.getAccountNumber()}";
            default -> result = STR."\{account.accountType()} \{account.accountNumber()} \{account.getBalance()}";
        }
        return result;
    }

    public static void main(String[] args) {
        identify("String");
        identify(23);
        identify('C');

        Account savings = new SavingsAccount(2000.0, "Savings", 100);
        Account term = new TermAccount(5000.0, "Term", 500);
        Account current = new CurrentAccount(1500.0, "Current", 1500);

        System.out.println(STR."Savings balance: \{getBalanceWithSwitchPattern(savings)}"); // 2000.0
        System.out.println(STR."Term balance: \{getBalanceWithSwitchPattern(term)}");       // 5000.0
        System.out.println(STR."Current balance: \{getBalanceWithSwitchPattern(current)}"); // 1500.0

        // Uncommenting below will throw an exception
        // System.out.println(getBalanceWithSwitchPattern(null));
    }
}
