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
package watergunrussianroulette.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import watergunrussianroulette.entities.Game;
import watergunrussianroulette.entities.Player;
import watergunrussianroulette.entities.Watergun;

/**
 *
 * @author carol
 */
public class GameService {
    
    Player player = new Player();
    PlayerService ps = new PlayerService();
    ArrayList<Player> playerList = new ArrayList<>();
    Game game = new Game();
    Scanner input = new Scanner(System.in);
        
    public void startGame(){
        
        System.out.println("Number of players: ");
        int numberOfPlayers = input.nextInt();
        input.nextLine();
        
        WatergunService wgS = new WatergunService();
        Watergun gun = wgS.loadGun(numberOfPlayers);

        game.setPlayerList(ps.addPlayersToList(numberOfPlayers));
        game.setWatergun(gun);
        
        round(numberOfPlayers);
    }

    public void round(int numberOfPlayers){
        
        playerList = game.getPlayerList();
        String option;
        
        Collections.shuffle(playerList);
        
        for (Player player : playerList) {
            
            boolean isShot = ps.shot(game.getWatergun(), numberOfPlayers);
            
            if(isShot){
                
                player.setWet(true);
                
                System.out.println("");
                System.out.println("_____________________________________");
                System.out.println(player.getName() + " has been SHOT");
                System.out.println("_____________________________________");
                System.out.println("");
                System.out.println("END OF GAME!");
                break;
                
            } else {
                System.out.println("");
                System.out.println(player.getName() + " is safe.");
                System.out.println("");
                System.out.println("continue playing? (Yes/No)");
                option = input.nextLine();
                
                if (option.equalsIgnoreCase("no")){
                    
                    System.out.println("Exiting the game early...");      
                    break;
                }
                
            }
        }
        
    }
    
}
