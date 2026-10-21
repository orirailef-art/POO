public class Pieza {
    private String descripcion;
    private String color;
    private String tipo;
    private String posicion;
    private String movimiento;
    private String comportamiento;
    private String velocidad;

    public Pieza() {
    }

    public Pieza(String descripcion, String color, String tipo, String posicion,
                 String movimiento, String comportamiento, String velocidad) {
        this.descripcion = descripcion;
        this.color = color;
        this.tipo = tipo;
        this.posicion = posicion;
        this.movimiento = movimiento;
        this.comportamiento = comportamiento;
        this.velocidad = velocidad;
    }

    public void mover() {
        System.out.println("La pieza se mueve de acuerdo a su movimiento: " + movimiento);
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public String getMovimiento() { return movimiento; }
    public void setMovimiento(String movimiento) { this.movimiento = movimiento; }

    public String getComportamiento() { return comportamiento; }
    public void setComportamiento(String comportamiento) { this.comportamiento = comportamiento; }

    public String getVelocidad() { return velocidad; }
    public void setVelocidad(String velocidad) { this.velocidad = velocidad; }
}