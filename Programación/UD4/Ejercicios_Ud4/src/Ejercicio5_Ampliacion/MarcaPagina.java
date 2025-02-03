
package Ejercicio5_Ampliacion;

public class MarcaPagina {
    String tituloLibro;
    int totalPaginas;
    int paginaActual;

    public MarcaPagina(String tituloLibro, int totalPaginas, int paginaActual) {
        this.tituloLibro = tituloLibro;
        this.totalPaginas = totalPaginas;
        this.paginaActual = 0;
    }

    public void incremetarPagina(){
    if (paginaActual < totalPaginas){
    paginaActual++;
    } else {
        System.out.println("Ya has llegado a e lmaximo de paginas");
    }
    }
    
    public void ultimaPaginaLeda(){
    
        System.out.println("Página actual: " + paginaActual);
    
    }
    
    
    public void principioLibro(){
    
    paginaActual = 0;
        System.out.println("Has vuelto al principio");
    
    }
    
     
}
