package Datos;

public class Oficina {
	private String codigo_oficina,telefono;

	public Oficina(String codigo_oficina, String telefono) {
		this.codigo_oficina = codigo_oficina;
		this.telefono = telefono;
	}

	public String getCodigo_oficina() {
		return codigo_oficina;
	}

	public void setCodigo_oficina(String codigo_oficina) {
		this.codigo_oficina = codigo_oficina;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Oficina{" +
				"codigo_oficina='" + codigo_oficina + '\'' +
				", telefono='" + telefono + '\'' +
				'}';
	}
}
