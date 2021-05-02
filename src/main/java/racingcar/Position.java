package racingcar;

import java.util.Objects;

public class Position {
    private int position;

    private Position(int position) {
        this.position = position;
    }

    public static Position of() {
        return new Position(0);
    }

    public static Position of(int position) {
        return new Position(position);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public int value() {
        return position;
    }
}
