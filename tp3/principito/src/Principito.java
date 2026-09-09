public class Principito {

    // Atributos
    private Flor FlorPrincipito;

    // Constructor vacío
    public Principito() {
    }

    // Constructor con todos los atributos
    public Principito(Flor FlorPrincipito) {
        this.FlorPrincipito = FlorPrincipito;
    }

    // Getter
    public Flor getFlorPrincipito() {
        return FlorPrincipito;
    }

    // Setter
    public void setFlorPrincipito(Flor FlorPrincipito1) {
        this.FlorPrincipito = FlorPrincipito1;
    }

    // Comportamientos

    public void cuidar() {
        System.out.println("El Principito cuida de su flor todos los días.");
    }

    public void regar() {
        System.out.println("El Principito riega su flor.");
    }

    public void quitar() {
        if (FlorPrincipito != null && FlorPrincipito.getOruga() > 0) {
            FlorPrincipito.setOruga(FlorPrincipito.getOruga() - 1);
            System.out.println("El Principito le quita una oruga a la flor.");
        } else {
            System.out.println("La flor no tiene orugas.");
        }
    }

    public void explorar() {
        System.out.println("El Principito decide explorar otros planetas.");
    }

    public void amar() {
        System.out.println("El Principito ama mucho a su flor.");
    }

    // Punto 3 del TP
    public void imprimirFlorPrincipito() {

        if (FlorPrincipito != null) {

            System.out.println("\nDatos de la flor del Principito:");
            System.out.println("Actitud: " + FlorPrincipito.getActitud());
            System.out.println("Apariencia: " + FlorPrincipito.getApariencia());
            System.out.println("Estado: " + FlorPrincipito.getEstado());
            System.out.println("Cantidad de orugas: " + FlorPrincipito.getOruga());

        } else {
            System.out.println("El Principito no tiene una flor.");
        }
    }
}
