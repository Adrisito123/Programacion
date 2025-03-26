package Ejercicio4_17;

public abstract class Vehiculo implements Maintenance {

    private String matricula;
    private String marca;
    private int anyo;
    private FuelType FuelType;

    public Vehiculo(String matricula, String marca, int anyo, FuelType FuelType) {
        this.matricula = matricula;
        this.marca = marca;
        this.anyo = anyo;
        this.FuelType = FuelType;
    }

    public void mostrarInfromacion() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("AÑO: " + anyo);
        System.out.println("Tipo de Combustible: " + FuelType);
    }

    public abstract double calculateSpeed();
    public abstract String toString();
    public static void contador() {
        int contador = 0;
        contador++;
        System.out.println("Número de vehículos: " + contador);
    }

    @Override
    public String getDate() {
        return "El coche con matrícula: " + matricula + " necesita mantenimiento";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return this.marca.equals(vehiculo.marca) && this.matricula.equals(vehiculo.matricula)
                && this.anyo == vehiculo.anyo && this.FuelType.equals(vehiculo.FuelType);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public FuelType getFuelType() {
        return FuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.FuelType = fuelType;
    }
}
