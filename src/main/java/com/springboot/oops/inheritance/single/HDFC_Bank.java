package com.springboot.oops.inheritance.single;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author prabhakar, @Date 25-06-2024
 */
public class HDFC_Bank extends Bank{

    public static void main(String[] args) {

        AtomicInteger id = new AtomicInteger(0);

        HDFC_Bank hdfcBank = new HDFC_Bank();
        hdfcBank.bankId = id.addAndGet(1);
        hdfcBank.bankName = "HDFC";
        hdfcBank.location = "Hyd";



        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank(hdfcBank.bankId, hdfcBank.bankName, hdfcBank.location));
        System.out.println(banks);


    }
}
