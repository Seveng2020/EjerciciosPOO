import java.time.LocalDateTime;
import java.util.ArrayList;

public class Orden{
    private final int idOrden;

    private ArrayList<Computadora> computadoras;

    private static int contadorOrdenes = 0;

    private static final int MAX_COMPUTADORAS = 5;

    private int contadorComputadoras;

    public Orden(int idOrden, ArrayList<Computadora> computadoras) {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new ArrayList<>();
    }

    public String mostrarOrden() {
        return "¡Gracias por su compra!" +
                "idOrden=" + idOrden +
                "Fecha y Hora="+ LocalDateTime.now();
    }
    public boolean agregarComputadora(Computadora computadora){
        if (computadoras.size() >= MAX_COMPUTADORAS){
            return false;
        }else {
            computadoras.add(computadora);
            return true;
        }

    }
}
