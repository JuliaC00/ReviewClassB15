package com.syntax.review2;

import org.w3c.dom.ls.LSOutput;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more conditions to test

        if(boolean condition){
        code A;
        }else if (boolean condition){
        code B;
        }else if(boolean condition){
        Code C;
        }
        if you completed more than 25-> great job
        if you completed more than 20-> good job
         */
    int homework=30;

    if(homework>25) {
        System.out.println("Great job");
    }else{ if (homework>20) {
        System.out.println("Good Job");
    }else if(homework>10) {
        System.out.println("ok job");
    }else{ if(homework>5){
        System.out.println("Not  Good Job");
    }
    }
    }
        System.out.println("-----------");

    String browser="opera";
    if(browser.equals("chrome")) {
        System.out.println("test cases executed on chrome browser");
    }else if (browser.equals("safari")){
            System.out.println("test cases executed on safari browser");
        }else if(browser.equals("firefox")) {
        System.out.println("test cases executed on firefox browser");
    }else{//when non of the conditions are true, code comes to else block
        System.out.println("browser is not supported");


    }
    }

}
