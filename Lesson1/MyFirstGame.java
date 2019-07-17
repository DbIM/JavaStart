public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = 13;
        int userNumber = 1;
        guessNumber(userNumber, randomNumber);
        System.out.println("В яблочко!");
    }

    public static void guessNumber(int userNumber, int randomNumber) {
        if (userNumber < randomNumber) {
            for (; userNumber <= randomNumber; userNumber++) {
                System.out.println("Мало");
            }
        } else if (userNumber > randomNumber) {
            for (; userNumber >= randomNumber; userNumber--) {
                System.out.println("Перебор");
            }
        }
    }
}
