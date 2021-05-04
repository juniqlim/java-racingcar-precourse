package racingcar.domain;

public class Position {
    private int position;

    private Position(int position) {
        this.position = position;
    }

    public static Position of(int position) {
        return new Position(position);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position++;
        }
    }

    public int value() {
        return position;
    }

    public Position max(Position otherPosition) {
        return this;
    }
}
