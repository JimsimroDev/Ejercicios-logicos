/*
 * Genera nombres de super heroes 
 * Crea una funcion que genere un nombre de super héroe combinando una palabra
 * de una array de abjetivos y una palabra de un array de sustantivos
 */

import javax.crypto.Mac;

public class GenerarHeroes {

  public static void generadorDeSuperHeroes(String[] adjetivos, String[] sustantivos) {
    int nombre = numeroAleatorio(adjetivos.length);
    int apellido = numeroAleatorio(adjetivos.length);

    System.out.println("El super héroe creado es");
    System.out.println(adjetivos[nombre] + " " + sustantivos[apellido]);

  }

  public static int numeroAleatorio(int max) {
    int numero = (int) (Math.random() * max);
    return numero;
  }

  public static void main(String[] args) {
    String[] adjetivos = { "Guapo", "Poderoso", "Asombroso", "Muy Hermoso" };
    String[] sustantivos = { "Junior", "Bigoton", "Arquitecto", "Maestro" };
    generadorDeSuperHeroes(adjetivos, sustantivos);
  }
}
