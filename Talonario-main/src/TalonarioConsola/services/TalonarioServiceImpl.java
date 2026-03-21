package TalonarioConsola.services;


import java.util.LinkedList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Conexion.Conexion;
import TalonarioConsola.model.Talonario;

public class TalonarioServiceImpl implements ITalonarioservice {
	

	@Override
	public boolean guardar(Talonario talonario) {
	boolean hecho=false;
	Conexion conexion = new Conexion();
		Connection con=null;
		PreparedStatement ps;
		String sql ="INSERT INTO estudiante(carnet,nombres,apellidos)values(?,?,?)";
		try {
			con = conexion.getConexion();
			ps = con.prepareStatement(sql);
			ps.setString(1,talonario.getCarnet());
			ps.setString(2,talonario.getDescripcion());
			ps.setString(3,talonario.getFecha());
			ps.setString(4,talonario.getEstado());
			ps.execute();
			hecho=true;			
		} catch (SQLExeption e) {
			System.out.print(e);
			}		finally {
				try {
					con.close();
				} catch (SQLExeption e) {
					// Todo Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
		return hecho;
	}

	@Override
	public Talonario recuperar(Talonario talonario) {
		// TODO Auto-generated method stub
		
		Talonario tal = new Talonario();
		
		return tal;
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
		Talonario tal = new Talonario();
		
		return tal;
	}

	

	
	
}
