public class Resena {
    private int valor;
    private String descripcion;

    public Resena(int valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "\n\nResena:\n" + "Valoracion:\t" + valor + "\nComentario:\t" + descripcion;
    }
}
