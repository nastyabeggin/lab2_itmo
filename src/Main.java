import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p2 = new Tangela("Predator", 1);
        Pokemon p1 = new Heatmor("Alien", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
