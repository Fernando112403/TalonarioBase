package TalonarioConsola.services;

import java.util.List;

import TalonarioConsola.model.Talonario;

public interface ITalonarioservice {

	public boolean guardar (Talonario talonario);
	public Talonario recuperar (Talonario talonario);
	public List<Talonario> recuperarTalonarios();
	public Talonario modificar (Talonario talonario);
	public boolean eliminar (Talonario talonario);
}
