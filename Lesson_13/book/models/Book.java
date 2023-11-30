package Lesson_13.book.models;

public class Book {
    // унікальний номер
    //назву
    //автора
    //ціну
    //жанр
    //Додайте конструктор, гетери та сетери.

    int id;
    String name;
    String author;
    double price;
    String genre;

    public Book(int id, String name, String author, double price, String genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
