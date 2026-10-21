public class Torre extends Pieza {
    // Constructor vacío
    public Torre() {
    }

    // Constructor con los atributos heredados
    public Torre(String color, String comportamiento, String velocidad, String movimiento) {
    super("Torre " + color, color, "Torre", "", movimiento, comportamiento, velocidad);
}

    // Método para mover la torre
    @Override
    public void mover() {
        System.out.println("La torre se mueve en línea recta, horizontal o verticalmente.");
    }
}
