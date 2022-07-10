import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        while (true){
            System.out.println("Enter a number:");
            num = Integer.parseInt(scan.nextLine());
            if (num >=1 && num <= 100){
                System.out.println("The number is " + num);
                break;
            } else {
                System.out.println("Invalid number!");
            }
        }
    }
}
