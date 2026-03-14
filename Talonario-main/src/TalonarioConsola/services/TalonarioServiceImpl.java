package TalonarioConsola.services;


import java.util.LinkedList;
import java.util.List;


import TalonarioConsola.model.Talonario;

public class TalonarioServiceImpl implements ITalonarioservice {

	
	
	List <Talonario> talonarios = null;
	
	
	
	
	public TalonarioServiceImpl() {
		
		talonarios = new LinkedList<>();
		
		
		
	}
		
		
		
	

	@Override
	public boolean guardar(Talonario talonario) {
	
		talonarios . add (talonario);
		
		return false;
	}

	@Override
	public Talonario recuperar(Talonario talonario) {
		// TODO Auto-generated method stub
		return talonarios.get(0);
	}

	@Override
	public Talonario modificar(Talonario talonario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		return talonarios;
	}

	

	
	
}
