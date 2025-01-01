package com.springboot.generics.typeerasure;

/**
 * @author prabhakar, @Date 31-12-2024
 */

public class ErasureDemo<P> {

    //The TypeErasure responsibility to remove the actual structure of generic type
    // internal work flow of generic classes for functionality
    // all these take care of by JVM

    private P value;

    public void setValue(P value){
        this.value = value;
    }

    public P getValue(){
        return value;
    }

    /* INTERNAL WORK FLOW STRUCTURE PRESENT IN JVM
        public class ErasureDemo {
            private Object value;

            public void setValue(Object value){
                this.value = value;
            }

            public Object getValue(){
                return value;
            }
        }

    */

    public static void main(String[] args) {

        ErasureDemo<String> stringErasureDemo = new ErasureDemo<>();
        stringErasureDemo.setValue("Prabhakar");
        String value = stringErasureDemo.getValue();
        System.out.println(value);

        /* INTERNAL WORK FLOW STRUCTURE PRESENT IN JVM
            ErasureDemo stringErasureDemo = new ErasureDemo();
            stringErasureDemo.setValue("Prabhakar");
            String value = (String) stringErasureDemo.getValue();
            System.out.println(value);
         */

    }
}
