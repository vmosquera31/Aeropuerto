package aeropuerto;

public class Avion extends Persona{
    private int tiempoAterrizaje;
    private String producto;
    private int precio;

    public Avion(int tiempoAterrizaje, 
            String producto, 
            int precio, 
            String nombreAzafata, 
            int edad, 
            String universidad) {
        super(nombreAzafata, edad, universidad);
        this.tiempoAterrizaje = tiempoAterrizaje;
        this.producto = producto;
        this.precio = precio;
    }

    public int getTiempoAterrizaje() {
        return tiempoAterrizaje;
    }

    public void setTiempoAterrizaje(int tiempoAterrizaje) {
        this.tiempoAterrizaje = tiempoAterrizaje;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
