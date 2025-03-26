package ExamenUt4;

//Clase CursoPresencial que extiende de Curso e implementa de Evaluable
public class CursoPresencial extends Curso implements Evaluable {


    public CursoPresencial(String nombreCurso, int duracionHoras) {
        super(nombreCurso, duracionHoras);
    }

    @Override
    public String mostrarInfo() {
        return "Nombre del Curso: " + nombreCurso + "Duracion de Horas: " +  duracionHoras;
    }
    @Override
    public double calificar() {
        return 5.0;
    }

}
