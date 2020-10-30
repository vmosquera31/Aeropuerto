 package aeropuerto;

import java.util.Date;

public class Aeropuerto {
   private String nombre;
   private int numeroDeAerolineas;
   private Date fechaDeInaguracion;
   private int numeroDeAviones;
   private Boolean Internacional;
   
   //composicion y agregacion//
   
   private Persona azafatas = null;
   private Pista pistaDeAterrizaje;

   //Inicializacion del metodo get y set de los atributos de composicion y 
   //agregacion
    public Persona getAzafatas() {
        return azafatas;
    }

    public void setAzafatas(Persona azafatas) {
        this.azafatas = azafatas;
    }

    public Pista getPistaDeAterrizaje() {
        return pistaDeAterrizaje;
    }

    public void setPistaDeAterrizaje(Pista pistaDeAterrizaje) {
        this.pistaDeAterrizaje = pistaDeAterrizaje;
    }
   
   

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
        this.pistaDeAterrizaje = new Pista(true, true);
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
    
    //Este metodo permite romper un contrato con una aerolinea y que se lleven
    //sus aviones
    
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
      
      Avion informacionDelAvion = new Avion(10, 
              "Sandwich", 
              14000, 
              "Sharon Copella", 
              30, 
              "UNITEC");
      
      aeropuertoUno.setAzafatas(informacionDelAvion);
      
        System.out.println("Nombre azafata");
        System.out.println(aeropuertoUno.getAzafatas().getNombreAzafata());
        System.out.println("Edad Azafata");
        System.out.println(aeropuertoUno.getAzafatas().getEdad());
        System.out.println("Universidad donde fue preparada");
        System.out.println(aeropuertoUno.getAzafatas().getUniversidad());
        System.out.println("Buenas condiciones:");
        System.out.println(aeropuertoUno.getPistaDeAterrizaje().getCondiciones());
        System.out.println("En funcionamiento:");
        System.out.println(aeropuertoUno.getPistaDeAterrizaje().getFuncionamiento());
    }

}