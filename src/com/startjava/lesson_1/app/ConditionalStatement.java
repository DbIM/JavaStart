public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 37;
        if (age > 30) {
            System.out.println("Ты слишком старый. пшел вон отсюда (с)'Бойцовский клуб' ");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Мужик!");
        }
        if (!isMale) {
            System.out.println("похоже что ты девчОнка");
        }

        double growth = 1.85;
        if (growth < 1.80) {
            System.out.println("Добро пожаловать в моряки");
        } else {
            System.out.println("Здравия желаю, товарищ гвардеец президентского полка");
        }

        char firstLeter = 'П';
        if (firstLeter == 'М') {
            System.out.println("За кого ты себя принимаешь?");
        } else if (firstLeter == 'И') {
            System.out.println("Нет такой буквы в этом слове");
        } else {
            System.out.println("Буква!");
        }
    }
}
