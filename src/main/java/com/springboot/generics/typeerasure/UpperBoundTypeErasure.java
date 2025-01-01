package com.springboot.generics.typeerasure;

/**
 * @author prabhakar, @Date 31-12-2024
 */
// This is Actual class as well Developed Generic One
public class UpperBoundTypeErasure<P extends Number> {

    private P number;

    public void setNumber(P value){
        this.number = value;
    }

    public P getNumber(){
        return number;
    }


     /* INTERNAL WORK FLOW STRUCTURE PRESENT IN JVM
        public class UpperBoundTypeErasure {
            private Number number;

            public void setNumber(Number value){
                this.value = value;
            }

            public Number getNumber(){
                return value;
            }
        }

    */

    public static void main(String[] args) {

        UpperBoundTypeErasure<Integer> objectErasureDemo = new UpperBoundTypeErasure<>();
        objectErasureDemo.setNumber(234);
        Integer value = objectErasureDemo.getNumber();
        System.out.println(value);


        /* INTERNAL WORK FLOW STRUCTURE PRESENT IN JVM
            UpperBoundTypeErasure objectErasureDemo = new UpperBoundTypeErasure();
            objectErasureDemo.setNumber(234);
            Integer value = (Integer)objectErasureDemo.getNumber();
            System.out.println(value);
         */
    }

}
