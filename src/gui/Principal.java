package gui;

import controladoras.LamparasDAO;
import controladoras.VentasDAO;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        // Código personal para llamar a un formulario
        JFrame frame = new FrmMenu();
        
       // frame.setSize(1204, 768);
        
        
        //Centrado
  
        frame.setVisible(true);
        
           
       /* frame.setVisible(true);
        Dimension dim = frame.getToolkit().getScreenSize();
        frame.setLocationRelativeTo(frame);
        frame.setSize(dim);*/
        
        
        //Activa la carga de los datos al vector
        LamparasDAO.pCargarDatosLamparasAlVector();
        
        
        
    }
    
}
