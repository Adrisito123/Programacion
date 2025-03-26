package ExamenUt4;

public class Estudiante extends Persona{

    String matricula;
    String carrera;

    public Estudiante(String nombre , int edad, genero genero , String matricula , String carrera ){
        super(nombre,edad,genero);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public String toString(){
        return super.toString() + "Matricula: " + matricula +"Carrera: " + carrera;
    }

    public void modificar(int edad, Persona persona){
        //Modificar una variable primitiva
        edad = 30;

        //Modificar un atributo pasado como parámetro
        persona.setNombre("Adrián");

        /*
        La edad se modifica y se le pone un valor en este caso de 20
        Y
        El atributo Persona se llama a la clase persona y con los seter y los getter
        hemos podido modificar el nombr een este caso le hemos llamado Arian
         */
    }

}
