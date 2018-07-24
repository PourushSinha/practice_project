package com.pouruh.springpractice;

/**
 * Created by pourush.sinha on 23/07/18.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
