public class Caballo extends Pieza {
    // Constructor vacío
    public Caballo() {
    }

    // Constructor con los atributos heredados
    public Caballo(String color, String comportamiento, String velocidad, String movimiento) {
        super(color, comportamiento, velocidad, movimiento);
    }

    //sobreescritura del método mover()
    @Override
    public void mover() {
        System.out.println("El caballo se mueve en forma de 'L'.");
    }
}
