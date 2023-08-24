/*
    Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
    jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
    si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
    debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
    Métodos:
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    devuelve true, sino false.
 */
package watergunrussianroulette.services;

import java.util.ArrayList;
import java.util.Scanner;
import watergunrussianroulette.entities.Player;
import watergunrussianroulette.entities.Watergun;

/**
 *
 * @author carol
 */
public class PlayerService {
    
    private ArrayList<Player> playerList = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);

    public void createPlayers(int numberOfPlayers){
        
        for (int i = 1; i <= numberOfPlayers; i++) {

            Player p = new Player();

            p.setId(String.valueOf(i));

            String player = "Player " + String.valueOf(i);
            p.setName(player);

            playerList.add(p);
        }
    }
    
    public ArrayList<Player> addPlayersToList(int numberOfPlayers){
              
        if (numberOfPlayers < 0 || numberOfPlayers > 6){
            
            System.out.println("Invalid number of players entered...");
            System.out.println("Players set to: 6.");
            System.out.println("");
            
            numberOfPlayers = 6;
        }
        
        createPlayers(numberOfPlayers);
        
        return playerList;
    }

    public boolean shot(Watergun wg, int numberOfPlayers){
        
        WatergunService wgS = new WatergunService();
        
        boolean isShot = wgS.shot(wg);
        
        if (isShot) { 
            
            return true;
            
        }else { 
        
            wgS.nextPosition(wg, numberOfPlayers); 
            
            return false; 
        }
    }
}
