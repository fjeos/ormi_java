package weeklyquiz3;

import java.util.Objects;

public class Book<T> {
    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book<?> book = (Book<?>) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(identifier, book.identifier);
    }
}
