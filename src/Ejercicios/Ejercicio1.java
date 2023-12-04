package Ejercicios;

import Datos.Cliente;
import Datos.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
	private static final String SELECT_CLIENTE = "SELECT codigo_cliente,nombre_cliente,telefono,linea_direccion1,ciudad,pais FROM cliente;";

	public List<Cliente> selectCliente(){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;
		List<Cliente> clientes = new ArrayList<>();
		try {
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(SELECT_CLIENTE);
			rs = stmt.executeQuery();

			while (rs.next()){
				int codigo_cliente = rs.getInt("codigo_cliente");
				String nombre_cliente = rs.getString("nombre_cliente");
				String telefono = rs.getString("telefono");
				String linea_direccion1 = rs.getString("linea_direccion1");
				String ciudad = rs.getString("ciudad");
				String pais = rs.getString("pais");

				cliente = new Cliente(codigo_cliente,nombre_cliente,telefono,linea_direccion1,ciudad,pais);
				clientes.add(cliente);
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

		return clientes;
	}
}
