package com.springboot.core.advance;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author prabhakar, @Date 13-09-2024
 */
public class LocalTimeExample {
    String Name;
    LocalDateTime opened;
    double Balance;

    public void Array2() {
        this.Name="";
        this.opened= LocalDateTime.now();
        this.Balance=0.0;
        System.out.println(Name+" "+opened+" "+Balance);
    }

    public void Array2(String name,LocalDateTime opened,double Balance) {

        this.Name=name;
        this.opened=opened;
        this.Balance=Balance;

        System.out.println("Name: "+Name);
        System.out.println("DateTime: "+opened);
        System.out.println("Balance: "+Balance);
    }
    public void Array2(LocalTimeExample obj) {
        this.Name=obj.Name;
        this.opened=obj.opened;
        this.Balance=obj.Balance;
        System.out.println("Name: "+Name+", Date And Time: "+opened+", Balance: "+Balance);
    }

    @Override
    public String toString() {
        return "Array2 [Name=" + Name + ", opened=" + opened + ", Balance=" + Balance + "]";
    }
    public static void main(String[] args) {

        LocalTimeExample obj=new LocalTimeExample();
        LocalTimeExample ob=new LocalTimeExample();
        obj.Array2();
        ob.Array2("Sudhakar", LocalDateTime.now(), 50000);
        System.out.println(obj.toString());
        obj.Array2("prabhakar", LocalDateTime.now(), 30000);
        obj.Array2(ob);
        System.out.println(obj.toString());
        ob.Array2("Srinu", LocalDateTime.of(2022, Month.DECEMBER,20,06,30,39), 25000);
    }
}
