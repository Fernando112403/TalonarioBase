package TalonarioConsola;

import TalonarioConsola.model.Talonario;

public class TalonarioConsola {

public static void main (String[] args) {
	
	
	
	System.out.println("Hola");
	
	Talonario talonario = new Talonario();
	talonario.setId(3);
	talonario.setCarnet("MM100200");
	talonario.setDescripcion("Matricula,Cuota 1");
	talonario.setFecha("11-01-2026");
	talonario.setEstado("a");
	talonario.guardar(talonario);
	
	
   }

}
