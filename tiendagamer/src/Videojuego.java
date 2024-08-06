public class Videojuego {
    private static int cantJuegos;
    private int idJuego;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;
    private boolean aptoMenores;

    public Videojuego() {
        idJuego = ++cantJuegos;
    }

    @Override
    public String toString() {
        return "idJuego=" + idJuego +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantidadJugadores=" + cantidadJugadores +
                ", categoria='" + categoria + '\'' +
                ", aptoMenores=" + isAptoMenores();
    }

    public Videojuego(String titulo, String consola, int cantidadJugadores, String categoria, int aptoMenores) {
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
        if (aptoMenores == 1){
            this.aptoMenores = true;
        }else if (aptoMenores == 0){
            this.aptoMenores = false;
        }
        idJuego = ++cantJuegos;
    }

    public static int getCantJuegos() {
        return cantJuegos;
    }

    public static void setCantJuegos(int cantJuegos) {
        Videojuego.cantJuegos = cantJuegos;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int isAptoMenores() {
        if (aptoMenores == true){
            return 1;}
        else{
            return 0;}
    }

    public void setAptoMenores(int aptoMenores) {
        if (aptoMenores == 1){
            this.aptoMenores = true;
        }else if (aptoMenores == 0){
            this.aptoMenores = false;
        }
    }
}
