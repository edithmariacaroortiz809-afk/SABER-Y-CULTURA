#  Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Estudiante:** Edith María Caro Ortiz  
**Ficha:** 3228973B  
**Dominio:** Biblioteca “Saber y Cultura”

---

## Diferencias entre Programación Estructurada y Programación Orientada a Objetos

### 🔹 Programación Estructurada
- Se enfoca en las **acciones o pasos** que el programa debe seguir.  
- Usa **funciones y variables sueltas**, sin pensar tanto en los objetos del mundo real.  
- Es buena para programas pequeños o simples.  
- A veces se vuelve más difícil de mantener cuando el programa crece.

**Ejemplo:**  
Si quiero guardar información de un libro, tendría que crear varias variables y una función para mostrar los datos.

```java
// Programación estructurada
String titulo = "Cien Años de Soledad";
String autor = "Gabriel García Márquez";
String isbn = "978-0307474728";

void mostrarLibro() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("ISBN: " + isbn);
}
```

Aquí el problema es que si quiero tener más libros, tendría que crear muchas variables nuevas y repetir el mismo código una y otra vez.

---

###  Programación Orientada a Objetos (POO)
- Se enfoca en **objetos** que representan cosas reales (como un libro, un usuario, o una sala).  
- Cada objeto tiene **atributos (características)** y **métodos (acciones)**.  
- Permite **organizar mejor el código**, hacerlo más claro y fácil de modificar.  
- Se usa mucho en proyectos grandes o con muchas partes relacionadas.

**Ejemplo:**  
Con POO puedo crear una clase “Book” que representa un libro, y luego crear todos los libros que quiera sin repetir tanto código.

```java
// Programación Orientada a Objetos
public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void showInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
```

Y luego, en el programa principal, puedo crear varios objetos de tipo `Book`:

```java
Book libro1 = new Book("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728");
Book libro2 = new Book("Rayuela", "Julio Cortázar", "978-8420471914");

libro1.showInfo();
libro2.showInfo();
```


**Fecha:** Octubre de 2025  
**Hecho por:** Edith María Caro Ortiz 
