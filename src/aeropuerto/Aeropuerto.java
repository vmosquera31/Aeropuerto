 
package aeropuerto;

import java.util.Date;


public class Aeropuerto {
   private String nombre;
   private int numeroDeAerolineas;
   private Date fechaDeInaguracion;
   private int numeroDeAviones;
   private Boolean Internacional;

    public Aeropuerto(String nombre,
            int numeroDeAerolineas,
            Date fechaDeInaguracion,
            int numeroDeAviones,
            Boolean Internacional) {
        this.nombre = nombre;
        this.numeroDeAerolineas = numeroDeAerolineas;
        this.fechaDeInaguracion = fechaDeInaguracion;
        this.numeroDeAviones = numeroDeAviones;
        this.Internacional = Internacional;
    }
    
    /**
     Este metodo permite firmar aerolineas, aumentar el numero de aviones en 10 y 
     convertir el aeropuerto en internacional
     */
    public void firmarAerolienas () {
    this.numeroDeAerolineas +=1;
    this.numeroDeAviones +=10;
    this.Internacional = true;   
    } 
    
    //Este metodo permite romper un contrato con una aerolinea y que se lleven sus aviones
    public void romperContratoConAerolineas () {
    this.numeroDeAerolineas -=1;
    this.numeroDeAviones -=10;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeAerolineas() {
        return numeroDeAerolineas;
    }

    public void setNumeroDeAerolineas(int numeroDeAerolineas) {
        this.numeroDeAerolineas = numeroDeAerolineas;
    }

    public Date getFechaDeInaguracion() {
        return fechaDeInaguracion;
    }

    public void setFechaDeInaguracion(Date fechaDeInaguracion) {
        this.fechaDeInaguracion = fechaDeInaguracion;
    }

    public int getNumeroDeAviones() {
        return numeroDeAviones;
    }

    public void setNumeroDeAviones(int numeroDeAviones) {
        this.numeroDeAviones = numeroDeAviones;
    }

    public Boolean getInternacional() {
        return Internacional;
    }

    public void setInternacional(Boolean Internacional) {
        this.Internacional = Internacional;
    }

 
   
    public static void main(String[] args) {
      Aeropuerto aeropuertoUno = new Aeropuerto (
              "Aeropuerto Secha",
              5,
              new Date(),
              50,
              false);
      Aeropuerto aeropuertoDos = new Aeropuerto (
              "Aeropuerto Bonilla Aragon",
              20,
              new Date(),
              200,
              true);
  
      
      
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeAerolineas());
        System.out.println(aeropuertoUno.getNumeroDeAviones());
        System.out.println(aeropuertoUno.getInternacional());
        
        aeropuertoUno.firmarAerolienas();
        
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeAerolineas());
        System.out.println(aeropuertoUno.getNumeroDeAviones());
        System.out.println(aeropuertoUno.getInternacional());
        
        
    }

}