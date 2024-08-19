package com.springboot.awtprograms;

import java.awt.*;

/**
 * @author prabhakar, @Date 19-08-2024
 */
public class ChoiceExample {

    ChoiceExample(){
        Frame f= new Frame();
        Choice c=new Choice();
        c.setBounds(100,100, 75,75);
        c.add("Item 1 by Prabhakar");
        c.add("Item 2 by Sudhakar");
        c.add("Item 3 by Synycs");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ChoiceExample();
    }
}
