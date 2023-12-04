package Datos.Personalizado;

import java.sql.Date;

public class PedidoFechaInidialFinal {
	private Date fecha_pedido,fecha_entrega;

	public PedidoFechaInidialFinal(Date fecha_pedido, Date fecha_entrega) {
		this.fecha_pedido = fecha_pedido;
		this.fecha_entrega = fecha_entrega;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	@Override
	public String toString() {
		return "PedidoFechaInidialFinal{" +
				"fecha_pedido=" + fecha_pedido +
				", fecha_entrega=" + fecha_entrega +
				'}';
	}
}
