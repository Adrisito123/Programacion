package Ejercicios;

public class Persona implements Comparable<Persona> {

    // Atributos
    protected String nombre;
    protected int edad;
    protected double estatura;
    protected String apellido;

    // Constructor principal
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Constructor con valores predeterminados
    public Persona() {
        this("Ronaldo", 39, 1.87);
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, double estatura, String apellido) {
        this(nombre, edad, estatura);
        this.apellido = apellido;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("No puedes tener esa edad");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura >= 0) {
            this.estatura = estatura;
        } else {
            System.out.println("No puedes tener esa estatura");
        }
    }

    // Métodos adicionales
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    void cumplirAnyios() {
        edad++;
        System.out.println("Este año cumples " + edad + " años");
    }

    void crecer(double incremento) {
        estatura += incremento;
        System.out.println("Tu estatura es: " + estatura);
    }

    /* @Override
    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.nombre);
    }
     */

    /*
    @Override
    public int compareTo(Persona o) {

        return Integer.compare(this.edad, o.edad);
    }

     */
/*
    @Override
    public int compareTo(Persona o) {
        if(this.nombre.compareTo(o.nombre) == 0) {
            return Integer.compare(this.edad, o.edad);
        }
        return this.nombre.compareTo(o.nombre);
    }

 */
   /*
    @Override
    public int compareTo(Persona o) {
        return this.apellido.compareTo(o.apellido);
    }

    */

    @Override
    public int compareTo(Persona o) {
        int compararApellido = this.apellido.compareTo(o.apellido);
        if(compararApellido != 0){
            return compararApellido;
        }


        int compararNombre = this.nombre.compareTo(o.nombre);
        if(compararNombre != 0){
            return compararNombre;
        }


        return Integer.compare(this.edad, o.edad);
    }





    @Override
    public String toString() {
        return nombre + " - " + edad + " años - " + estatura + "m";
    }
}
