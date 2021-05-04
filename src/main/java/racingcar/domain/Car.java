package racingcar.domain;

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

    public String name() {
        return name.value();
    }

    public int position() {
        return position.value();
    }

    public Position largerPosition(Position otherPosition) {
        return position.max(otherPosition);
    }

    public boolean equalPosition(Position otherPosition) {
        return position.equals(otherPosition);
    }
}
