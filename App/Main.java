
package App;
import library.Book;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("978-1001", "Java Basics");
        Book book2 = new Book("978-1002", "Programming");
        book1.rename("Advanced Java");
        System.out.println("ISBN: " + book1.getIsbn());

        System.out.println("Updated title: " + book1.getTitle());

        System.out.println(
                "Books created: " + Book.getBooksCreated()
        );
    }
}
