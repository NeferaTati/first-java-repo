
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte bt = 15;
        short sht = -48;
        int inter = 8;
        int sum = bt + sht + inter;
        long sum2 = sum * 10;

        System.out.println(sum2);

        // Call the Tryagain class to execute its main method
        Tryagain.main(new String[0]);

        int slum = 10; // Initialize the slum variable
        do {
            System.out.println("do this please " + slum);
            slum--; // Decrement slum to eventually end the loop
        } while (slum > 7);
    }
}

class Tryagain {
    public static void main(String[] args) {
        // create variables
        int a, b, c;
        Scanner anObj = new Scanner(System.in);

        //input 1
        System.out.print("Give me a number: ");
        a = anObj.nextInt();

        //input 2
        System.out.print("Give me one more: ");
        b = anObj.nextInt();

        //addition
        c = a + b;
        System.out.println("The total is: " + c);

        anObj.close(); // Close the scanner object
    }
}















