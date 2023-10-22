import java.util.Scanner;

public class Amen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("sir! Bitte geben Sie eine Zahl ein:");

    int x = scanner.nextInt();
    int result=x*x ;
    System.out.println(" Das Quadrat der Zahl ist: " + result);
  }
}
