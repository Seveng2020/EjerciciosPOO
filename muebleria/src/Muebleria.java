public class Muebleria {
    public static void main(String[] args) {
        Mueble mesa = new Mueble("mesa familiar", 100, 70, 150, "Melamina", 10);
        Mueble silla = new Mueble("silla de pino ", 80, 50, 50, "Pino", 10);
        Mueble futon = new Mueble("futon de 3 cuerpos", 83, 190, 100, "Roble", 10);
        Mueble mesagrande = new Mueble("mesa grande", 100, 90, 200, "Melamina", 10);
        Mueble sillaninos = new Mueble("silla de niños", 50, 20, 20, "Pino", 10);
        Mueble futonindividual = new Mueble("futon individual", 83, 100, 70, "Roble", 10);
        Mueble mesadeluz = new Mueble("mesa de luz", 70, 60, 50, "Melamina", 10);
        Mueble sillon = new Mueble("sillon de 3 cuerpos", 90, 190, 85, "Pana", 10);

        System.out.println(" Muebles con Volumen Mayor a 0.6: ");
        if (mesa.getVolumen() > 0.6) {
        System.out.println(mesa.getNombre());
        }if (silla.getVolumen() > 0.6) {
        System.out.println(silla.getNombre());
        }if (futon.getVolumen() > 0.6) {
        System.out.println(futon.getNombre());
        }

        Mueble muebles[] = new Mueble[8];

        muebles[0] = mesa;
        muebles[1] = silla;
        muebles[2] = futon;
        muebles[3] = mesagrande;
        muebles[4] = sillaninos;
        muebles[5] = futonindividual;
        muebles[6] = mesadeluz;
        muebles[7] = sillon;

        System.out.println("\n Muebles más altos que anchos:");
        for (Mueble mueble : muebles) {
            if (mueble.getAlto() > mueble.getAncho()) {
                System.out.println(mueble.getNombre());
            }
        }
        System.out.println("\n Volumen de los muebles que no superan 1m3:");
                int contador =0;
        for (Mueble mueble : muebles) {
            if (mueble.getVolumen() <= 1) {
                System.out.println(mueble);
                contador ++;
            }
        }if (contador == 0){
            System.out.println("\n No hay muebles que no superen 1m3");
        }

        System.out.println("\n 1.h = "+ mesa);
        System.out.println("Cantidad de muebles = "+muebles.length);
        System.out.println("Suma de volumenes = "+(muebles[0].getVolumen()+muebles[1].getVolumen()+muebles[2].getVolumen()+muebles[3].getVolumen()+muebles[4].getVolumen()+muebles[5].getVolumen()+muebles[6].getVolumen()+muebles[7].getVolumen()));
    }


}
