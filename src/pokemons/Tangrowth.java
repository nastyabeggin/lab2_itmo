package pokemons;
import pokemons.*;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level) {
        super(name, level);
        setStats(100, 100, 125, 110, 50, 50);
        setType(Type.GRASS);
        setMove(new Frustration(), new Fly(), new Metronome(), new LeechSeed());
    }
}