public class PruebaObjeto {
    public static void main(String[] args) {
        //de esta forma instanciamos una clase
        Articulo articulo1 = new Articulo(3,3560.35,3);

        articulo1.hayStock(); // accedemos a algo (funcion) que esta dentro de un objeto

        if(articulo1.hayStock()){
            System.out.println("Hay Stock");
        }else {
            System.out.println("No hay stock");
        }
        System.out.println("El precio de venta es: "+ articulo1.getPrecioVenta());

    }
}
