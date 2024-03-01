public class SelfTraining2 {
    public static void main(String[] args) {
        SelfTraining2 training = new SelfTraining2();

//        training.addChars("dog"); //gdogg
//        training.addChars("red"); //dredd
//        training.addChars("spy"); //yxyy

//        training.maxStart("max snacks"); //true
//        training.maxStart("pax snacks"); //true
//        training.maxStart("paz snacks"); //false

//        training.fizzBuzz("fig"); //Fizz
//        training.fizzBuzz("dib"); //Buzz
//        training.fizzBuzz("fib"); //FizzBuzz

//        training.containsBib("xycbib"); //true
//        training.containsBib("b9b"); //true
//        training.containsBib("bac"); //false

        training.stringTimes("Hi", 2); //"HiHi"
        training.stringTimes("Hi", 3); //"HiHiHi"
        training.stringTimes("Hi", 1); //"Hi"

        training.isPlural("changes"); //true
        training.isPlural("change"); //false
        training.isPlural("dudes"); //true
        training.isPlural("magic"); //false
    }

    // Given a string, take the last char and return a new string with the last char added at the beginning and the end, so "dog" will become "gdogg".
    // The original string should be length 1 or more.
    public String addChars(String str) {
        if (str.length() < 1) {
            return "";
        }
        char lastChar = str.charAt(str.length() - 1);
        String backAround = lastChar + str + lastChar;
        System.out.println(str + " --> " + backAround);
        return backAround;
    }

    // Return true if the given string begins with "max", except the 'm' can be anything, so "pax", "9ax" ... all count.
    public boolean maxStart(String str) {
        if (str.length() >= 3 && str.charAt(1) == 'a' && str.charAt(2) == 'x') {
            System.out.println(str + " true");
            return true;
        }
        System.out.println(str + " false");
        return false;
    }
    // Given string str, if the string starts with "f" return "Fizz".
    // If the string ends with "b" return "Buzz".
    // If both the "f" and "b" conditions are true, return "FizzBuzz".
    // In all other cases, return the string unchanged

    public String fizzBuzz(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            System.out.println(str + " FizzBuzz");
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            System.out.println(str + " Fizz");
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            System.out.println(str + " Buzz");
            return "Buzz";
        }
        System.out.println(str);
        return str;
    }
    // Return true if the given string contains a "bib" string, but where the middle 'i' char can be any char.
    public boolean containsBib (String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2)=='b') {
                System.out.println(str + " true");
                return true;
            }
        }
        System.out.println(str + " false");
        return false;
    }
    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public String stringTimes (String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        System.out.println(result);
        return result;
    }
    // Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".

    public boolean isPlural (String str) {
        char lastChar = str.charAt(str.length() - 1);
        if (lastChar == 's') {
            System.out.println(str + " --> " + "true");
            return true;
        }
        System.out.println(str + " --> " + "false");
        return false;
    }
}

