package Ejercicio20_ampliacion;

public class Lista {

    private Integer[] tabla;
    private int num;

    public Lista() {
        this.tabla = new Integer[5];
        this.num = 0;
    }




    public Integer[] getTabla() {
        return tabla;
    }

    public void setTabla(Integer[] tabla) {
        this.tabla = tabla;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
