package TalonarioConsola;

import TalonarioConsola.model.Talonario;

public class TalonarioConsola {

public static void main (String[] args) {
	
	
	
	System.out.println("Hola");
	
	Talonario talonario = new Talonario();
	talonario.setId(1);
	talonario.setCarnet("SS100600");
	talonario.setDescripcion("Matricula,Cuota 1");
	talonario.setFecha("10-01-2026");
	talonario.setEstado("p");
	talonario.modificar(talonario);
	
	
   }

}
