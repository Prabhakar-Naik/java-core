package com.springboot.oops.inheritance.single;

/**
 * @author prabhakar, @Date 25-06-2024
 */
public class Bank {
    int bankId;
    String bankName;
    String location;

    public Bank() {
    }

    public Bank(int bankId, String bankName, String location) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.location = location;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

}
