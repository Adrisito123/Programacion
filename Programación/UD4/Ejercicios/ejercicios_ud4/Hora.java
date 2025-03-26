package ejercicios_ud4;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public Hora() {
        this(0, 0, 0); // Inicializamos con 00:00:00
    }

    // Getters y Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Debe estar entre 0 y 23.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido. Debe estar entre 0 y 59.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido. Debe estar entre 0 y 59.");
        }
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

    public void sumarSegundos(int segundos) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo + segundos;

        this.segundo = totalSegundos % 60;
        totalSegundos /= 60;
        this.minuto = totalSegundos % 60;
        totalSegundos /= 60;
        this.hora = totalSegundos % 24;
    }
}

