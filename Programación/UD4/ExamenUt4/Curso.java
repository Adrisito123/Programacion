package ExamenUt4;
//Esto es una clase Curso que implemneta la interfaz Evaluable
public abstract class Curso implements Evaluable {

    //Esto son dos atributos protegidos
    //COMPOSICIÓN TIENE CURSO Y HORAS
    protected String nombreCurso;
    protected int duracionHoras;

    public Curso(String nombreCurso , int duracionHoras){
        this.nombreCurso = nombreCurso;
        this.duracionHoras = duracionHoras;
    }

    //Metodo para mostar la información
    public abstract String mostrarInfo();
}
