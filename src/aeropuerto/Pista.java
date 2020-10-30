package aeropuerto;

class Pista {
    private Boolean condiciones;
    private Boolean funcionamiento;

    public Pista(Boolean condiciones, 
            Boolean funcionamiento) {
        this.condiciones = condiciones;
        this.funcionamiento = funcionamiento;
    }

    public Boolean getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(Boolean condiciones) {
        this.condiciones = condiciones;
    }

    public Boolean getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(Boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
    
    
    
}
