public class Tablero {
    
    private Casillero[][] casilleros;

    //getters y setters
    public Casillero[][] getCasilleros() {
        return casilleros;
    }
    public void setCasilleros(Casillero[][] casilleros) {
        this.casilleros = casilleros;
    }
    
    // Constructor vacío
    public Tablero() {
    }

    //constructor con parámetros
    public Tablero(Casillero[][] casilleros) {
        this.casilleros = casilleros;
    }
}
