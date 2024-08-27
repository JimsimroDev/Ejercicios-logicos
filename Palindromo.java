import java.util.Scanner;

public class Palindromo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa un palabra");
    String palabra = in.nextLine();
    for (int i = 0; i < palabra.length() / 2; i++) {
      if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
        System.out.printf("La parabra %s No es un palindromo", palabra);
        break;
      } else {
        System.out.printf("Lapalabra %s es un palindromo", palabra);
        break;
      }
    }
  }
}
