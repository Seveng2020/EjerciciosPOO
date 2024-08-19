public class Mouse extends DispositivoEntrada{
    private int idMouse;
    private static int contMouse;
    public Mouse(){
        this.idMouse = ++Mouse.contMouse;
    }
    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }


}
