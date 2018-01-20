
package modelos;


public class Lamparas {
    private String _modelo;
    private double _precio;
    private int _potencia;
    private String _color;
    private int _nLuces;

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double _precio) {
        this._precio = _precio;
    }

    public int getPotencia() {
        return _potencia;
    }

    public void setPotencia(int _potencia) {
        this._potencia = _potencia;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public int getnLuces() {
        return _nLuces;
    }

    public void setnLuces(int _nLuces) {
        this._nLuces = _nLuces;
    }

    public Lamparas() {
    }

    public Lamparas(String _modelo, double _precio, int _potencia, String _color, int _nLuces) {
        this._modelo = _modelo;
        this._precio = _precio;
        this._potencia = _potencia;
        this._color = _color;
        this._nLuces = _nLuces;
    }
    
    
}
