public class Flor {

    // Atributos
    private String actitud;
    private String apariencia;
    private String estado;
    private int orugas;

    // Constructor vacío
    public Flor() {
    }

    // Constructor con todos los atributos
    public Flor(String actitud, String apariencia, String estado, int oruga) {
        this.actitud = actitud;
        this.apariencia = apariencia;
        this.estado = estado;
        this.orugas = oruga;
    }

    // Getters y Setters
    public String getActitud() {
        return actitud;
    }

    public void setActitud(String actitud1) {
        this.actitud = actitud1;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia1) {
        this.apariencia = apariencia1;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado1) {
        this.estado = estado1;
    }

    public int getOrugas() {
        return orugas;
    }

    public void setOrugas(int orugas1) {
        this.orugas = orugas1;
    }

    // Comportamiento
    public void agradecer() {
        System.out.println("La flor agradece al Principito por su dedicación.");
    }
}
