package co.sena.edu.SABERYCULTURA;

public class Book {String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("---------------------------");
    }
}
