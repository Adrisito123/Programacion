package Ejercicio17_ampliacion;

public class Main {
    public static void main(String[] args) {

        Futbolista deportista1 = new Futbolista("Crisitano",40,"Futbol","Delantero",928);
        Futbolista deportista2 = new Futbolista("Badé",24,"Futbol","Defensa",9);

        if (deportista1 instanceof Futbolista){
            System.out.println(deportista1.getNombre() + "Es un Futbolista");
        }

        deportista1.setNombre("Crisitano");
        deportista1.setEdad(40);
        deportista1.setDeporte("Futbolista");
        deportista1.setPosicion("Delantero");

        System.out.println(deportista1.getNombre());
        System.out.println(deportista1.getEdad());
        System.out.println(deportista1.getDeporte());
        System.out.println(deportista1.getPosicion());

        deportista1.anotarGol();
        System.out.println(deportista1);

        deportista1.entrenar();
        System.out.println(deportista1.competir());

        EntrenamientoFutbol entrenamiento = new EntrenamientoFutbol("Isaac",21,"Futbol");
        entrenamiento.entrenar();
        System.out.println(entrenamiento.competir());

    }
}
