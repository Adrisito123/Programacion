package ejercicios_ud4;

public class Fiesta {

    public static void main(String[] args) {
        Persona pepe = new Persona();
        Persona paco = new Persona();
        Persona juan = new Persona("Juan", 19, 1.70,"Dominguez");
        Persona adrian = new Persona();
        Persona hugo = new Persona();
        
        System.out.println(juan.getNombre() + " " + juan.getEdad() + " " + juan.getEstatura());
        adrian.setNombre("Adrian");
        adrian.setEdad(20);
        adrian.setEstatura(1.76);
        adrian.setSexo(Sexo.HOMBRE);
        System.out.println(adrian.getNombre() + " " + adrian.getEdad() + " " + adrian.getEstatura() + " " + adrian.getSexo() );
       
        Empleados Manuel = new Empleados();
        System.out.println("Empleado: " + Manuel.nombre);
        System.out.println("Empelado: " + Manuel.salario );
    }

}
