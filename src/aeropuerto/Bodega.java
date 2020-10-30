package aeropuerto;

import java.util.Date;

public class Bodega extends Aeropuerto{
    private int numeroDeBodegaje;
    private String nombreDueno;
    private Boolean international;

    public Bodega(int numeroDeBodegaje, 
            String nombreDueno, 
            Boolean international, 
            String nombre, 
            int numeroDeAerolineas, 
            Date fechaDeInaguracion, 
            int numeroDeAviones, 
            Boolean Internacional) {
        super(nombre, 
                numeroDeAerolineas, 
                fechaDeInaguracion, 
                numeroDeAviones, 
                Internacional);
        this.numeroDeBodegaje = numeroDeBodegaje;
        this.nombreDueno = nombreDueno;
        this.international = international;
    }
    
    
    
}
