
package ejercicio_ampliacion2;

public class biblioteca {
    private Libro[] libros;
    private int contador;
    
    public biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        contador = 0;
    }
    
    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
            System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
        } else {
            System.out.println("No se puede agregar más libros, la biblioteca está llena.");
        }
    }

    public void mostrarLibros(){
      if (contador == 0) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            for (int i = 0; i < contador; i++) {
                libros[i].mostrarInformacion();
            }
        }
    }
   
}
