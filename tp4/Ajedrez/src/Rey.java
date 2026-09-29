public class Rey extends Pieza {
    // Constructor vacío
    public Rey() {
    }

    // Constructor con los atributos heredados
    public Rey(String color, String comportamiento, String velocidad, String movimiento) {
        super(color, comportamiento, velocidad, movimiento);
    }

    //sobreescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El rey se mueve una casilla en cualquier dirección.");
    }
}
