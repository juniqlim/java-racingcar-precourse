package racingcar;

public class Car {
    private final Name name;
    private final Position position;

    private Car(String name, int position) {
        this.name = Name.of(name);
        this.position = Position.of(position);
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public static Car of(String name) {
        return of(name, 0);
    }

    public void move(MoveStrategy moveStrategy) {
        position.move(moveStrategy);
    }

    public String nameValue() {
        return name.value();
    }

    public int positionValue() {
        return position.value();
    }

    public int largerPosition(int otherPosition) {
        return Math.max(position.value(), otherPosition);
    }

    public boolean equalPosition(int otherPosition) {
        return position.value() == otherPosition;
    }
}
