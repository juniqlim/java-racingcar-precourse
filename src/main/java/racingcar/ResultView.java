package racingcar;

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
}
