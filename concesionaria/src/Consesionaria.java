public class Consesionaria {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Rojo", "Volkswagen", "Golf", "ABC123", 5, false);
        Auto auto2 = new Auto("Negro", "Chevrolet", "Corsa", "DEF456", 3, false);
        Auto auto3 = new Auto("Azul", "Ford", "Fiesta", "GHI789", 4, true);
        Auto auto4 = new Auto();


        System.out.println(auto1.getMarca() + " " + auto1.getModelo() + " " + auto1.getPatente() );
        System.out.println(auto2.getMarca() + " " + auto2.getModelo() + " " + auto2.getPatente());
        System.out.println(auto3.getMarca() + " " + auto3.getModelo() + " " + auto3.getPatente());
        System.out.println(auto4.getMarca());
        auto4.setMarca("Audi");
        auto4.setColor("Negro");
        auto4.setModelo("A4");
        auto4.setPatente("JKL123");
        auto4.setImportado(true);
        auto4.setCantidadPuertas(5);
        System.out.println("1.h = " + auto1);


    }
}
