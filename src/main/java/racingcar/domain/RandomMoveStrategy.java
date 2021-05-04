package racingcar.domain;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    public static final int BOUND_OF_RANDOM_NUMBER = 9;
    public static final int CRITERIA_OF_CAR_MOVEMENT = 4;

    @Override
    public boolean movable() {
        return new Random().nextInt(BOUND_OF_RANDOM_NUMBER) >= CRITERIA_OF_CAR_MOVEMENT;
    }
}
