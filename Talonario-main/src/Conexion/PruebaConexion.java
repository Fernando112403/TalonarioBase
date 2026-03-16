package Conexion;

import java.sql.Connection;

public class PruebaConexion {
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

        if (con != null) {
            System.out.println("Si se conectó correctamente");
        } else {
            System.out.println("No se pudo conectar");
        }
    }
}