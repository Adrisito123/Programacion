package Ejercicios;

public class Cartas {

    String valor;
    String palo;
    public Cartas(String numeroCartas, String palo) {
        this.valor = numeroCartas;
        this.palo = palo;
    }
    public String getNumeroCartas() {
        return valor;
    }
    public void setNumeroCartas(String numeroCartas) {
        this.valor = numeroCartas;
    }
    public String getPalo() {
        return palo;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
