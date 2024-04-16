import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quel exercice voulez vous executer ? (1/2)");
        int rep = 0;
        try {
            rep = Integer.parseInt(in.next());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        switch(rep) {
            case 1:
                Histoire1.main(new String[]{});
                break;
            case 2:
                Histoire2.main(new String[]{});
                break;
            default:
                System.out.println("Exercice non reconnu");
        }
    }
}