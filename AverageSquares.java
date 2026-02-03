import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        in.nextLine();

        System.out.println("Average of squares from " + startNum + " to " + endNum);
        
        double sum = 0;
        double i = startNum;

        do {
            sum += i * i;
            i++;
        } while (i <= endNum);
       
        double average = sum / (endNum - startNum + 1);
        System.out.println(average);
    }
}