package Ejercicios;

import Datos.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio5 {
	private final static String DELETE_PEDIDO = "DELETE FROM pedido WHERE codigo_pedido=?";
	public int delete(int codigoPedido) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(DELETE_PEDIDO);

			stmt.setInt(1,codigoPedido);
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally{
			try {
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}
		return rows;
	}
}
