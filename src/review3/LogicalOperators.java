package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = false;

        if (loginButtonDisplayed && loginButtonClickable) {
        System.out.println("test case is passed");
    }else{
        System.out.println("test case is failed");
    }
        System.out.println("-------------------------");

        boolean dashboard=false;
        String message="Welcome admin";

        if (dashboard || message.equals("Welcom admin")) {
            System.out.println("User is succesfully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("*****************************");



    }
}
