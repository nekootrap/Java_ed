class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() { 
        return surname;
    }
    
}

class Book {
    private final Author author; 
    private String bookTitle;
    private int publishingYear;

    public Book(Author author, String bookTitle, int publishingYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1850 || publishingYear > 2050) {
            System.out.println("Invalid publishing year: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}

public class Hw12 {
    public static void main(String[] args) {
        Author author1 = new Author("Андрей", "Савельевич");
        Author author2 = new Author("Игорь", "Игнатьев");

        Book book1 = new Book(author1, "Война и перемирие", 1980);
        Book book2 = new Book(author2, "Конь и копыта", 2004);

        book1.setPublishingYear(2005);
    }
}