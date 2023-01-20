package Review4;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
    /*    int b=1;
        do{
            System.out.println("do while");
            b++;
        }while(b>=3);
*/
        //ask students if they understand loops?
        //if they dont -tell them to practice more on loops
        //if they undertand -you good move to arrey concept

        Scanner scanner=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java?");
            answer = scanner.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs,lets learn arrays now");

    }
}
