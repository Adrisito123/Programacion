package ExamenUt4;

public class main {
    public static void main(String[] args) {

        Persona persona1 =  new Persona("Juan" , 20 , genero.masculino);
        //HERENCIA
        Estudiante estudiante1 = new Estudiante("Pablo" , 20 , genero.masculino ,"Con matricula" , "Informática");
        CursoPresencial curso1 = new CursoPresencial("Daw" , 2);
        Academia academia1 = new Academia(28 , 8);

        persona1.setNombre("Javier");
        persona1.setEdad(25);
        persona1.setGenero(genero.masculino);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getGenero());

        persona1.incrementarPersona(1);

        estudiante1.modificar(22 , persona1);
        System.out.println(estudiante1.toString());

        System.out.println(curso1.mostrarInfo());
        System.out.println(curso1.calificar());

        academia1.agregarOeliminarCursos();
        academia1.agregarOeliminarEstudiantes();
        System.out.println(academia1.toString());
        System.out.println(academia1.cursoPresencial());


    }
}
