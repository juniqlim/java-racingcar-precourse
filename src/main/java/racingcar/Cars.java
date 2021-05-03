package racingcar;

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
        return null;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
