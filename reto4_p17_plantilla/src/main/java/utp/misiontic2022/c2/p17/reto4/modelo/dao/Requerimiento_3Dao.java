package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
         String sql = "select p.ID_Proyecto , p.Ciudad, p.Clasificacion, "
                 + "sum(c.Cantidad * mc.Precio_Unidad) AS Costo_Proyecto"
                 + " from Proyecto p INNER JOIN Compra c ON "
                 + "c.ID_Proyecto = p.ID_Proyecto INNER JOIN MaterialConstruccion"
                 + " mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion"
                 + " WHERE p.Ciudad = 'Pereira' OR p.Ciudad = 'Sta. Rosa de Cabal' "
                 + "GROUP BY p.ID_Proyecto HAVING Costo_Proyecto > 87000 ORDER BY "
                 + "Ciudad, Clasificacion ASC;";
        
        ArrayList<Requerimiento_3> requerimiento3 = new ArrayList<>();
  
        try(
            Connection conexion = JDBCUtilities.getConnection();
            Statement smt = conexion.createStatement();
            ResultSet rs = smt.executeQuery(sql);    
                ){
            
            while(rs.next()){
                Requerimiento_3 r3 =  new Requerimiento_3();
               
                r3.setIdProyecto(rs.getInt("ID_Proyecto"));
                r3.setCiudad(rs.getString("Ciudad"));
                r3.setClasificacion(rs.getString("Clasificacion"));
                r3.setCostoProyecto(rs.getString("Costo_Proyecto"));
                
                requerimiento3.add(r3);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
//       
//        for (Requerimiento_3 requerimiento_3 : lista) {
//            System.out.println(requerimiento_3);
//        }
        
        return requerimiento3;
    }
}