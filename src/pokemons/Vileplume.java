package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Vileplume extends Pokemon {
    public Vileplume(String name, int level) {
        super(name, level);
        setStats(75, 80, 85, 110, 90, 50);
        setType(Type.GRASS);
        setMove(new RockThrow(), new TeeterDance(), new Headbutt(), new HiddenPower());
    }
}