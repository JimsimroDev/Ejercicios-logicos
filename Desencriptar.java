import java.util.regex.Pattern;

public class Desencriptar {

  public static void desencriptarMensaje(String mensaje) {
    long longitud = mensaje.length();
    String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
    char resultado = ' ';
    for (int i = 0; i < longitud; i++) {
      char c = mensaje.toLowerCase().charAt(i);

      for (int j = 0; j < alfabeto.length(); j++) {
        char a = alfabeto.charAt(j);
        if (c == a) {
          resultado = alfabeto.charAt(j + 1);
          System.out.print(resultado);
        }
      }
    }
  }

  public static void main(String[] args) {
    desencriptarMensaje("Itmhnq dk ptd kdd");
  }
}
