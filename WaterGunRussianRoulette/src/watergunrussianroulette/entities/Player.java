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
package watergunrussianroulette.entities;

/**
 *
 * @author carol
 */
public class Player {

    private String id;
    private String name;
    private boolean wet;

    public Player() {
    }

    public Player(String id, String name, boolean wet) {
        this.id = id;
        this.name = name;
        this.wet = wet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    @Override
    public String toString() {
        return "Player{" + "id = " + id + ", name = " + name + ", wet = " + wet + '}';
    }


}
