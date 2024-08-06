import java.util.Scanner;

public class TiendaComputadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opciones = 0;
        int opOrden = 0;
        while (opciones != 3) {
            System.out.println("----COMPUSHOP----");
            System.out.println("Ingrese una opcion \n 1 = Crear Orden \n 2 = Ver Orden \n 3 = salir");
            opciones = sc.nextInt();

            if(opciones == 1){
                while(opOrden !=4){
                    System.out.println("1 = Crear Computadora \n 2 = Ver Computadora \n 3 = Borrar computadora \n 4 = Terminar Orden");
                    opOrden = sc.nextInt();

                    if (opOrden == 1){
                        Computadora pc1 = new Computadora();

                    }
                }

            }
        }
        System.out.println("Programa Terminado");




    }
}
