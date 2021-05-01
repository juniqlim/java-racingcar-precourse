package racingcar;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = Name.of(name);
        this.position = Position.of();
    }

    public Car(String name, int position) {
        this.name = Name.of(name);
        this.position = Position.of(position);
    }

    public void move(MoveStrategy moveStrategy) {
        position.move(moveStrategy);
    }
}
