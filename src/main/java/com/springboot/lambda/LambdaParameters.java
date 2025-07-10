package com.springboot.lambda;

/**
 * @author prabhakar, @Date 04-09-2024
 */
@FunctionalInterface
interface  Car {
    //void bookCar(String str,String msg); //not a return type
    double bookCar(String str,String msg);
}
class BookCar implements Car{

    @Override
    public double bookCar(String str,String msg) {
        System.out.println("This is bookCar method in BookCar class ... printing soon!");
        return 0.0;
    }


}
public class LambdaParameters {

    public static void main(String[] args) {

        Car cab= (str ,msg)->{
            System.out.println("first source: "+str+" second sourse: "+msg);
            return 815.34;
        };

        double fare=cab.bookCar("prabhakar", "Hello");
        System.out.println("Fare shall be: "+fare);

        BookCar car = new BookCar();
        car.bookCar("prabhakar", "How are you?");
    }
}
