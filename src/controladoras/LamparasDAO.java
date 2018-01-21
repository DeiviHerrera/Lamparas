package controladoras;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelos.Lamparas;
import modelos.Reporte;

public class LamparasDAO {
    
    //Todos los datos de las lámparas en un Vector
    public static Vector vLamparas = new Vector(100,5);
    public static ArrayList<Reporte> reporte = new ArrayList<Reporte>();
    
// Datos mínimos del primer modelo
    public static String modelo0 = "MEDUSA";
    public static double precio0 = 135.0;
    public static int potencia0 = 60;
    public static String color0 = "Blanco";
    public static int nluces0 = 4; 
 
// Datos mínimos del segundo modelo
    public static String modelo1 = "KEFREN";
    public static double precio1 = 150.0; 
    public static int potencia1 = 75;
    public static String color1 = "Plata"; 
    public static int nluces1 = 3; 
 
// Datos mínimos del tercer modelo 
    public static String modelo2 = "KASK";
    public static double precio2 = 160.0; 
    public static int potencia2 = 120; 
    public static String color2 = "Negro";
    public static int nluces2 = 4; 
 
// Datos mínimos del cuarto modelo 
    public static String modelo3 = "HOT"; 
    public static double precio3 = 250.0;
    public static int potencia3 = 60;
    public static String color3 = "Blanco";
    public static int nluces3 = 5; 
 
// Datos mínimos del quinto modelo 
    public static String modelo4 = "LAIA"; 
    public static double precio4 = 89.0;
    public static int potencia4 = 120;
    public static String color4 = "Rojo"; 
    public static int nluces4 = 3; 
 
// Porcentajes de descuento 
    public static double porcentaje1 = 0.01;
    public static double porcentaje2 = 0.02;
    public static double porcentaje3 = 0.03;
    public static double porcentaje4 = 0.04;  
// Cantidad óptima de lámparas vendidas 
    public static int cantidadOptima = 50; 
 
// Modelo para el cual se otorga el obsequio 
    public static String modeloObsequiable = "KEFREN"; 
 
// Cantidad mínima de lámparas adquiridas para obtener el obsequio 
    public static int cantidadMinimaObsequiable = 20; 
 	 
// Obsequio 
    public static String obsequio = "USB"; 
    
    // numero cliente 
    public static int numerocliente = 5; 
 
// Número de cliente que recibe el premio sorpresa public static int numeroClienteSorpresa = 5; 
 
// Premio sorpresa 
    public static String premioSorpresa = "Una agenda"; 
 
    public static void guardarventas(Reporte reporte){   

}
 
    public static void pCargarDatosLamparasAlVector(){
        //Son 5 modelos de lámparas
        //La primera lámpara
        vLamparas.removeAllElements();
        Lamparas unaLampara = new Lamparas("MEDUSA", 135, 60, "Blanco", 4);
        vLamparas.addElement(unaLampara);
        
        //La segunda lámpara
        unaLampara = new Lamparas("KEFREN", 150, 75, "Plata", 3);
        vLamparas.addElement(unaLampara);

        //La Tercera lámpara
        unaLampara = new Lamparas("KASK", 160, 120, "Negro", 4);
        vLamparas.addElement(unaLampara);

        //La cuarta lámpara
        unaLampara = new Lamparas("HOT", 250, 60, "Blanco", 5);
        vLamparas.addElement(unaLampara);

        //La segunda lámpara
        unaLampara = new Lamparas("LAIA", 89, 120, "Rojo", 3);
        vLamparas.addElement(unaLampara);   
        
        //JOptionPane.showMessageDialog(null, "Cargado :)");
    }
    public int guardarventa (VentasDAO unaventa){
        vLamparas.addElement(unaventa);
        int cantidad = vLamparas.size();
        return cantidad;
    
    }
    
    public static int contador = 0; 
}
