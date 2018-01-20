
package modelos;

public class Reporte {


 private String Modelo; 
 private int Cantidad; 	  
 private double Precio; 
 private double Importe; 
 private double Descuento;
 private double Total; 	
 private String Obsequio;
 private String premio;

    public Reporte() {
    }

    public Reporte(String Modelo, int Cantidad, double Precio, double Importe, double Descuento, double Total, String Obsequio) {
        this.Modelo = Modelo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Importe = Importe;
        this.Descuento = Descuento;
        this.Total = Total;
        this.Obsequio = Obsequio;
    }

    public Reporte(String Modelo, int Cantidad, double Precio, double Importe, double Descuento, double Total, String Obsequio, String premio) {
        this.Modelo = Modelo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Importe = Importe;
        this.Descuento = Descuento;
        this.Total = Total;
        this.Obsequio = Obsequio;
        this.premio = premio;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getObsequio() {
        return Obsequio;
    }

    public void setObsequio(String Obsequio) {
        this.Obsequio = Obsequio;
    }
   
        
        
}
