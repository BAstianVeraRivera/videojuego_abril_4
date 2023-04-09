import java.util.ArrayList;

public class Launcher {
	public static void main(String [] args) {
		inicializar();
	}
	public static void inicializar() {
		Videojuego juego = new Videojuego("Juego de pelea");
		juego.mostrarMenu();
	}
}