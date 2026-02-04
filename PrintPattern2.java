import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the size: ");
        int size = in.nextInt();

        if (size < 1) {
            System.out.println("too small");
        } else if (size > 5) {
            System.out.println("too bigf");
        } else {
            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(i + j);
                }
                for (int j = size - 1; j >= 0; j--) {
                    System.out.print(i + j);
                }
                System.out.println();
            }
            for (int i = size; i >= 1; i--) {
                for (int j = 0; j < size; j++) {
                    System.out.print(i + j);
                }
                for (int j = size - 1; j >= 0; j--) {
                    System.out.print(i + j);
                }
                System.out.println();
            }
        }
    }
}