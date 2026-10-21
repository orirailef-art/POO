import java.io.Serializable;

public class Casillero implements Serializable {
    private static final long serialVersionUID = 1L;

    //atributos
    private String color;
    private int coordenadaX;
    private int coordenadaY;
    private Pieza pieza;

    //getters y setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCoordenadaX() {
        return coordenadaX;
    }   
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public int getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    public Pieza getPieza() {
        return pieza;
    }
    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    // Constructor vacío
    public Casillero() {
    }

    // Constructor con parámetros
    public Casillero(String color, int coordenadaX, int coordenadaY) {
        this.color = color;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return "Casillero{" +
            "color='" + color + '\'' +
            ", coordenadaX=" + coordenadaX +
            ", coordenadaY=" + coordenadaY +
            ", pieza=" + pieza +
            '}';
    }
}
