public class Jugador {
	private String nombre;
	private int vida;
	private int fuerza;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public Jugador(String nombre, int vida, int fuerza) {
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}

	@Override
	public String toString() {
		return nombre;
	}
}