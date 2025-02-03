
package Ejercicio5_Ampliacion;

public class main {
    public static void main(String[] args) {
        
        MarcaPagina uno = new MarcaPagina("La bella y la bestia" , 100 , 0);
        
        uno.setTituloLibro("La bella y la bestia");
        System.out.println(uno.getTituloLibro());
        
        
        uno.incremetarPagina();
        uno.ultimaPaginaLeda();
        uno.incremetarPagina();
        uno.ultimaPaginaLeda();
        uno.principioLibro();
        
        
        
    }
}
