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
		Pieza pieza = new Pieza( "P002", "Sol de Medianoche", 2020,"España", "Exhibido",false,true,Arrays.asList("Elena Ochoa"),25000.0,20000,15000,new Date(),true,"Una hermosa obra de arte moderno.",propietario);
        System.out.println(pieza);
		
        InventarioGeneral inventario = new InventarioGeneral();
        inventario.addInventarioExhibido(pieza.getIdPieza(), pieza);
        Map<String,Pieza> mapa = inventario.getInventarioExhibido();
        System.out.println(mapa);
        
        
	}
	
	public static void main(String[] args) {
		new ProgramasInventarios();
	}
	

}
