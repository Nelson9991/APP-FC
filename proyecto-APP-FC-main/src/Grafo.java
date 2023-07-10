import java.util.*;

public class Grafo {
    private Map<Resena, List<Resena>> grafo;

    public Grafo() {
        grafo = new HashMap<>();
    }

    // Comprobar size del grafo
    public int size() {
        return grafo.size();
    }

    public void agregarResena(Resena resena) {
        grafo.put(resena, new ArrayList<>());
    }

    public void agregarConexion(Resena resenaOrigen, Resena resenaDestino) {
        if (!grafo.containsKey(resenaOrigen) || !grafo.containsKey(resenaDestino)) {
            throw new IllegalArgumentException("Las reseñas no existen en el grafo");
        }
        grafo.get(resenaOrigen).add(resenaDestino);
    }

    public List<Resena> consultarResenasOrdenadas() {
        List<Resena> resenasOrdenadas = new ArrayList<>();
        Set<Resena> visitados = new HashSet<>();

        for (Resena resena : grafo.keySet()) {
            if (!visitados.contains(resena)) {
                dfs(resena, resenasOrdenadas, visitados);
            }
        }

        return resenasOrdenadas;
    }

    private void dfs(Resena resena, List<Resena> resenasOrdenadas, Set<Resena> visitados) {
        visitados.add(resena);

        for (Resena conexion : grafo.get(resena)) {
            if (!visitados.contains(conexion)) {
                dfs(conexion, resenasOrdenadas, visitados);
            }
        }

        resenasOrdenadas.add(resena);
    }
}
