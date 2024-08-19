public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contTeclados;

    public Teclado (){
        this.idTeclado = ++Teclado.contTeclados;
    }
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContTeclados() {
        return contTeclados;
    }

    public static void setContTeclados(int contTeclados) {
        Teclado.contTeclados = contTeclados;
    }
}
