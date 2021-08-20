package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_1 {
    // Su código
    private String nombre;
    private String cargo;
    private int cantidadProyecto;

    public Requerimiento_1() {
    }

    public Requerimiento_1(String nombre,  String cargo, int cantidadProyecto) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.cantidadProyecto = cantidadProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCantidadProyecto() {
        return cantidadProyecto;
    }

    public void setCantidadProyecto(int cantidadProyecto) {
        this.cantidadProyecto = cantidadProyecto;
    }

    @Override
    public String toString() {
        return  nombre + " " + cargo + " " + cantidadProyecto ;
    }
}
