/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author JESÚS
 */
public class Vistarequerimiento2  extends AbstractTableModel{

    private List<Requerimiento_2> ListaRequerimiento2;
    
    public Vistarequerimiento2() {
        this( new ArrayList<>() );
    }

    public Vistarequerimiento2(List<Requerimiento_2> ListaRequerimiento2) {
        this.ListaRequerimiento2 = ListaRequerimiento2;
    }
    
    public void setRequerimiento2(int row, Requerimiento_2 requerimiento2){
        ListaRequerimiento2.set(row, requerimiento2);
    }
    
    public Requerimiento_2 getRequerimiento_2(int row){
        return ListaRequerimiento2.get(row);
    }
    
    @Override
    public int getRowCount() {
        return ListaRequerimiento2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
      Requerimiento_2 requerimiento = ListaRequerimiento2.get(row);
      switch(column){
          case 0:
              return requerimiento.getIdMaterial();
          case 1:
              return requerimiento.getNombreMaterial();
          case 2:
              return requerimiento.getCantidad();
          case 3:
              return requerimiento.getPrecio();
          case 4:
              return requerimiento.getPrecioTotal();    
      }
      return null;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
              return "ID_MaterialConstruccion";
          case 1:
              return "Nombre_Material";
          case 2:
              return "Cantidad";
          case 3:
              return "Precio_Unidad";    
          case 4:
              return "Precio_Total";    
        }
        return super.getColumnName(column); 
    }

    
    
}
