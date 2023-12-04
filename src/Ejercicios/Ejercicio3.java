package Ejercicios;

import Datos.Cliente;
import Datos.Conexion;
import Datos.Oficina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
	private final static String SELECT_OFICINA = "SELECT codigo_oficina FROM oficina";
	private final static String UPDATE_OFICINA = "UPDATE oficina SET telefono=? WHERE codigo_oficina=?";

	public List<String> selectOficinas(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<String> oficinas = new ArrayList<>();
		try {
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(SELECT_OFICINA);
			rs = stmt.executeQuery();

			while (rs.next()){
				String codigo_oficina = rs.getString("codigo_oficina");
				oficinas.add(codigo_oficina);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			try {
				Conexion.close(rs);
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			}
		}

		return oficinas;
	}

	public int update(Oficina oficina){
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(UPDATE_OFICINA);

			stmt.setString(1,oficina.getTelefono());
			stmt.setString(2,oficina.getCodigo_oficina());

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
