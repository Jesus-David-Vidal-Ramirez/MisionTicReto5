package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
             ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
            ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
            ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
