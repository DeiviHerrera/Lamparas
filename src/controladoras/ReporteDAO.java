
package controladoras;

import javax.swing.JTextArea;
import modelos.Lamparas;
import modelos.Reporte;

public class ReporteDAO {
    
    public static void reporteventasporlampara (JTextArea elArea) {    
        
        elArea.setText("");
        double total=0;
        ventasporlampara(LamparasDAO.modelo0,elArea);
        ventasporlampara(LamparasDAO.modelo1,elArea);
        ventasporlampara(LamparasDAO.modelo2,elArea);
        ventasporlampara(LamparasDAO.modelo3,elArea);
        ventasporlampara(LamparasDAO.modelo4,elArea);
        
        for(Reporte x:LamparasDAO.reporte) {
            total+=x.getTotal();
        }
        elArea.append("\n");
        elArea.append("\n Importe acumulado TOTAL S/ \t: "+total);
         
                

    }
    public static void reportelamparasconventasoptimas (JTextArea elArea) {    
        
        elArea.setText("");
        double total=0;
        lamparasconventasoptimas(LamparasDAO.modelo0,elArea);
        lamparasconventasoptimas(LamparasDAO.modelo1,elArea);
        lamparasconventasoptimas(LamparasDAO.modelo2,elArea);
        lamparasconventasoptimas(LamparasDAO.modelo3,elArea);
        lamparasconventasoptimas(LamparasDAO.modelo4,elArea);
        
        for(Reporte x:LamparasDAO.reporte) {
            total+=x.getTotal();
        }
       // elArea.append("\n");
        //elArea.append("\n Importe acumulado TOTAL S/ \t: "+total);
         
                

    }
    public static void reportepreciosenrelacionenpromedio (JTextArea elArea) {    
        
        elArea.setText("");
        
        double promedio = (LamparasDAO.precio0+LamparasDAO.precio1+LamparasDAO.precio2+
                    LamparasDAO.precio3+LamparasDAO.precio4)/5;
        
        preciosenrelacionenpromedio(LamparasDAO.modelo0,elArea,promedio);
        preciosenrelacionenpromedio(LamparasDAO.modelo1,elArea,promedio);
        preciosenrelacionenpromedio(LamparasDAO.modelo2,elArea,promedio);
        preciosenrelacionenpromedio(LamparasDAO.modelo3,elArea,promedio);
        preciosenrelacionenpromedio(LamparasDAO.modelo4,elArea,promedio);
        
              elArea.append("\n");
              elArea.append("\n");
              elArea.append("\n EL PROMEDIO ES: S/ \t: "+promedio);
         
                

    }
    public static void ventasporlampara (String modelo,JTextArea elArea) {
        int a=0;
        int b=0;
        double z=0;
       
         for(Reporte x:LamparasDAO.reporte) {
            if (x.getModelo().equals(modelo)) {              
                 a++;
                 b+=x.getCantidad();
                 z+=x.getTotal();
                 
            }
              
         }
         
          elArea.append("\n");  
          elArea.append("\n MODELO \t: "+modelo);    
          elArea.append("\n Total de ventas \t: "+a);
          elArea.append("\n Total de unidades vendidas \t: "+b);
          elArea.append("\n Importe acumulado S/ \t: "+z);
          elArea.append("\n");
    }
    public static void lamparasconventasoptimas (String modelo,JTextArea elArea) {
       
        int b=0;
        
         for(Reporte x:LamparasDAO.reporte) {
            if (x.getModelo().equals(modelo)) {              
                 b+=x.getCantidad();}
              
         }
         
          elArea.append("\n");  
          elArea.append("\n MODELO \t: "+modelo);
          elArea.append("\n Total de unidades vendidas \t: "+b);
          elArea.append("\n");
    }
    public static void preciosenrelacionenpromedio (String modelo,JTextArea elArea, double promedio) {
       
        
       String cadena="";
         elArea.setText("   ");
        
        for (int i = 0; i <LamparasDAO.vLamparas.size() ; i++) {
            
            Lamparas obj1 = new Lamparas();
            obj1 = (Lamparas) LamparasDAO.vLamparas.elementAt(i);
            
            if (obj1.getPrecio()>promedio) {
            cadena="(mayor al promedio)";
            }
            else if (obj1.getPrecio()<promedio) {
                cadena="(menor al promedio)";
            }
             else cadena="(igual al promedio)";
        
            elArea.append("\n");
            elArea.append("\n");
            elArea.append("\nModelo \t: "+obj1.getModelo());
            elArea.append("\nPrecio \t: "+obj1.getPrecio()+"\t"+cadena);
            
       }
        
    }
    public static void preciosmaximosyminimos(JTextArea elArea) {
         elArea.setText("");
        
        double promedioprecios = (LamparasDAO.precio0+LamparasDAO.precio1+LamparasDAO.precio2+
                    LamparasDAO.precio3+LamparasDAO.precio4)/5; 
        
        double promediopotencia = (LamparasDAO.potencia0+LamparasDAO.potencia1+LamparasDAO.potencia2+
                    LamparasDAO.potencia3+LamparasDAO.potencia4)/5; 
        
        double p0= LamparasDAO.precio0;
        double p1= LamparasDAO.precio1;
        double p2= LamparasDAO.precio2;
        double p3= LamparasDAO.precio3;
        double p4= LamparasDAO.precio4;
        
        double pt0= LamparasDAO.potencia0;
        double pt1= LamparasDAO.potencia1;
        double pt2= LamparasDAO.potencia2;
        double pt3= LamparasDAO.potencia3;
        double pt4= LamparasDAO.potencia4;
        
       
        
            elArea.append("\n");
            elArea.append("\n");
            elArea.append("\n Precio promedio \t: "+promedioprecios);          
        double preciomayor=p0;
        if(p1>preciomayor)
            preciomayor=p1;
        if(p2>preciomayor)
            preciomayor=p2;
        if(p3>preciomayor)
            preciomayor=p3;
        if(p3>preciomayor)
            preciomayor=p3;
        if(p4>preciomayor)
            preciomayor=p4;
        elArea.append("\n Precio maximo \t: "+preciomayor);
        
         double preciomimino=p0;
        if(p1<preciomimino)
            preciomimino=p1;
        if(p2<preciomimino)
            preciomimino=p2;
        if(p3<preciomimino)
            preciomimino=p3;
        if(p3<preciomimino)
            preciomimino=p3;
        if(p4<preciomimino)
            preciomimino=p4;
        elArea.append("\n Precio minimo \t: "+preciomimino);
        
            elArea.append("\n");
            elArea.append("\n");
            elArea.append("\n Potencia promedio \t: "+promediopotencia);          
        double potenciamayor=pt0;
        if(pt1>potenciamayor)
            potenciamayor=pt1;
        if(pt2>potenciamayor)
            potenciamayor=pt2;
        if(pt3>potenciamayor)
            potenciamayor=pt3;
        if(pt3>potenciamayor)
            potenciamayor=pt3;
        if(pt4>potenciamayor)
            potenciamayor=pt4;
        elArea.append("\n Potencia maximo \t: "+potenciamayor);
        
         double potenciamimino=pt0;
        if(pt1<potenciamimino)
            potenciamimino=pt1;
        if(pt2<potenciamimino)
            potenciamimino=pt2;
        if(pt3<potenciamimino)
            potenciamimino=pt3;
        if(pt3<potenciamimino)
            potenciamimino=pt3;
        if(pt4<potenciamimino)
            potenciamimino=pt4;
        elArea.append("\n Potencia minimo \t: "+potenciamimino);
       
        
         
       
        
    }
}
