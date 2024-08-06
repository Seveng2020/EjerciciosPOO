public class Monitor {
    private int idMonitor;
    private String marca;
    private float tamanio;
    private static int cantMonitores;

    public Monitor() {
    }

    public Monitor(String marca, float tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public static int getCantMonitores() {
        return cantMonitores;
    }

    public static void setCantMonitores(int cantMonitores) {
        Monitor.cantMonitores = cantMonitores;
    }

    @Override
    public String toString() {
        return "" +
                "ID MONITOR =" + idMonitor +
                " Marca ='" + marca + '\'' +
                " Tamaño =" + tamanio;
    }
}
