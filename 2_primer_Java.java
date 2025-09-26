import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        char[] original = {'a', '1', 'b', '2', 'c', '3'};
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        for (char c : original) {
            if (Character.isLetter(c)) {
                letters.add(c); 
            } else if (Character.isDigit(c)) { 
                numbers.add(c); 
            }
        }

        for (char c : letters) {
            System.out.print(c);
        }
        System.out.println();

        original = null; 
        System.gc();

        for (char c : numbers) {
            System.out.print(c);
        }
    }
}
