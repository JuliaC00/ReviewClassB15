package Review4;

import javax.management.MBeanAttributeInfo;

public class NestedLoops {
    public static void main(String[] args) {

        for( int i=1; i<=3; i++){
            System.out.println(i);
            for( int j=1; i<=4; i++){
                System.out.println(j);
        }
    }
        System.out.println("____________________");
}
}
