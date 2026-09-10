public class Principito {
    // Atributos
    private Flor florPrincipito;

    // Constructor vacío
    public Principito() {
    }

    // Constructor con todos los atributos
    public Principito(Flor florPrincipito) {
        this.florPrincipito = florPrincipito;
    }

    // Getter
    public Flor getFlorPrincipito() {
        return florPrincipito;
    }

    // Setter
    public void setFlorPrincipito(Flor florPrincipito) {
        this.florPrincipito = florPrincipito;
    }

    // Comportamientos
    public void cuidar() {
        System.out.println("\nEl Principito cuida de su flor todos los días.");
    }

    public void regar() {
        System.out.println("El Principito riega su flor.");
    }

    public void quitar() {
        if (florPrincipito != null && florPrincipito.getOrugas() > 0) {
            florPrincipito.setOrugas(florPrincipito.getOrugas() - 1);
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

    public void imprimirFlorPrincipito() {
        if (florPrincipito != null) {
            System.out.println("\nDatos de la flor del Principito:");
            System.out.println("Actitud: " + florPrincipito.getActitud());
            System.out.println("Apariencia: " + florPrincipito.getApariencia());
            System.out.println("Estado: " + florPrincipito.getEstado());
            System.out.println("Cantidad de orugas: " + florPrincipito.getOrugas());
        } else {
            System.out.println("El Principito no tiene una flor.");
        }
    }
}
