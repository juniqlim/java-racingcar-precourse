package racingcar;

import java.util.Random;

public class Car {
    private final Name name;
    private int position;

    public Car(String name) {
        this.name = new Name(name);
    }

    public void move() {
        if (new Random().nextInt(9) >= 4) {
            position++;
        }
    }
}
