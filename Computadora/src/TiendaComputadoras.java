import java.util.ArrayList;
import java.util.Scanner;

public class TiendaComputadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opciones = 0;
        int opOrden = 0;
        int bucleCompus=0;
        while (opciones != 3) {
            System.out.println("----COMPUSHOP----");
            System.out.println("Ingrese una opcion \n 1 = Crear Orden \n 2 = Ver Orden \n 3 = salir");
            opciones = Integer.parseInt(sc.nextLine());
            ArrayList<Orden> listaOrden = new ArrayList<>();
            if(opciones == 1){
                //CREAR ORDEN
                Orden ordenes = new Orden();
                while(opOrden !=4){
                    System.out.println("1 = Crear Computadora \n 2 = Ver Computadora \n 3 = Borrar computadora \n 4 = Terminar Orden");
                    opOrden = Integer.parseInt(sc.nextLine());

                    if (opOrden == 1){
                        // CREAR COMPUTADORA
                        while(bucleCompus == 0) {
                            Computadora compu = new Computadora();
                            Monitor monitor = new Monitor();
                            Teclado teclado = new Teclado();
                            Mouse mouse = new Mouse();
                            System.out.println("Ingrese Nombre de Computadora");
                            compu.setNombre(sc.nextLine());
                            System.out.println("Ingrese Marca de Monitor");
                            monitor.setMarca(sc.nextLine());
                            System.out.println("Ingrese Tamaño de Monitor");
                            monitor.setTamanio(Float.parseFloat(sc.nextLine()));
                            System.out.println("Ingrese Marca de Teclado");
                            teclado.setMarca(sc.nextLine());
                            System.out.println("Ingrese Tipo de Entrada");
                            teclado.setTipoEntrada(sc.nextLine());
                            System.out.println("Ingrese Marca de Mouse");
                            mouse.setMarca(sc.nextLine());
                            System.out.println("Ingrese Tipo de Entrada");
                            mouse.setTipoEntrada(sc.nextLine());


                            ordenes.agregarComputadora(compu);






                            System.out.println("Desea crear otra Computadora? \n 1= SI \n 2= NO");
                            bucleCompus = sc.nextInt();


                        }
                            listaOrden.add(ordenes);
                    }
                }

            }
        }
        System.out.println("Programa Terminado");




    }
}
