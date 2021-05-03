package racingcar;

public class Game {
    public static void main(String[] args) {
        Cars cars = Cars.of(InputView.names());
        int tryCount = InputView.tryCount();
        for (int i = 0; i < tryCount; i++) {
            cars.move(new RandomMoveStrategy());
            ResultView.printScore(cars);
        }
        ResultView.printWinner(cars.winners());
    }
}
