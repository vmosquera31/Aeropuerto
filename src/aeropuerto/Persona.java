package aeropuerto;

class Persona {
    private String nombreAzafata;
    int edad;
    private String universidad;

    public Persona(String nombreAzafata, 
            int edad, 
            String universidad) {
        this.nombreAzafata = nombreAzafata;
        this.edad = edad;
        this.universidad = universidad;
    }

    public String getNombreAzafata() {
        return nombreAzafata;
    }

    public void setNombreAzafata(String nombreAzafata) {
        this.nombreAzafata = nombreAzafata;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    
    
}
