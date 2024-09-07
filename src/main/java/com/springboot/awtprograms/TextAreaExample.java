package com.springboot.awtprograms;

import java.awt.*;

/**
 * @author prabhakar, @Date 19-08-2024
 */
public class TextAreaExample {
    TextAreaExample(){
        Frame f= new Frame();
        TextArea area=new TextArea("Welcome to Java language");
        area.setBounds(10,30, 300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextAreaExample();
    }
}
