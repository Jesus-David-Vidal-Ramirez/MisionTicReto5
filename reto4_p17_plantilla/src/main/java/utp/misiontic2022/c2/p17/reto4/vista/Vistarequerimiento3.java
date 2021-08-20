/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
/**
 *
 * @author JESÚS
 */
public class Vistarequerimiento3 extends AbstractTableModel{

    private List<Requerimiento_3> ListaRequerimiento3;
    
    public Vistarequerimiento3() {
        this( new ArrayList<>() );
    }

    public Vistarequerimiento3(List<Requerimiento_3> ListaRequerimiento3) {
        this.ListaRequerimiento3 = ListaRequerimiento3;
    }
    
    public void setRequerimiento3(int row, Requerimiento_3 requerimiento3){
        ListaRequerimiento3.set(row, requerimiento3);
    }
    
    public Requerimiento_3 getRequerimiento_3(int row){
        return ListaRequerimiento3.get(row);
    }
    
    @Override
    public int getRowCount() {
        return ListaRequerimiento3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
      Requerimiento_3 requerimiento = ListaRequerimiento3.get(row);
      switch(column){
          case 0:
              return requerimiento.getIdProyecto();
          case 1:
              return requerimiento.getCiudad();
          case 2:
              return requerimiento.getClasificacion();
          case 3:
              return requerimiento.getCostoProyecto();
             
      }
      return null;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
          case 0:
              return "ID_Proyecto";
          case 1:
              return "Ciudad";
          case 2:
              return "Clasificacion";
          case 3:
              return "Consto_Proyecto";    
           
        }
        return super.getColumnName(column); 
    }

    
    
}
