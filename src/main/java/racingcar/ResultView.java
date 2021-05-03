package racingcar;

import java.util.List;

public class ResultView {
    public static void printScore(Cars cars) {
        for (Car car : cars) {
            System.out.println(car.nameValue() + " : " + positionGraph(car.positionValue()));
        }
        System.out.println();
    }

    private static String positionGraph(int position) {
        String positionGraph = "";
        for (int i = 0; i < position; i++) {
            positionGraph += "-";
        }
        return positionGraph;
    }

    public static void printWinner(List<Car> winners) {
        for (int i = 0; i < winners.size(); i++) {
            addSeparatorIfNotFirst(i);
            System.out.print(winners.get(i).nameValue());
        }
        System.out.println("가 최종 우승했습니다.");
    }

    private static void addSeparatorIfNotFirst(int index) {
        if (index != 0) {
            System.out.print(", ");
        }
    }
}
