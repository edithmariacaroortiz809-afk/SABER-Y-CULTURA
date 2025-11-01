package co.sena.edu.SABERYCULTURA;

public class Main {public static void main(String[] args) {
    Book  libro1 = new Book("El Principito", "Antoine de Saint-Exupéry", "9780156012195");
    Book libro2 = new Book("Don Quijote de la Mancha", "Miguel de Cervantes", "9788491050295");
    Book libro3 = new Book("La Odisea", "Homero", "9788497940699");
    Book  libro4 = new Book("Orgullo y Prejuicio", "Jane Austen", "9780141439518");
    Book  libro5 = new Book("Crimen y Castigo", "Fiódor Dostoyevski", "9780143058144");

    libro1.mostrarInfo();
    libro2.mostrarInfo();
    libro3.mostrarInfo();
    libro4.mostrarInfo();
    libro5.mostrarInfo();
}
}
