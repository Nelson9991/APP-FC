import java.util.LinkedList;

public class OrdenesCanceladas {
    LinkedList<Orden> ordenes = new LinkedList<Orden>();
    public void add(Orden o){
        ordenes.add(o);
    }

    // add new order
    public void add(String cedula, String lista, int aux, String status) {
        ordenes.add(new Orden(cedula, lista, aux, status));
    }
    public void delete(Orden o){
        ordenes.remove(o);
    }
    public Orden buscarOrden(String cedula, int aux) {
        for (Orden o : ordenes) {
            if (o.getCedula().equalsIgnoreCase(cedula)&&o.getAux()==aux) {
                return o;
            }
        }
        return null; // Si no se encuentra ningún usuario con la cédula buscada
    }
    public int tamano(){
        return ordenes.size();
    }

    public LinkedList ordenespedidos () {
        LinkedList<Integer> listaOrdenes = new LinkedList<>();
        for (Orden b : ordenes){
            listaOrdenes.add(b.getAux());
        }
        return listaOrdenes;
    }

    public LinkedList cedulasPedidos (){
        LinkedList<String> listaCedulas = new LinkedList<>();
        for (Orden a : ordenes) {
            listaCedulas.add(a.getCedula());
        }
        return listaCedulas;
    }

    @Override
    public String toString() {
        return "\n Ordenes Lavado y Secado Canceladas:\n" + ordenes;
    }
}
