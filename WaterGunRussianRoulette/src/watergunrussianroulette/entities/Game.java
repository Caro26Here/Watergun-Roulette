/*
    Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
    Revolver
    Métodos:
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
    moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    mojar. Al final del juego, se debe mostrar que jugador se mojó.
    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package watergunrussianroulette.entities;

import java.util.ArrayList;

/**
 *
 * @author carol
 */
public class Game {
    
    public static ArrayList<Player> playerList;
    private Watergun wg;

    public Game() {
    }

    public Game(ArrayList<Player> playerList, Watergun wg) {
        this.playerList = playerList;
        this.wg = wg;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public Watergun getWatergun() {
        return wg;
    }

    public  void setWatergun(Watergun wg) {
        this.wg = wg;
    }
    
    
}
