package review3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite brouser");
        String browser=scan.nextLine();

        switch(browser.toLowerCase()){
            case "chrome":
                System.out.println("test case executed in "+browser);
                break;
            case "safari":
                System.out.println("test case executed in "+browser);
                break;
            case "microsoft edge":
                System.out.println("test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown");
        }
    }
}
