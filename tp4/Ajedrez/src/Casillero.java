public class Casillero {
    //atributos
    private String color;
    private int coordenadaX;
    private int coordenadaY;

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

    // Constructor vacío
    public Casillero() {
    }

    // Constructor con parámetros
    public Casillero(String color, int coordenadaX, int coordenadaY) {
        this.color = color;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
}
