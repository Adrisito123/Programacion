package ExamenUt4;

public class Academia {

    Estudiante[] estudiantes;
    Curso[]cursos;
    int numEstudiantes;
    int numCursos;

    //Constructor donde ponemos que el tamaño de los arrays es de 3
    public Academia(int estudiantes , int crusos){
        this.estudiantes = new Estudiante[3];
        this.cursos = new Curso[3];
    }

    public int agregarOeliminarEstudiantes(){
        if(estudiantes.length ==  estudiantes.length +1){
            return numEstudiantes++;
        } else if(estudiantes.length ==  estudiantes.length -1){
            return numEstudiantes = numEstudiantes - 1;
        }
        return numEstudiantes;
    }

    public int  agregarOeliminarCursos(){
        if(cursos.length ==  cursos.length +1){
            return numCursos++;
        } else if(cursos.length ==  cursos.length -1){
            return numCursos = numCursos - 1;
        }
        return numCursos;
    }

    @Override
    public String toString(){
        return "Numero de Estudiantes: " + numEstudiantes + " " + "Numero de Cursos: " +  numCursos;
    }

    public String cursoPresencial(){
        for(int i = 0 ; i < cursos.length; i++){
            if(cursos[i] != null){
                return "Es una clase Presencial";
            }
        }
        return "No es una clase Presencial";
    }

}
