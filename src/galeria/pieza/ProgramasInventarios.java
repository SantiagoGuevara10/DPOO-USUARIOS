package galeria.pieza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import galeria.inventarios.InventarioGeneral;
import galeria.usuarios.Propietario;

/**
 * Clase que permite probar el hecho de accionar el inventario, es decir manipular cosas del mismo.
 */
public class ProgramasInventarios {
	Propietario propietario = new Propietario("1234", new ArrayList<>());
	
	public ProgramasInventarios() {
		// Se crea una pieza
		Pieza pieza = new Pieza( "P002", "Sol de Medianoche", 2020,"España", "Exhibido",false,true,Arrays.asList("Elena Ochoa"),25000.0,20000,15000,new Date(),true,"Una hermosa obra de arte moderno.",propietario);
        System.out.println(pieza);
        // Se crea el inventario
        InventarioGeneral inventario = new InventarioGeneral();
        // Se agrega una pieza al inventario en exhibición
        inventario.addInventarioExhibido(pieza.getIdPieza(), pieza);
        // Se extrae el mapa que contiene el inventario exhibido
        Map<String,Pieza> mapa = inventario.getInventarioExhibido();
        System.out.println(mapa);
        // Se extrae 
        
        
	}
	
	public static void main(String[] args) {
		new ProgramasInventarios();
	}
	

}
