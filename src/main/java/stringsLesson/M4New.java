package stringsLesson;

public class M4New {
    public static void main(String[] args) {
        M4New m4 = new M4New();
        m4.compareStrings("Set" , "Settlement");
        boolean res = m4.isPalindrome("Wave");
        System.out.println("The given word 'Wave' is palindrome. " + res);
    }
    // Print if one string is part of another
    // CompareStrings(a, b)
    // If Strings are equal, the expected print is "The Strings are the same"
    // If one of the strings is a null -  print: "Cannot compare Strings"
    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.contains(b)) {
            System.out.println(a + " is the part of " + b);
        } else if (b.contains(a)) {
            System.out.println(b + " is the part of " + a);
        } else if (a.equals(b)) {
            System.out.println("The Strings are the same");
        }
    }

    // Given a string, write a program to check if it is palindrome or not (return boolean). Return boolean true or false.
    public boolean isPalindrome(String text){
        text = text.toLowerCase();
        int left = 0;
        int right = text.length()-1;

        while(left < right) {
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
