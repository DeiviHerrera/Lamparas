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
            
            Lamparas obj1 = new Lamparas();
            obj1 = (Lamparas) LamparasDAO.vLamparas.elementAt(i);
            elArea.append("\n");
            elArea.append("\n");
            elArea.append("\nModelo \t: "+obj1.getModelo());
            elArea.append("\nPrecio \t: "+obj1.getPrecio());
            elArea.append("\nPotencia \t: "+obj1.getPotencia());
            elArea.append("\nColor \t: "+obj1.getColor());
            elArea.append("\nLuces \t: "+obj1.getnLuces());
        
       }
    
        
    }
    
    
    /*public static void listardatos(JTable laTabla){
        
        String titulo[] = new String[]{"Código", "Descripción","Abc"};
        DefaultTableModel mdl= new DefaultTableModel(titulo,0);
        
        for (int i = 0; i <LamparasDAO.vLamparas.size() ; i++) {
            Lamparas obj1 = new Lamparas();
            obj1 = (Lamparas) LamparasDAO.vLamparas.elementAt(i);
        
        }
        
        laTabla.setModel(mdl);
        
        
        
    
        TableColumnModel columnModel = laTabla.getColumnModel();

        //laTabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //laTabla.doLayout();
        
       /* columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(450);
        columnModel.getColumn(2).setPreferredWidth(450);
    }*/
    
    
}
