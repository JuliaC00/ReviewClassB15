package Review4;

public class ForLoop {
    public static void main(String[] args) {


        //best loop-used when we know how many times we need to repeat the code

        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
            if(i==12) {
                System.out.println("i is equal to 12-I'm breaking my code");

                break;
            }
        }
        //continue
        for (int i =1; i <= 10; i ++) {
            if(i%3==0){
                System.out.println(i);
                continue;//java goes back to the beggining of the loop
                //and skips the rest of the code that is inside loop body;
            }
            System.out.println("hello");
        }

    }
}
