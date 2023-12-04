package Datos;

public class Gama {
	private String gama;

	public Gama(String gama) {
		this.gama = gama;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	@Override
	public String toString() {
		return "Nombre gama: "+gama;
	}
}
