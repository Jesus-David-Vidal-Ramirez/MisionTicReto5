package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        String sql = "SELECT mc.ID_MaterialConstruccion , mc.Nombre_Material , "
                + "c.Cantidad , mc.Precio_Unidad, (c.cantidad * mc.Precio_Unidad)"
                + " AS Precio_Total FROM MaterialConstruccion mc INNER JOIN "
                + "Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion"
                + " WHERE c.ID_Proyecto = 14 OR c.ID_Proyecto = 56 OR "
                + "c.ID_Proyecto = 48 OR c.ID_Proyecto = 45 OR c.ID_Proyecto = 36 "
                + "OR c.ID_Proyecto  = 18 OR c.ID_Proyecto  = 20 "
                + "ORDER by c.ID_Proyecto ASC, mc.Precio_Unidad DESC;";

        ArrayList<Requerimiento_2> lista =  new ArrayList<Requerimiento_2>();
        
        try(
            Connection con = JDBCUtilities.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
                ){
            
            while(rs.next()){
              Requerimiento_2 r2 = new Requerimiento_2();
              
              r2.setIdMaterial(rs.getInt("ID_MaterialConstruccion"));
              r2.setNombreMaterial(rs.getString("Nombre_material"));
              r2.setCantidad(rs.getInt("Cantidad"));
              r2.setPrecio(rs.getInt("Precio_Unidad"));
              r2.setPrecioTotal(rs.getInt("Precio_Total"));
              
              lista.add(r2);
            }
        }
        return lista;
    }
}