
package ejercicios_ud4;

public class Empleados extends Persona{
    double salario;
    
    Empleados (double salario){
        this.salario = salario;
        super.nombre = nombre;
    }
    
    double getSalario(){
        return salario;
    }
}
