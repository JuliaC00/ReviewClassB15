package review3;

public class swith {
    public static void main(String[] args) {
        int worldCup=2022;
        switch(worldCup){
            case 2022:
                System.out.println("Argentina");
                break;
            case 2018:
                System.out.println("France");
                break;
            case 2014:
                System.out.println("Germany");
                break;
            default:
                System.out.println("winner is unknown");
        }
    }
}
