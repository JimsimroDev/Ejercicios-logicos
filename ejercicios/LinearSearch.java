public class LinearSearch {

  public static long busquedaLineal(long[] array, long number) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    long[] array = { 1, 2, 3, 4, 5, 6, 7 };

    System.out.println(busquedaLineal(array, 8));
  }
}
/*
 * Tenemeos que pensar en el peor de los casos
 * el mejor de los casos es que el elemento es el primero
 * el average de los casos es que el elemento es el del medio
 * el peor de los casos es que el elemento sea el ultimo o no exista
 * Big O Notation
 * este algoritmo tiene una complegidad o(n) a medida que crece N -> aumenta la
 * complejidad
 */
