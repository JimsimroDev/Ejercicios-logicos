public class BinarySearch {

  public static int binarySearch(long[] array, long number) {
    int left = 0;
    int rigth = array.length - 1;
    // se recorre mientras el elemento no este en el arreglo y recorrer mitades
    // izquierda si es menor y derecha si es mayor
    while (left <= rigth) {
      // obtener el elemento del medio
      int mid = (left + rigth) / 2;
      long midValue = array[mid];
      // si el elemento del medio es el que busco retono ese indice
      if (midValue == number) {
        return 1;
      }

      // si el elemento es mayor al del elemento del medio, recorro la derecha
      if (midValue > number) {
        rigth = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    long[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(binarySearch(array, 7));
  }
}

// Big O Notation
// es o(logN) por que en cada iteracion se parte a laa mitad el arreglo
// la idea principal de BinarySearch es que en vez de recorres todo el arreglo
// lo recorre por mitades
