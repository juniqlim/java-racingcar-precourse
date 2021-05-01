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
}
