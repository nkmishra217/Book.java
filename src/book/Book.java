package book;

public class Book {

    private String name;
    private String author;
    private String isbn;

    Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }


    }

