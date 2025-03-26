package ExamenUt4;

public class Persona {
    //ENCAPSULACIÓN son privadas y se ven por los getter y setters
    private String nombre;
    private int edad;
    private genero genero;

    public Persona(String nombre, int edad, genero genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }


    // Metodo que pasa todo a String y si es mayor o igual a 18 en vez de edsd te dice que es mayor de edad si no te dice que es menor
    @Override
    public String toString(){
        if(edad >= 18){
           return "Nombre: " + nombre + "Edad: Es mayor de edad" + "Genero: " + genero ;
        }
        return "Nombre: " + nombre + "Edad: Es menor de edad"  + "Genero: " + genero;
    }

    public void incrementarPersona(int numPersonas){
        numPersonas = numPersonas + 1;
        System.out.println("Cantidad de Personas: " + numPersonas);
    }


    public boolean equals(Persona nombre , Persona edad) {
        if(this.nombre.equals(nombre) && this.edad == edad.getEdad()){
            return true;
        }
        return false;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public genero getGenero(){
        return genero;
    }
    public void setGenero(genero genero){
        this.genero = genero;

    }

}
