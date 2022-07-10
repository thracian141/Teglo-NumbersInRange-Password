import java.util.Scanner;

public class Teglo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input Weight:");

        double weight = Integer.parseInt(scan.nextLine());

        if (weight < 50) {
            System.out.println("Anorexic");
        } else if (weight < 71) {
            System.out.println("Skinny");
        } else if (weight < 91) {
            System.out.println("Skinny fat");
        } else if (weight < 111) {
            System.out.println("Obese");
        } else {
            System.out.println("Extra obese");
        }
    }
}
