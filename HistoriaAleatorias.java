/*
 * Genera Historia Aleatorias
 * Crea una funcion que  genere una histoira Aleatorias usando un arrays de sujetos, verbos y
* objetos
*/

public class HistoriaAleatorias {

  public static void crearHistoriaRidicula() {

    String[] sujetos = {
        "El gato",
        "Un pirata",
        "La abuela",
        "Un marciano",
        "El Plomero",
        "El joer"
    };
    int sujeto = posicinAleatoria(sujetos.length);
    String primeraParte = sujetos[sujeto];

    String[] verbos = { "se comio", "perdio", "invento", "rompio", "encontro" };
    int verbo = posicinAleatoria(verbos.length);
    String segundaParte = verbos[verbo];

    String objetos[] = {
        "una empanada",
        "un zapato",
        "una lampara",
        "un hámster",
        "un pastel"
    };
    int objeto = posicinAleatoria(objetos.length);
    String terceraParte = objetos[objeto];

    System.out.printf("%s %s %s \n", primeraParte, segundaParte, terceraParte);
  }

  public static int posicinAleatoria(int max) {
    int numero = (int) (Math.random() * max);
    return numero;
  }

  public static void main(String[] args) {
    crearHistoriaRidicula();
  }
}
