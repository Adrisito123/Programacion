package ejercicios_ud4;


public class Persona {

    // Atributos
    String nombre;
    private int edad;
    private double estatura;
    private String apellido;
    private Sexo sexo;

    //Constructor
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona() {
        nombre = "Ronaldo";
        edad = 39;
        estatura = 1.87;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad, double estatura, String apellido) {
        this(nombre + " " + apellido);
        this.edad = edad;
        this.estatura = estatura;
    }
    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        if (edad >= 0){
            this.edad = edad;
        } else{
            System.out.println("No puedes tener esas edad");
        }
    }
    public double getEstatura(){
        return estatura;
    }
    public void setEstatura(double estatura){
        if (estatura >= 0){
            this.estatura = estatura;
        } else{
            System.out.println("No puedes teer esa estatura");
        }
    }
    public Sexo getSexo(){
        return sexo;
    }
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    void saludar() {
        System.out.println("Hola soy " + nombre);
    }

    void cumplirAnyios() {
        edad = edad + 1;
        System.out.println("Este año cumples " + edad + " años");
    }

    void crecer(double incremento) {
        estatura = estatura + incremento;
        System.out.println("Tu estatura es: " + estatura);
    }
}
