import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfTraining3 {
    public static void main(String[] args) {
        SelfTraining3 st3 = new SelfTraining3();

        int [] has22 = {1, 2, 2}; //true
        int [] has22_2 = {1, 2, 1, 2}; //false
        int [] has22_3 = {2, 1, 2}; //false

        System.out.println(Arrays.toString(has22) + " contains 2 next to another 2 somewhere. It is: " + st3.arrayHas22(has22));
        System.out.println(Arrays.toString(has22_2) + " contains 2 next to another 2 somewhere. It is: " + st3.arrayHas22(has22_2));
        System.out.println(Arrays.toString(has22_3) + " contains 2 next to another 2 somewhere. It is: " + st3.arrayHas22(has22_3));

        int [] lucky13 = {0, 2, 4}; //true
        int [] lucky13_2 = {1, 2, 3}; //false
        int [] lucky13_3 = {1, 2, 4}; //false

        System.out.println(Arrays.toString(lucky13) + " does not contain 1s or 3s. It is: " + st3.arrayNo1or3(lucky13));
        System.out.println(Arrays.toString(lucky13_2) + " does not contain 1s or 3s. It is: " + st3.arrayNo1or3(lucky13_2));
        System.out.println(Arrays.toString(lucky13_3) + " does not contain 1s or 3s. It is: " + st3.arrayNo1or3(lucky13_3));

        int [] maxTriple = {1, 2, 3}; //3
        int [] maxTriple2 = {1, 5, 3}; //5
        int [] maxTriple3 = {5, 2, 3}; //5

        System.out.println("The largest values of " + Arrays.toString(maxTriple) + " is: " + st3.maxIntArray(maxTriple));
        System.out.println("The largest values of " + Arrays.toString(maxTriple2) + " is: " + st3.maxIntArray(maxTriple2));
        System.out.println("The largest values of " + Arrays.toString(maxTriple3) + " is: " + st3.maxIntArray(maxTriple3));

        int [] arrayFront9 = {1, 2, 9, 3, 4}; //true
        int [] arrayFront9_2 = {1, 2, 3, 4, 9}; //false
        int [] arrayFront9_3 = {1, 2, 3, 4, 5}; //false

        System.out.println(Arrays.toString(arrayFront9) + " one of the first 4 elements in the is 9. It is: " + st3.elements(arrayFront9));
        System.out.println(Arrays.toString(arrayFront9_2) + " one of the first 4 elements in the is 9. It is: " + st3.elements(arrayFront9_2));
        System.out.println(Arrays.toString(arrayFront9_3) + " one of the first 4 elements in the is 9. It is: " + st3.elements(arrayFront9_3));

        List<Integer> square = Arrays.asList(1, 2, 3); //1, 4, 9
        List <Integer> square2 = Arrays.asList(6, 8, -6, -8, 1); //36, 64, 36, 64, 1

        System.out.println(square + " multiplies with itself. Result: " + st3.multiplied(square));
        System.out.println(square2 + " multiplies with itself. Result: " + st3.multiplied(square2));
    }

    // Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public boolean arrayHas22 (int [] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    // Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean arrayNo1or3 (int [] ns) {
        for (int n:ns) {
            if (n == 1 || n == 3) {
                return false;
            }
        }
        return true;
    }

    // Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be at least 1.
    public int maxIntArray(int [] max) {
        if (max.length % 2 != 0) {
    }
        if (max.length < 1) {
            System.out.println("Array length is less than 1");
            return Integer.MIN_VALUE;
        }

        int first = max [0];
        int last = max [max.length -1];
        int middle = max [max.length -2];

        return Math.max(Math.max(first, last), middle);
        }

        // Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    public boolean elements (int [] els) {
        int end = Math.min(els.length, 4);
        for (int i = 0; i < end; i++) {
            if (els [i] == 9) {
                return true;
            }
        }
        return false;
    }

    // Given a list of integers, return a list where each integer is multiplied with itself.
    public List <Integer> multiplied (List <Integer> list) {
        List<Integer> multipliedNums = new ArrayList<>();
        for (int n:list) {
            multipliedNums.add(n*n);
        }
        return multipliedNums;
    }
}
