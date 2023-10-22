import java.util.Random;

public class Random {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Bitte geben Sie genau zwei Ganzzahlen als Argumente ein.");
            return;
        }

        int lower = Integer.parseInt(args[0]);
        int upper = Integer.parseInt(args[1]);

        if (upper < lower) {
            System.out.println("Das zweite Argument darf nicht kleiner als das erste sein.");
            return;
        }

        Random random = new Random();
        int Number = random.nextInt(upper - lower + 1) + lower;

        System.out.println(Number);
    }
}
