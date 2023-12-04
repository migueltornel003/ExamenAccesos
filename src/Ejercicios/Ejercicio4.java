package Ejercicios;

import Datos.Conexion;
import Datos.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	private static final String SELECT_PEDIDO = "SELECT codigo_pedido,fecha_pedido,fecha_esperada,fecha_entrega,estado,comentarios,codigo_cliente FROM pedido WHERE (fecha_pedido > ? and fecha_entrega < ?)";

	public List<Pedido> selectPedidos(Date fechaInicial,Date fechaFinal){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Pedido> pedidos = new ArrayList<>();
		Pedido pedido = null;
		try{
			conn = Conexion.myConnection();
			stmt = conn.prepareStatement(SELECT_PEDIDO);
			stmt.setDate(1,fechaInicial);
			stmt.setDate(2,fechaFinal);

			rs = stmt.executeQuery();

			while (rs.next()){
				int codigo_pedido = rs.getInt("codigo_pedido");
				Date fecha_pedido = rs.getDate("fecha_pedido");
				Date fecha_esperada = rs.getDate("fecha_esperada");
				Date fecha_entrega = rs.getDate("fecha_entrega");
				String estado = rs.getString("estado");
				String comentarios = rs.getString("comentarios");
				int codigo_cliente = rs.getInt("codigo_cliente");

				pedido = new Pedido(codigo_pedido,codigo_cliente,fecha_pedido,fecha_esperada,fecha_entrega,estado,comentarios);
				pedidos.add(pedido);
			}
		}catch (SQLException e){
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

		return pedidos;
	}
}
