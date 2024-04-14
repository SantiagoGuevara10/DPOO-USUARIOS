package consolas;
import java.io.IOException;
import galeria.usuarios.*;
import galeria.pieza.Pieza;
import galeria.sesion.ManejoSesion;
import galeria.acciones.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConsolaUsuarios {

	public static void main(String[] args) {
	    try {
	       
	        FileUtils.loadUserCredentials();

	   
	        String newUsername = "newUser";
	        String newPassword = "newPassword";
	        CompradorPropietario newComprador = new CompradorPropietario("4", "New Buyer", newUsername, newPassword, 50000000, true);
	        UserManager.registerCompradorPropietario(newUsername, newComprador);
	        FileUtils.registerUser(newUsername, newPassword, "comprador"); 
	       
	        FileUtils.loadUserCredentials();

	     
	        ManejoSesion.loginCompradorPropietario(newUsername, newPassword);
	        if (ManejoSesion.getCurrentCompradorPropietario() != null) {
	            System.out.println("Nuevo comprador/propietario logueado exitosamente.");
	          
	        }

	
	        ManejoSesion.logout();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    private static Pieza crearPiezaDemo() {
     
        String idPieza = "P002";
        String titulo = "Sol de Medianoche";
        int anioCreacion = 2020;
        String lugarCreacion = "España";
        String estadoPieza = "Excelente";
        boolean estaExhibida = false;
        boolean disponibleVenta = true;
        List<String> autor = Arrays.asList("Elena Ochoa");
        double valorFijo = 25000.0;
        int valorMinimo = 20000;
        int valorInicial = 15000;
        Date fechaDeIngreso = new Date();
        boolean esVigente = true;
        String descripcion = "Una hermosa obra de arte moderno.";
        Propietario propietario = new Propietario("Owner002", new ArrayList<>());

        return new Pieza(idPieza, titulo, anioCreacion, lugarCreacion, estadoPieza, estaExhibida,
                         disponibleVenta, autor, valorFijo, valorMinimo, valorInicial,
                         fechaDeIngreso, esVigente, descripcion, propietario);
    }
}