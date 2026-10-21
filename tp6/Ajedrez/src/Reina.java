public class Reina extends Pieza {
    // Constructor vacío
    public Reina() {
    }

    // Constructor con los atributos heredados
    public Reina(String color, String comportamiento, String velocidad, String movimiento) {
    super("Reina " + color, color, "Reina", "", movimiento, comportamiento, velocidad);
}

    //sobreescritura del método mover()
    @Override
    public void mover() {
        System.out.println("La reina se mueve en cualquier dirección y cualquier número de casillas.");
    }
}
