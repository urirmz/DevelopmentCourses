
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int sumOfSequence = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            sumOfSequence += i;
        }
        System.out.println(sumOfSequence);
    }
}
