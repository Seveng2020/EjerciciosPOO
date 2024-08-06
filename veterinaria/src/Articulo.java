public class Articulo {
        private int cantidad;
        private double precioCompra;
        private double precioVenta;
        private double ganancia;

        public Articulo (int cantidad, double precioCompra,double ganancia){
            this.cantidad = cantidad;
            this.precioCompra = cantidad;
            this.precioVenta = calcularPrecioventa();
            this.ganancia = ganancia;
        }
    public boolean hayStock() { //metodo publico que puede ser llamado fuera de la clase
        return this.cantidad >0;
        //siempre que creamos un atributo de clase poner el this. en la variable a utilizar.
    }
    private double calcularPrecioventa(){ //metodo privado que solo se ejecuta dentro de la clase y no puede ser llamado por fuera
            return this.precioCompra * ganancia;
    }
    // para poder mostrar atributos privados debemos crear un metodo para exteriorizarlo
    public double getPrecioVenta (){
            return this.precioVenta;
    }
}