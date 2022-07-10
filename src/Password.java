import java.util.Objects;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create username");
        String username = scan.nextLine();
        String inputUN;

        System.out.println("Create password");
        String password = scan.nextLine();
        String inputPass;

        while (true) {
            System.out.println("Enter username: ");
            inputUN = scan.nextLine();
            if (Objects.equals(inputUN, username)) {
                System.out.println("Username found.");
                break;
            } else {
                System.out.print("Username not found, ");
            }
        }
        while (true) {
            System.out.println("Enter password: ");
            inputPass = scan.nextLine();
            if (Objects.equals(password, inputPass)) {
                System.out.println("Correct password.");
                break;
            } else {
                System.out.print("Incorrect password, ");
            }
        }
    }
}
