package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        String sql = "SELECT l.Nombre || ' ' || l.Primer_Apellido AS Lider, "
                + "l.Cargo  , COUNT(p.ID_Proyecto) AS '# Proyectos' from Lider l"
                + " INNER JOIN Proyecto p ON p.ID_Lider  = l.ID_Lider "
                + "WHERE p.Constructora = 'Pegaso' GROUP By l.ID_Lider ORDER BY"
                + " l.Cargo , Lider; ";
        
        ArrayList<Requerimiento_1> requerimiento1 = new ArrayList<>();
  
        try(
            Connection conexion = JDBCUtilities.getConnection();
            Statement smt = conexion.createStatement();
            ResultSet rs = smt.executeQuery(sql);    
                ){
            
            while(rs.next()){
                Requerimiento_1 r1 =  new Requerimiento_1();
                r1.setNombre(rs.getString("Lider"));
                r1.setCargo(rs.getString("Cargo"));
                r1.setCantidadProyecto(rs.getInt("# Proyectos"));
                
                requerimiento1.add(r1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
       
        return requerimiento1;
    }
}