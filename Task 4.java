
package library;

public class Book{
    private final String isbn;
    private String title;

    private static int booksCreated = 0;

    public Book(String isbn, String title) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("Invalid ISBN");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }
        this.isbn = isbn;
        this.title = title;
        booksCreated++;
    }
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    public void rename(String newTitle) {
        if (newTitle == null || newTitle.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }
        this.title = newTitle;
    }
    public static int getBooksCreated() {
        return booksCreated;
    }
}
