package bookStoreOOP;

public class BookStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K Rowling", 1, 10.5, false, "mp3", 128, "Smith");
        book1.printBookDetails();

        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 20, true, "www.khsduh.com");
        book2.setUsdPrice(10);
        book2.printBookDetails();

//        book1.setAvalable(true);
//        book2.setUsdPrice(38);
//
//        book1.printBookDetails();
//        book2.printBookDetails();
    }
}
