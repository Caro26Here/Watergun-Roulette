/*
    Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
    del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
    tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
    Métodos:
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.
    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    • siguienteChorro(): cambia a la siguiente posición del tambor
    • toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package watergunrussianroulette.services;

import watergunrussianroulette.entities.Watergun;

/**
 *
 * @author carol
 */
public class WatergunService {
    
    public Watergun loadGun(int numberOfPlayers){
        
        //int randomInt = (int) (Math.random() * (max - min + 1)) + min;

        int currentPosition = (int) (Math.random()*(numberOfPlayers) + 1);
        int loadedPosition = (int) (Math.random()*(numberOfPlayers) + 1);
        
        Watergun gun = new Watergun(currentPosition, loadedPosition);
        
        return gun;
    }

    public boolean shot(Watergun gun){
        
        return gun.getCurrentPosition() == gun.getLoadedPosition();
    }

    public void nextPosition(Watergun gun, int numberOfPlayers){
        
        if (gun.getCurrentPosition() < numberOfPlayers){
            
            gun.setCurrentPosition(gun.getCurrentPosition() + 1);
            
        } else {
            gun.setCurrentPosition(1); 
        }
    
    }
}
