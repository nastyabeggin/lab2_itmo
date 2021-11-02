package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;


public class Metronome extends StatusMove {
    private int randomMoveIndex;
    private static final String[] MOVES = new String[]{
            "Fly",
            "Frustration",
            "Headbutt",
            "HiddenPower",
            "LeechSeed",
            "MegaDrain",
            "Pursuit",
            "RockThrow",
            "Snore",
            "TakeDown",
            "TeeterDance"
    };

    public Metronome() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Random generator = new Random();
        randomMoveIndex = generator.nextInt(MOVES.length);

        // how to change the next move?? getPreparedMove() setMove() don't work
    }

    @Override
    protected String describe() {
        return "uses Metronome and chooses randomly" + MOVES[randomMoveIndex];
    }

}
