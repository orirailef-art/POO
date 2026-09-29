public class Peon extends Pieza {
    // Constructor vacío
    public Peon() {
    }

    // Constructor con los atributos heredados
    public Peon(String color, String comportamiento, String velocidad, String movimiento) {
        super(color, comportamiento, velocidad, movimiento);
    }

    // Sobreescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El peón se mueve hacia adelante, pero captura en diagonal.");
    }
}
