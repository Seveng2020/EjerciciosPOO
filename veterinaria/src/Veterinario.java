
public class Veterinario {
    private int matricula;
    private String nombre;
    private String apellido;
    private String mascota;
    private String nombreCliente;
    private String apellidocliente;
    private String diagnostico;
    private String raza;


    public Veterinario(int Matricula, String Nombre, String Apellido) {
        this.matricula = Matricula;
        this.nombre = Nombre;
        this.apellido = Apellido;
    }
    public void RecibirMascota(String nombreCliente,String apellidocliente, String nombreMascota,String raza) {
        this.nombreCliente= nombreCliente;
        this.mascota = nombreMascota;
        this.apellidocliente = apellidocliente;
        this.raza = raza;

    }
    public boolean AtenderMascota() {
        return true;
    }
    public void Diagnostico(String diagnostico,String nombreCliente, String apellidocliente, String nombreMascota,int matricula) {

        this.diagnostico = diagnostico;
    }
}