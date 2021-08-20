package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private int idProyecto;
    private String ciudad;
    private String clasificacion;
    private String costoProyecto;

    public Requerimiento_3() {
    }

    
    public Requerimiento_3(int idProyecto, String ciudad, String clasificacion, String costoProyecto) {
        this.idProyecto = idProyecto;
        this.ciudad = ciudad;
        this.clasificacion = clasificacion;
        this.costoProyecto = costoProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(String costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    @Override
    public String toString() {
        return idProyecto + " " + ciudad + " " + clasificacion + " " + costoProyecto  ;
    }
   
}
