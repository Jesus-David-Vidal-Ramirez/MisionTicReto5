package utp.misiontic2022.c2.p17.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_3Dao;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    // Su código
    
    private Requerimiento_1Dao requerimiento1Dao;
    private Requerimiento_2Dao requerimiento2Dao;
    private Requerimiento_3Dao requerimiento3Dao;
    
    public ControladorRequerimientos(){
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();
    }
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> requerimiento1 = requerimiento1Dao.requerimiento1();
        for (Requerimiento_1 requerimiento_1 : requerimiento1) {
            System.out.println(requerimiento_1);
        }
        return requerimiento1;
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> requerimiento2 = requerimiento2Dao.requerimiento2();
        for (Requerimiento_2 requerimiento_2 : requerimiento2) {
            System.out.println(requerimiento_2);
        }
        return requerimiento2;
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> requerimiento3 = requerimiento3Dao.requerimiento3();
        for (Requerimiento_3 requerimiento_3 : requerimiento3) {
            System.out.println(requerimiento_3);
        }
        return requerimiento3;
    }
}