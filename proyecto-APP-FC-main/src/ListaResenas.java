import java.util.LinkedList;

public class ListaResenas {
    LinkedList<Resena> listaResenas;

    public ListaResenas() {
        listaResenas = new LinkedList<>();
    }

    public void agregarResena(Resena resena) {
        listaResenas.add(resena);
    }

    // obtner la lista de reseñas
    public LinkedList<Resena> getListaResenas() {
        return listaResenas;
    }
}
