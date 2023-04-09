import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Videojuego {
    public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    public ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
    private String nombreJuego;
    public String getNombreJuego() {
        return this.nombreJuego;
    }
    public void setNombreJuego(String nombre) {
        this.nombreJuego = nombreJuego;
    }

    public Videojuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
    public void pelearJugador(Jugador jugador, Jugador jugador2) {
        while (jugador.getVida() > 0 && jugador2.getVida() > 0) {
            System.out.println(jugador.getNombre().toString() + " ataca a " + jugador2.getNombre() + " con " + jugador.getFuerza() + " de fuerza.");
            jugador2.setVida(jugador2.getVida() - jugador.getFuerza());
            if (jugador2.getVida() <= 0) {
                System.out.println(jugador.getNombre()+" has ganado la pelea.");
                return;
            }
            System.out.println(jugador2.getNombre() + " ataca a " + jugador.getNombre() + " con " + jugador2.getFuerza() + " de fuerza.");
            jugador.setVida(jugador.getVida() - jugador2.getFuerza());
            if (jugador.getVida() <= 0) {
                System.out.println(jugador2.getNombre()+" ha ganado la pelea.");
                return;
            }
        }
        System.out.println("La pelea ha terminado en empate.");
        System.out.println("");
        System.out.println("");
    }
    public void pelearAlquimista(Jugador jugador, Enemigo alquimista) {
        while (jugador.getVida() > 0 && alquimista.getVida() > 0) {
            System.out.println(jugador.getNombre().toString() + " ataca al " + alquimista.getNombreEnemigo() + " con " + jugador.getFuerza() + " de fuerza.");
            alquimista.setVida(alquimista.getVida() - jugador.getFuerza());
            if (alquimista.getVida() <= 0) {
                System.out.println(jugador.getNombre()+" ha ganado la pelea.");
                return;
            }
            System.out.println(alquimista.getNombreEnemigo() + " ataca a " + jugador.getNombre() + " con " + alquimista.getFuerza() + " de fuerza.");
            jugador.setVida(jugador.getVida() - alquimista.getFuerza());
            if (jugador.getVida() <= 0) {
                System.out.println("El "+alquimista.getNombreEnemigo()+" ha ganado la pelea.");
                return;
            }
        }
        System.out.println("La pelea ha terminado en empate.");
        System.out.println("");
        System.out.println("");
    }
    public void pelearPirata(Jugador jugador, Enemigo pirata) {
        while (jugador.getVida() > 0 && pirata.getVida() > 0) {
            System.out.println(jugador.getNombre().toString() + " ataca al " + pirata.getNombreEnemigo() + " con " + jugador.getFuerza() + " de fuerza.");
            pirata.setVida(pirata.getVida() - jugador.getFuerza());
            if (pirata.getVida() <= 0) {
                System.out.println(jugador.getNombre()+" ha ganado la pelea.");
                return;
            }
            System.out.println(pirata.getNombreEnemigo() + " ataca a " + jugador.getNombre() + " con " + pirata.getFuerza() + " de fuerza.");
            jugador.setVida(jugador.getVida() - pirata.getFuerza());
            if (jugador.getVida() <= 0) {
                System.out.println("El "+pirata.getNombreEnemigo()+" ha ganado la pelea.");
                return;
            }
        }
        System.out.println("La pelea ha terminado en empate.");
        System.out.println("");
        System.out.println("");
    }
    public void pelearNinja(Jugador jugador, Enemigo ninja) {
        while (jugador.getVida() > 0 && ninja.getVida() > 0) {
            System.out.println(jugador.getNombre().toString() + " ataca al " + ninja.getNombreEnemigo() + " con " + jugador.getFuerza() + " de fuerza.");
            ninja.setVida(ninja.getVida() - jugador.getFuerza());
            if (ninja.getVida() <= 0) {
                System.out.println(jugador.getNombre()+" ha ganado la pelea.");
                return;
            }
            System.out.println(ninja.getNombreEnemigo() + " ataca a " + jugador.getNombre() + " con " + ninja.getFuerza() + " de fuerza.");
            jugador.setVida(jugador.getVida() - ninja.getFuerza());
            if (jugador.getVida() <= 0) {
                System.out.println("El "+ninja.getNombreEnemigo()+" ha ganado la pelea.");
                return;
            }
        }
        System.out.println("La pelea ha terminado en empate.");
        System.out.println("");
        System.out.println("");
    }
    public void pelearCazador(Jugador jugador, Enemigo cazador) {
        while (jugador.getVida() > 0 && cazador.getVida() > 0) {
            System.out.println(jugador.getNombre().toString() + " ataca al " + cazador.getNombreEnemigo() + " con " + jugador.getFuerza() + " de fuerza.");
            cazador.setVida(cazador.getVida() - jugador.getFuerza());
            if (cazador.getVida() <= 0) {
                System.out.println(jugador.getNombre()+" ha ganado la pelea.");
                return;
            }
            System.out.println(cazador.getNombreEnemigo() + " ataca a " + jugador.getNombre() + " con " + cazador.getFuerza() + " de fuerza.");
            jugador.setVida(jugador.getVida() - cazador.getFuerza());
            if (jugador.getVida() <= 0) {
                System.out.println("El "+cazador.getNombreEnemigo()+" ha ganado la pelea.");
                return;
            }
        }
        System.out.println("La pelea ha terminado en empate.");
        System.out.println("");
        System.out.println("");
    }
    public void menuPrincipal(){
        System.out.println("Presione 1 si desea pelear contra otro jugador");
        System.out.println("Presione 2 si desea pelear contra un alquimista");
        System.out.println("Presione 3 si desea pelear contra un pirata");
        System.out.println("Presione 4 si desea pelear contra un ninja");
        System.out.println("Presione 5 si desea pelear contra un cazador");
        System.out.println("Presione 6 si desea salir");
    }
    public void mostrarMenu() {
        Videojuego juego = new Videojuego("Juego de pelea");
        Jugador jugador1 = new Jugador("Bastian",20,5);
        Jugador jugador2 = new Jugador("Christian", 27,2);
        Alquimista alquimista = new Alquimista("Alquimista",30,4,"Transmutar ",10);
        Pirata pirata = new Pirata("Pirata",10, 1,"Cortar", 8);
        Ninja ninja = new Ninja("Ninja",20,3,"Lanzar shuriken",20);
        Cazador cazador = new Cazador("Cazador",50, 2,"Flecha",15);
        int opcion= 0;
        do{
            Scanner intro = new Scanner(System.in);
            menuPrincipal();
            opcion = intro.nextInt();
            switch(opcion){
                case 1:
                    juego.pelearJugador(jugador1,jugador2);
                    break;
                case 2:
                    juego.pelearAlquimista(jugador1,alquimista);
                    break;
                case 3:
                    juego.pelearPirata(jugador1,pirata);
                    break;
                case 4:
                    juego.pelearNinja(jugador1,ninja);
                    break;
                case 5:
                    juego.pelearCazador(jugador1,cazador);
                    break;
                case 6:
                    break;

            }


        }while(opcion!=6);

    }
}
