package lesson1;

public class M2 {
    public static void main(String[] args) {
        //Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Sofie Tkachuk");

        //// Operation a: -5 + 8 * 6
        int a = -5;
        int b = 8;
        int c = 6;

        double resultA = (double) a + b * c;

        // // Operation b: 20 + -3 * 5 / 8
        int a2 = 20;
        int b2 = -3;
        int c2 = 5;
        int d2 = 8;

        double resultB = (double) a2 + (double) (b2 * c2) / d2;

        System.out.println("a. Result of -5 + 8 * 6 is: " + resultA);

        System.out.println("b. Result of 20 + -3 * 5 / 8 is: " + resultB);

        //Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
        //number a * number b *.... equals <result>
        double num1 = 1.3;
        double num2 = 2.2;
        double num3 = 3.1;
        double num4 = 1.5;
        double num5 = 7.8;

        double result = num1 * num2 * num3 * num4 * num5;

        System.out.println("Result for multiplying 5 decimal variables:");
        System.out.println(num1 + " * " + num2 + " * " + num3 + " * " + num4 + " * " + num5 + " = " + result);

    }
}
