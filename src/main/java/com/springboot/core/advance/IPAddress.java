package com.springboot.core.advance;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author prabhakar, @Date 05-08-2024
 */
public class IPAddress {

    public static void main(String[] args) throws UnknownHostException {

        System.out.println(Inet4Address.getLoopbackAddress());
        System.out.println(InetAddress.getLocalHost());
    }
}
