package com.springboot.core;

import java.io.IOException;

public class OsShutdown{

  public static void main(String[] args){

    // don't try if you are important work.
    
      try {
            Runtime.getRuntime().exec("shutdown /s /t 1");
        }catch (IOException e){
            e.printStackTrace();
        }
  }
}
