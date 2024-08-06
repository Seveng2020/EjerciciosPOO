
public class Auto {
    private String color;
    private String modelo;
    private String marca;
    private String patente;
    private int cantidadPuertas;
    private boolean importado;

    public Auto() {
    }

    public Auto(String color, String modelo, String marca, String patente, int cantidadPuertas, boolean importado) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
        this.importado = importado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int isImportado() {
        if (importado == true) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}