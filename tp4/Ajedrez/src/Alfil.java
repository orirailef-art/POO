public class Alfil extends Pieza {
    // Constructor vacío
    public Alfil() {
    }

    // Constructor con los atributos heredados
    public Alfil(String color, String comportamiento, String velocidad, String movimiento) {
        super(color, comportamiento, velocidad, movimiento);
    }

    // Sobreescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El alfil se mueve en diagonal.");
    }
}
