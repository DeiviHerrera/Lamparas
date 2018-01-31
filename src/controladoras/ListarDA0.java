package controladoras;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelos.Lamparas;

public class ListarDA0 {
    
    public static void listardatos(JTextArea elArea){
        
        elArea.setText("LISTADO DE LÁMPARAS");
        
        for (int i = 0; i <LamparasDAO.vLamparas.size() ; i++) {
            
            Lamparas lamparita = new Lamparas();
            lamparita = (Lamparas) LamparasDAO.vLamparas.elementAt(i);
            elArea.append("\n");
            elArea.append("\n");
            elArea.append("\nModelo \t: "+lamparita.getModelo());
            elArea.append("\nPrecio \t: "+lamparita.getPrecio());
            elArea.append("\nPotencia \t: "+lamparita.getPotencia());
            elArea.append("\nColor \t: "+lamparita.getColor());
            elArea.append("\nLuces \t: "+lamparita.getnLuces());
        
       }
    
        
    }
    
    
}
