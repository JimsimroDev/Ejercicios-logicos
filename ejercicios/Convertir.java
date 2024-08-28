/*
 * Algoritmo para comvertir numero negativo a positivo
*/

import java.util.Scanner;

public class Convertir {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa un numero entero - o +");
    int numeroNegativo = in.nextInt();
    if (numeroNegativo < 0) {
      int numeroPositivo = numeroNegativo * -1;
      System.out.printf("El numero %d convertido a positivo es %d", numeroNegativo, numeroPositivo);
    } else {
      System.out.printf("El numero en positivo es %d ", numeroNegativo);
    }
  }
}
