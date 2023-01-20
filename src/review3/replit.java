package review3;
import java.util.Scanner;
public class replit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend= input.nextBoolean();

        if(!weekend){
            System.out.println("Today you will be learning manual testing ");}
        else{
            System.out.println("Today you will be learning JAVA");
        }
    }
}
       /* pPrompt user with a question: "Is it weekend?"

    If it is not a weekend --> subject="manual testing"

    Otherwise --> subject="Java"

            **Output**:

            ```
    Today you will be learning ____
```
*/