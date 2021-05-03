package racingcar.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }

    public static Cars of(String names) {
        String[] splitedNames = names.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : splitedNames) {
            cars.add(Car.of(name));
        }
        return new Cars(cars);
    }

    public void move(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public List<Car> winners() {
        int topPosition = findTopPosition();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            addWinner(topPosition, winners, car);
        }
        return winners;
    }

    private void addWinner(int topPosition, List<Car> winners, Car car) {
        if (car.equalPosition(topPosition)) {
            winners.add(car);
        }
    }

    private int findTopPosition() {
        int topPosition = 0;
        for (Car car : cars) {
            topPosition = car.largerPosition(topPosition);
        }
        return topPosition;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
