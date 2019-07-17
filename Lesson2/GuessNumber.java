import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player firstPlayer, secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        randomNumber = (int) (Math.random() * 101);
        do {
            System.out.println(firstPlayer.getName() + " пробует угадать число: ");
            firstPlayer.setNumTry(scan.nextInt());

            if (firstPlayer.getNumTry() < randomNumber) {
                System.out.println("Мало");
            } else if (firstPlayer.getNumTry() > randomNumber) {
                System.out.println("Перебор");
            } else if (firstPlayer.getNumTry() == randomNumber) {
                System.out.println("В яблочко!");
                return;
            }

            System.out.println(secondPlayer.getName() + " пробует угадать число: ");
            secondPlayer.setNumTry(scan.nextInt());

            if (secondPlayer.getNumTry() < randomNumber) {
                System.out.println("Мало");
            } else if (secondPlayer.getNumTry() > randomNumber) {
                System.out.println("Перебор");
            } else if (secondPlayer.getNumTry() == randomNumber) {
                System.out.println("В яблочко!");
                return;
            }
        } while (true);
    }
}
