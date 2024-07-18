
public class Main {
    public static void main(String[] args) {
        // Part 1: Declare two integer variables, assign an integer to each, and add them together. Print out the result.
        int intVar1 = 5;
        int intVar2 = 10;

        int intSum = intVar1 + intVar2;

        System.out.println("Integer sum: " + intSum);




        // Part 2: Declare two double variables, assign a number to each, and add them together. Print out the result.
        double dubVar1 = 5.5;
        double dubVar2 = 10.25;
            double dubSum = dubVar1 + dubVar2;


            System.out.println("Double sum: " + dubSum);

        // Part 3: Declare an integer variable and a double variable, assign numbers to each, and add them together. Print out the result.
        int v = 5;
            double doubleVar = 10.5;
        double sumIntDouble = v + doubleVar;
        System.out.println("Sum of integer and double: " + sumIntDouble);

        // Part 4: Declare two integer variables, assign an integer to each, and divide the larger number by the smaller number. Print out the result.
        int intVar3 = 10;

        int intVar4 = 5;

        int divisionResult = intVar3 / intVar4;

        System.out.println("Division result (integers): " + divisionResult);

        // \\Changing the larger number to a decimal
        double doubleVar1 = 10.0;
        double divisionResultDouble = doubleVar1 / intVar4;

        System.out.println("Division result (with double): " + divisionResultDouble);

        ////
        //
        // Part 5: Declare two double variables, assign a number to each, and divide the larger by the smaller number. Print out the result.


        double doubleVar2 = 10.5;
        double doubleVar3 = 5.25;
        double divisionResultDouble2 = doubleVar2 / doubleVar3;
        System.out.println("Division result (doubles): " + divisionResultDouble2);

        // result to an integer
        int divisionResultInt = (int) divisionResultDouble2;
        System.out.println("Casted division result: " + divisionResultInt);

        // Part 6: Declare two integer variables, x and y, and assign the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("q (integer division): " + q);
        q = (double) y / x;
        System.out.println("q (double division): " + q);

        // Part 7: Declare a named constant and use it in a calculation. Print the result.
        final int CONSTANT = 10;
        int result = CONSTANT * 5;
        System.out.println("Result using constant: " + result);

        // Part 8: Create three variables that represent products at a cafe. Assign prices to each product.
        // Complete an order for three items of the first product, four items of the second product, and two items of the third product.
        // Calculate the subtotal, add sales tax to obtain the total sale amount, and format the results to two decimal places.
        double coffeePrice = 2.50;

        double cappuccinoPrice = 3.50;
        double espressoPrice = 4.00;
        ///ints\\

        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;


        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (espressoPrice * espressoQty);
        final double SALES_TAX = 0.07;
        double totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Total Sale: %.2f\n", totalSale);
    }

    // Part 3 practice method
    public static void practice() {
        int v = 5;
        double doubleVar = 10.5;
        double sumIntDouble = v + doubleVar;
        System.out.println("Sum of integer and double: " + sumIntDouble);
    }
}
