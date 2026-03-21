package TalonarioConsola.services;


import java.util.LinkedList;
import java.sql.ResultSet;
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
	Conexion Conexion = new Conexion();
		Connection con=null;
		PreparedStatement ps;
		String sql ="INSERT INTO talonario(carnet,Descripcion,Fecha,Estado)values(?,?,?,?)";
		try {
			con = Conexion.getConexion();
			ps = con.prepareStatement(sql);
			ps.setString(1,talonario.getCarnet());
			ps.setString(2,talonario.getDescripcion());
			ps.setString(3,talonario.getFecha());
			ps.setString(4,talonario.getEstado());
			ps.execute();
			hecho=true;			
		} catch (SQLException e) {
			System.out.print(e);
			}		finally {
				try {
					con.close();
				} catch (SQLException e) {
					// Todo Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
		return hecho;
	}

	@Override
	public Talonario recuperar(Talonario talonario) {
		// TODO Auto-generated method stub
		Conexion conexion = new Conexion();
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
		
	    Talonario tal = null;
	    String sql = "SELECT * FROM talonario WHERE carnet = ?";

	    try {
	        con = conexion.getConexion();
	        ps = con.prepareStatement(sql);

	        ps.setString(1, talonario.getCarnet());

	        rs = ps.executeQuery();

	        if (rs.next()) {
	            tal = new Talonario();
	            tal.setId(rs.getInt("id"));
	            tal.setCarnet(rs.getString("carnet"));
	            tal.setDescripcion(rs.getString("descripcion"));
	            tal.setFecha(rs.getString("fecha"));
	            tal.setEstado(rs.getString("estado"));
	        } else {
	            System.out.println("No existe talonario con ese carnet");
	        }

	    } catch (SQLException e) {
	        System.out.println("Error al recuperar: " + e.getMessage());
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return tal;
	}

	@Override
	public Talonario modificar(Talonario talonario) {
		// TODO Auto-generated method stub
		Conexion conexion = new Conexion();
	    Connection con = null;
	    PreparedStatement ps = null;
		
	    String sql = "UPDATE talonario SET carnet=?, descripcion=?, fecha=?, estado=? WHERE id=?";

	    try {
	        con = conexion.getConexion();
	        ps = con.prepareStatement(sql);

	        ps.setString(1, talonario.getCarnet());
	        ps.setString(2, talonario.getDescripcion());
	        ps.setString(3, talonario.getFecha());
	        ps.setString(4, talonario.getEstado());
	        ps.setInt(5, talonario.getId()); 

	        int filas = ps.executeUpdate();
	        if (filas > 0) {
	            System.out.println("Registro actualizado correctamente");
	        } else {
	            System.out.println("No se encontró el registro");
	        }

	    } catch (SQLException e) {
	        System.out.println("Error al modificar: " + e.getMessage());
	    } finally {
	        try {
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }	
		return talonario;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		boolean eliminado = false;
	    Conexion conexion = new Conexion();
	    Connection con = null;
	    PreparedStatement ps = null;

	    String sql = "DELETE FROM talonario WHERE id = ?";
	    
	    try {
	        con = conexion.getConexion();
	        ps = con.prepareStatement(sql);

	        ps.setInt(1, talonario.getId()); // 

	        int filas = ps.executeUpdate();

	        if (filas > 0) {
	            System.out.println("Registro eliminado correctamente");
	            eliminado = true;
	        } else {
	            System.out.println("No se encontró el registro");
	        }	
	        
	    } catch (SQLException e) {
	        System.out.println("Error al eliminar: " + e.getMessage());
	    } finally {
	        try {
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return eliminado;
	}

	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		Talonario tal = new Talonario();
		
		return null;
	}

	

	
	
}
