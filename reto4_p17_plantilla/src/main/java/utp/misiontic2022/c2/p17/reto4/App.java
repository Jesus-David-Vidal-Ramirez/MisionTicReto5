package utp.misiontic2022.c2.p17.reto4;

import java.sql.SQLException;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p17.reto4.vista.VistaGUI;
import utp.misiontic2022.c2.p17.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
//        System.out.println("Requerimiento 1");
//        VistaRequerimientos.requerimiento1();
//        
//        System.out.println("\nRequerimiento 2");
//        VistaRequerimientos.requerimiento2();
//
//        System.out.println("\nRequerimiento 3");
//        VistaRequerimientos.requerimiento3();
        
        VistaGUI vg = new VistaGUI();
        vg.setVisible(true);
        vg.setLocationRelativeTo(null);
       
    }
}
