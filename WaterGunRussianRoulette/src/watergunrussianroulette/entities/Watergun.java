/*
    Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
    (posición del tambor que se dispara, puede que esté el agua o no) y posición agua
    (la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
    aleatoriamente.
    • toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package watergunrussianroulette.entities;

/**
 *
 * @author carol
 */
public class Watergun {
    
    private int currentPosition;
    private int loadedPosition;

    public Watergun() {
    }

    public Watergun(int currentPosition, int loadedPosition) {
        this.currentPosition = currentPosition;
        this.loadedPosition = loadedPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getLoadedPosition() {
        return loadedPosition;
    }

    public void setLoadedPosition(int loadedPosition) {
        this.loadedPosition = loadedPosition;
    }

    @Override
    public String toString() {
        return "Watergun{" + "current position = " + currentPosition + ", loaded position = " + loadedPosition + '}';
    }


}
