import java.util.Objects;

public class Computadora {
    private int idComputadora;

    private static int cantComputadoras;
    private String nombre;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;

    public Computadora() {
    }

    public Computadora(String nombre, Monitor monit, Teclado teclado, Mouse mouse) {
        this.idComputadora = idComputadora;
        this.nombre = nombre;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public static int getCantComputadoras() {
        return cantComputadoras;
    }

    public static void setCantComputadoras(int cantComputadoras) {
        Computadora.cantComputadoras = cantComputadoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }

}
