
package controladoras;

import javax.swing.JTextArea;
import modelos.Reporte;

public class VentasDAO {
    
    public static int p1=(int) LamparasDAO.porcentaje1;
    public static int p2=(int) LamparasDAO.porcentaje2;
    public static int p3=(int) LamparasDAO.porcentaje3;
    public static int p4=(int) LamparasDAO.porcentaje4;

    public static void ventas
        (JTextArea elArea, int cantidad, String modelo, 
           double importe, double precio, double descuento,int nromodelo) {
            
           
    elArea.setText("\n Modelo \t:   "+modelo); 
    elArea.append("\n Cantidad \t:   "+cantidad);
    elArea.append("\n Precio \t:   "+precio);
    elArea.append("\n Importe \t:   "+importe);
    
    LamparasDAO.contador++;
   
        if (LamparasDAO.contador % 5==0) {
            elArea.append("\n Premio \t:" +LamparasDAO.premioSorpresa);
        }
      // elArea.append("\n numero de venta \t:" +LamparasDAO.contador);
       
    Reporte unreporte;
    
    if (cantidad<6) {
        descuento=(importe*(LamparasDAO.porcentaje1/100)); elArea.append("\n Descuento "+p1+"%"+" :  "+descuento);}
        else {
            if (cantidad<11){
                descuento=(importe*(LamparasDAO.porcentaje2/100)); elArea.append("\n Descuento "+p2+"%"+" :  "+descuento); } 
                else {
                 if (cantidad<=15){
                     descuento=(importe*(LamparasDAO.porcentaje3/100)); elArea.append("\n Descuento "+p3+"%"+" :  "+descuento);;}
                    else {
                        if (cantidad>15) {
                            descuento=(importe*(LamparasDAO.porcentaje4/100)); elArea.append("\n Descuento "+p4+"%"+" :  "+descuento);}
                            else {   
                                if (true) 
                                    {        } 
                                    else {
                          }}}}}
    
    
        double total = importe-descuento;
           elArea.append("\n Total \t:   "+total);
           
       if(cantidad>=LamparasDAO.cantidadMinimaObsequiable && modelo.equalsIgnoreCase(LamparasDAO.modeloObsequiable)){
           elArea.append("\n Obsequio \t:     "+LamparasDAO.obsequio);
            unreporte = new Reporte(modelo, cantidad, precio, importe, descuento, total, LamparasDAO.obsequio);
       } else {
        unreporte = new Reporte(modelo, cantidad, precio, importe, descuento, total, "no"); 
       }
       
        
       
       LamparasDAO.reporte.add(unreporte);
       
     }
    
    
}
