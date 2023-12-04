package Ejercicios;

import Datos.Cliente;
import Datos.Conexion;
import Datos.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio2 {
	private final static String INSERT = "INSERT INTO producto(codigo_producto,nombre,gama,dimensiones,proveedor,descripcion,cantidad_en_stock,precio_venta,precio_proveedor) VALUES(?,?,?,?,?,?,?,?,?)";

	public int insert(Producto producto){
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(INSERT);

			stmt.setString(1,producto.getCodigo_producto());
			stmt.setString(2,producto.getNombre());
			stmt.setString(3,producto.getGama());
			stmt.setString(4,producto.getDimensiones());
			stmt.setString(5,producto.getProveedor());
			stmt.setString(6,producto.getDescripcion());
			stmt.setInt(7,producto.getCantidad_en_stock());
			stmt.setDouble(8,producto.getPrecio_venta());
			stmt.setDouble(9,producto.getPrecio_proveedor());

			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}finally {
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
