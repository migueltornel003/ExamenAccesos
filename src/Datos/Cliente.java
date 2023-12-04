package Datos;

public class Cliente {
	private int codigo_cliente;
	private String nombre_cliente,telefono,linea_direccion1,ciudad,pais;

	public Cliente(int codigo_cliente, String nombre_cliente, String telefono, String linea_direccion1, String ciudad, String pais) {
		this.codigo_cliente = codigo_cliente;
		this.nombre_cliente = nombre_cliente;
		this.telefono = telefono;
		this.linea_direccion1 = linea_direccion1;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLinea_direccion1() {
		return linea_direccion1;
	}

	public void setLinea_direccion1(String linea_direccion1) {
		this.linea_direccion1 = linea_direccion1;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return codigo_cliente+" - "+nombre_cliente+", "+telefono+", "+linea_direccion1+", "+ciudad+", "+pais;
	}
}
