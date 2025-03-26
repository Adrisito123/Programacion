package Ejercicio18_ampliacion;

public class Bombilla {
    private boolean estado;

    public Bombilla(boolean encendida) {
        this.estado= encendida;
    }

    public void encendida() {
        this.estado = true;
    }
    public void apagada() {
        this.estado = false;
    }

    public void encendidaOapagada(){
        if(this.estado){
            System.out.println("Bombilla encendida");
        }
        else{
            System.out.println("Bombilla apagada");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

