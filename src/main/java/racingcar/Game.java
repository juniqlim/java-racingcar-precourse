package racingcar;

public class Game {
    public static void main(String[] args) {
        Cars cars = Cars.of(InputView.names());
        racing(cars, InputView.tryCount());
        ResultView.printWinner(cars.winners());
    }

    private static void racing(Cars cars, int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            cars.move(new RandomMoveStrategy());
            ResultView.printScore(cars);
        }
    }
}
