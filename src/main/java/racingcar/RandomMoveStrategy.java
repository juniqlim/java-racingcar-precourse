package racingcar;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    public static final int BOUND = 9;
    public static final int MAGIC_NUMBER = 4;

    @Override
    public boolean movable() {
        return new Random().nextInt(BOUND) >= MAGIC_NUMBER;
    }
}
