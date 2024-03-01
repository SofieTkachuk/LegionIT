package lesson2;

public class M3 {
    public static void main(String[] args) {
        M3 assignment = new M3();
        //assignment.positiveIntegers(1);
        assignment.numSummary();
        //assignment.pyramid(8);
    }

    // 1. The code should be able to print all of the positive integers from 1 to 100.
    public void positiveIntegers(int i) {
        for (i = 1; i <= 100; i++) {
            // In the output, state whether each integer is ‘odd’ or ‘even’ in the output.
            // If the number is divisible by three, instead of stating that the number is odd or even, state that the number is ‘divisible by three’.
            // If the number is divisible by both two and three, instead of saying that the number is odd, even or divisible by three; state that the number is ‘divisible by two and three’.
            boolean isDivByTwo = (i % 2 == 0);
            boolean isDivByThree = (i % 3 == 0);

            if (isDivByTwo && isDivByThree) {
                System.out.println("The number " + i + " is divisible by two and three.");
            } else if (isDivByThree) {
                System.out.println("The number " + i + " is divisible by three.");
            } else {
                System.out.println("The number " + i + " is " + (isDivByTwo ? "even" : "odd") + ".");
            }
        }
    }

    // 2. Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.
    public void numSummary() {
        int a = 2;
        int b = 9;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("The summary of number between " + a + " and " + b + " is " + sum);
    }

    // 3. Using two loops print upside-down pyramid on the screen (see and modify the numbers pyramid example in the lesson).
    public void pyramid(int rows) {
        for (int i=rows; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
