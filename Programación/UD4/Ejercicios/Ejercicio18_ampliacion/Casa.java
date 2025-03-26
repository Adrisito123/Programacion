package Ejercicio18_ampliacion;

public class Casa {
    private boolean interruptorGeneral;
    Bombilla[] bombillas;

    public Casa( int numBombillas) {
        bombillas = new Bombilla[numBombillas];
    }

    public void encenderTodas(){
        this.interruptorGeneral =true;
    }
    public void apagarTodas(){
        this.interruptorGeneral=false;
    }

    public void InterruptorGeneral() {
        if(this.interruptorGeneral){
            System.out.println("Se han encendido todas las bombillas");
        } else {
            System.out.println("Se han apagado todas las bombillas");
        }
    }

    public boolean getInterruptorGeneral() {
        return interruptorGeneral;
    }

    public void setInterruptorGeneral(boolean interruptorGeneral) {
        this.interruptorGeneral = interruptorGeneral;
    }
}
