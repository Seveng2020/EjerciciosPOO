public class Arbol extends Planta{

    private String variedad;
    private double radioDelTronco;
    private String color;
    private String tipoDeHoja;

    public Arbol() {
    }

    public Arbol(String variedad, double radioDelTronco, String color, String tipoDeHoja) {
        this.variedad = variedad;
        this.radioDelTronco = radioDelTronco;
        this.color = color;
        this.tipoDeHoja = tipoDeHoja;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getRadioDelTronco() {
        return radioDelTronco;
    }

    public void setRadioDelTronco(double radioDelTronco) {
        this.radioDelTronco = radioDelTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHoja() {
        return tipoDeHoja;
    }

    public void setTipoDeHoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un Arbol");
        super.mostrarTipo();
    }
}