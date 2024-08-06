public class Mueble {
    private String nombre;
    private double alto;
    private double ancho;
    private double profundo;
    private String material;
    private int cantidad;
    private double volumen;

    public Mueble() {
    }
    public Mueble(String nombre, double alto, double ancho, double profundo, String material, int cantidad) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        this.material = material;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundo() {
        return profundo;
    }

    public void setProfundo(double profundo) {
        this.profundo = profundo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getVolumen() {
        volumen = alto * ancho * profundo;
        return volumen;
    }

    @Override
    public String toString() {
        return
                nombre +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", profundo=" + profundo +
                ", material='" + material+
                ", cantidad=" + cantidad +
                ", volumen=" + volumen;
    }
}
