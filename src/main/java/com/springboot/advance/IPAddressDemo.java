package com.springboot.advance;

import java.net.InetAddress;

/**
 * @author prabhakar, @Date 16-08-2024
 */
public class IPAddressDemo {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
