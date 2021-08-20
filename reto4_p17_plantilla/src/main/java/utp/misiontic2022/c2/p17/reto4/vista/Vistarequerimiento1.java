/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;

/**
 *
 * @author JESÚS
 */
public class Vistarequerimiento1 extends AbstractTableModel{

    private List<Requerimiento_1> ListaRequerimiento1;
    
    public Vistarequerimiento1() {
        this( new ArrayList<>() );
    }

    public Vistarequerimiento1(List<Requerimiento_1> ListaRequerimiento1) {
        this.ListaRequerimiento1 = ListaRequerimiento1;
    }
    
    public void setRequerimiento1(int row, Requerimiento_1 requerimiento1){
        ListaRequerimiento1.set(row, requerimiento1);
    }
    
    public Requerimiento_1 getRequerimiento_1(int row){
        return ListaRequerimiento1.get(row);
    }
    
    @Override
    public int getRowCount() {
        return ListaRequerimiento1.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
      Requerimiento_1 requerimiento = ListaRequerimiento1.get(row);
      switch(column){
          case 0:
              return requerimiento.getNombre();
          case 1:
              return requerimiento.getCargo();
          case 2:
              return requerimiento.getCantidadProyecto();
      }
      return null;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
              return "Lider";
          case 1:
              return "Cargo";
          case 2:
              return "# Proyectos";
        }
        return super.getColumnName(column); 
    }

    
    
    
    
}
