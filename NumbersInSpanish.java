public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
 
       // delete the line below and replace with your code
       switch(number) {
         case 1:
            System.out.println("uno");
         case 2:
            System.out.println("dos");
         case 3:
            System.out.println("tres");
         case 4:
            System.out.println("cautro");
         case 5:
            System.out.println("cinco");
         default: System.out.println("sorry i dont not know that");
       }
    }   
 }