public abstract class Enemigo {
	private String nombreEnemigo;
	private int vida;
	private int fuerza;
	private String nombreHabilidad;
	private int velocidad;

	public String getNombreEnemigo() {
		return nombreEnemigo;
	}

	public void setNombreEnemigo(String nombreEnemigo) {
		this.nombreEnemigo = nombreEnemigo;
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

	public String getNombreHabilidad() {
		return this.nombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		this.nombreHabilidad = nombreHabilidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Enemigo(String nombreEnemigo, int vida, int fuerza, String nombreHabilidad, int velocidad) {
		this.nombreEnemigo = nombreEnemigo;
		this.vida = vida;
		this.fuerza = fuerza;
		this.nombreHabilidad = nombreHabilidad;
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return nombreEnemigo;
	}
}