public class Flor extends Planta {

    private String colorDePetalos;
    private double cantPromedioPetalos;
    private String colorPistilo;
    private String estacionFlorado;
    private String variedadFlor;

    public Flor() {
    }

    public Flor(String colorDePetalos, double cantPromedioPetalos, String colorPistilo, String estacionFlorado, String variedadFlor) {
        this.colorDePetalos = colorDePetalos;
        this.cantPromedioPetalos = cantPromedioPetalos;
        this.colorPistilo = colorPistilo;
        this.estacionFlorado = estacionFlorado;
        this.variedadFlor = variedadFlor;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public double getCantPromedioPetalos() {
        return cantPromedioPetalos;
    }

    public void setCantPromedioPetalos(double cantPromedioPetalos) {
        this.cantPromedioPetalos = cantPromedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getEstacionFlorado() {
        return estacionFlorado;
    }

    public void setEstacionFlorado(String estacionFlorado) {
        this.estacionFlorado = estacionFlorado;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    @Override
    public void mostrarTipo() {
        super.mostrarTipo();
        System.out.println("Soy una Flor");
    }
}