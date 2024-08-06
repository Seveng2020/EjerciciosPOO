import java.util.Arrays;

public class TiendaGamer {
    public static void main(String[] args) {
        Videojuego juegos[] = new Videojuego[5];

        juegos[0] = new Videojuego("GTA SA", "PS2", 1, "RPG",0);
        juegos[1] = new Videojuego("GTA VC", "PC", 1, "RPG",0  );
        juegos[2] = new Videojuego("Valorant", "PC", 1, "Shooter", 0);
        juegos[3] = new Videojuego("Counter Strike 1.6", "PC", 1, "Shooter", 0);
        juegos[4] = new Videojuego("Need for Speed Underground 2", "PS2", 2,"Arcade", 1);
        System.out.println("Juegos Disponibles: ");
        System.out.println("-------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(juegos[i]);
        }
        juegos[4].setConsola("Nintendo64");
        juegos[4].setCantidadJugadores(1);
        juegos[0].setConsola("PC");
        juegos[0].setCantidadJugadores(2);
        System.out.println("Modificacion de consola y jugadores: ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(juegos[i]);
        }

        for (Videojuego j : juegos) {
            if (j.getConsola().equals("Nintendo64")) {
                System.out.println("Juegos de consola Nintendo64: ");
                System.out.println("-------------------------------");
                System.out.println(j);
            }
        }

    }
}
