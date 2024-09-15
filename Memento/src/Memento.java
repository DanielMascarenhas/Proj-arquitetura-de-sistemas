public class Memento {
    // Memento - Armazena o estado do Editor de Texto

    private final String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

}
