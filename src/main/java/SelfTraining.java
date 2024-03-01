public class SelfTraining {
    public static void main(String[] args) {
        SelfTraining selfTraining = new SelfTraining();
//        selfTraining.nearHundred(93); //true
//        selfTraining.nearHundred(90); //true
//        selfTraining.nearHundred(89); //false

//        selfTraining.lastDigit(7, 17); //true
//        selfTraining.lastDigit(6, 17); //false
//        selfTraining.lastDigit(3, 113); //true

//        selfTraining.maxInt(1, 2, 3); //3
//        selfTraining.maxInt(1, 3, 2); //3
//        selfTraining.maxInt(3, 2, 1); //3

//        selfTraining.seven(7, 4); //true
//        selfTraining.seven(4, 1); //false
//        selfTraining.seven(2, 5); //true

//        selfTraining.answerCell(false, false, false); //true
//        selfTraining.answerCell(false, false, true); //false
//        selfTraining.answerCell(true, false, false); //false

        selfTraining.equalSlices(11, 5, 2); //true
        selfTraining.equalSlices(11, 5, 3); //false
        selfTraining.equalSlices(8, 3, 2); //true
        selfTraining.equalSlices(8, 3, 3); //false
        selfTraining.equalSlices(24, 12, 2); //true
    }

    // Given an int n, print true if it is within 10 of 100
    public void nearHundred(int n) {
        boolean nearHundred = false;
        if (n >= 90 && n <= 110) {
            nearHundred = true;
            System.out.println("nearHundred(" + n + ") → " + nearHundred);
        }
    }

    // Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    public void lastDigit(int a, int b) {
        boolean digit = false;
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        if (lastDigitA == lastDigitB) {
            digit = true;
            System.out.println("The numbers " + a + " and " + b + " have the same last digit → " + digit);
        }
    }

    // Given three int values, a b c, print the largest.
    public void maxInt(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest value among " + a + ", " + b + ", " + c + " is " + max);
    }

    // Given two int values, a and b, print true if either one is 7. Or if their sum is 7
    public void seven(int a, int b) {
        if (a == 7 || b == 7) {
        System.out.println("One of the values of " + a + " and " + b + " is 7.");
    } else if (a + b == 7) {
            System.out.println("Summary of the values of " + a + " and " + b + " is 7.");
        }
    }

    // Your cell phone rings. Print true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            System.out.println("Do not answer the phone.");
        } else if (isMorning && !isMom) {
            System.out.println("Do not answer the phone.");
        } else {
            System.out.println("Answer the phone.");
        }
    }

    // Create a function that determines whether or not it's possible to split a pie fairly given these three parameters:
    // Total number of slices.
    // Number of recipients.
    // How many slices each person gets.
    // The function will be in this form:
    // equalSlices(total slices, no. recipients, slices each)
    public void equalSlices (int slices, int recipients, int slicesEach) {
        boolean fairSplit = false;
        if (recipients*slicesEach <= slices) {
            fairSplit = true;
        }
        System.out.println("A pie can be fairly split between all people --> " + fairSplit);
    }
}