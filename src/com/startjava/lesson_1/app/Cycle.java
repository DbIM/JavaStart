public class Cycle {
    public static void main(String[] args){
        for (int i = 0; i <= 20; i++){
            System.out.println(i);
        }
        
        int counter = -6;
        while (counter <= 6){
            System.out.println(counter);
            counter += 2;
        }
        
        int number = 10;
        int sumOdd = 0;
        do {
            if (number % 2 != 0){
                sumOdd += number;
            } 
            number++;
        } while (number <= 20);
        System.out.println(sumOdd);
    }
}
