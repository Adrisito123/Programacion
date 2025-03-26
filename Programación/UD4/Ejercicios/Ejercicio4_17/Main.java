package Ejercicio4_17;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("1234-ABC", "Audi",2004,FuelType.gasolina);
        Motocicleta moto1 = new Motocicleta("5678-DEF","Vespa",2010,FuelType.diesel);

        coche1.setMarca("Audi");
        coche1.setMatricula("1234-ABC");
        coche1.setAnyo(2004);
        coche1.setFuelType(FuelType.gasolina);

        System.out.println(coche1.getMatricula());
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getAnyo());
        System.out.println(coche1.getFuelType());
        System.out.println("");


        coche1.contador();
        System.out.println("");
        coche1.mostrarInfromacion();




    }


}
