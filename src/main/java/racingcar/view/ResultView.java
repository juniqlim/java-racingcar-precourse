package racingcar.view;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class ResultView {
    public static void printScore(Cars cars) {
        for (Car car : cars) {
            System.out.println(car.name() + " : " + positionGraph(car.position()));
        }
        System.out.println();
    }

    private static String positionGraph(int position) {
        StringBuilder positionGraph = new StringBuilder();
        for (int i = 0; i < position; i++) {
            positionGraph.append("-");
        }
        return positionGraph.toString();
    }

    public static void printWinner(List<Car> winners) {
        for (int i = 0; i < winners.size(); i++) {
            addSeparatorIfNotFirst(i);
            System.out.print(winners.get(i).name());
        }
        System.out.println("가 최종 우승했습니다.");
    }

    private static void addSeparatorIfNotFirst(int index) {
        if (index != 0) {
            System.out.print(", ");
        }
    }
}
