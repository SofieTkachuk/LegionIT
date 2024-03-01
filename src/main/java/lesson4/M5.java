package lesson4;

import java.util.*;

public class M5 {
    public static void main(String[] args) {
        M5 m5 = new M5();
        //m5.getDay(8);
        //m5.getToyByID(12);
        //m5.getToyByID();

        ArrayList<String> word = new ArrayList<String>(Arrays.asList("Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom" , "Tim", "Anna", "Lucy"));
        m5.wordsNoDublicates(word);
    }

    // Assignment 1
    // Create a method with an array list of days of the week from Sunday to Saturday. The method can receive a number and return/print the day of the week.

    public String getDay(int day) {
        ArrayList<String> newDay = new ArrayList<String>();
        newDay.add("Sunday");
        newDay.add("Monday");
        newDay.add("Tuesday");
        newDay.add("Wednesday");
        newDay.add("Thursday");
        newDay.add("Friday");
        newDay.add("Saturday");

        if (day >= 1 && day <= newDay.size()) {
            String dayIs = newDay.get(day - 1);
            System.out.println(dayIs);
            return dayIs;
        } else {
            System.out.println("Invalid day number");
            return "Invalid day number";
        }
    }

    // Assignment 2
    // The online Toys store has 5 different products – Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6), Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56). Each product has its own unique ID.
    // Please create a Method “public String getToyById(int id)” which will build the hashmap of ids/products described above (Hashmap<Integer, String>) and return the name of the toy by ID.
    // For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.
    // If there is no product with an id specified in the call, return “No such Toy” String instead.

    public String getToyByID(int id) {

        HashMap<Integer, String> toy = new HashMap<Integer, String>();
        toy.put(12, "Batmobile");
        toy.put(45, "Light Saber");
        toy.put(6, "Wonder Woman");
        toy.put(201, "Hello Kitty Bag");
        toy.put(56, "Junior QA Analyst Doll");

        if (toy.containsKey(id)) {
            System.out.println(toy.get(id));
            return toy.get(id);
        } else {
            System.out.println("No such Toy");
            return "No such Toy";
        }
    }

    // Instead of providing the id, get the user output by using the Scanner.

    public String getToyByID() {

        Scanner scanner = new Scanner(System.in);
        // ask the question in console
        System.out.print("Enter the Toy ID: ");
        // get  input as a String
        int idScanner = Integer.parseInt(scanner.next());
        return getToyByID(idScanner);
    }

    // Assignment 3
    // The program should receive an ArrayList of Strings and print all the words with no duplicates.
    // Input: [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
    // Output: [Steve, Tim, Lucy, Pat, Angela, Tom, Anna]

    public void wordsNoDublicates(ArrayList<String> word) {

        System.out.println("Input: " + word);
        Collections.sort(word);
        System.out.println("Input sorted: " + word);

        // Tips:
        // What if you will sort the array before removing the duplicates?
        // What if you use some different collections?

        HashSet<String> list = new LinkedHashSet<String>(word);
        System.out.println("Output: " + list);
    }
}



