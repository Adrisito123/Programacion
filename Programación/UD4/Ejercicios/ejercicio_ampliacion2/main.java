
package ejercicio_ampliacion2;

public class main {
    public static void main(String[] args) {
        // Crear una biblioteca con capacidad para 5 libros
        biblioteca biblioteca = new biblioteca(5);

        // Crear objetos de la clase Libro con diferentes títulos, autores y años de publicación
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, true);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, true);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, true);

        // Agregar los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar los libros de la biblioteca
        System.out.println("Lista de libros en la biblioteca:");
        biblioteca.mostrarLibros();

    }
}

