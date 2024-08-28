/* Un administrador de uns establecimiento necesita un programa que permita calcular el total a pagar
 * de varios clientes que utilizan el servicio
 * El programa debe solicitar por teclado dos datos
 * • La patente del vehiculo
 * • El tipo de estacionamineto
 *  Tipos de estacionamineto disponibles
 *  • Por hora (cuyo valor es de $3 usd por hora)
 *  • Media jornada (cuyo valor total es de $17 USD y posee 5% de descuento)
 *  • jornada completa (cuyo valor fijo es de $30 usd y posse el 10% de descuento)
 *  El programa debe calcular el monto a pagar para cada cliente en funcion del tipo de establecimiento
 *  selecion. La carga de datos debe continuar hasta que el usuario ingrese la palabra "FIN" en lugar
 *  la patente
 *  Al finalizar el progama debe mostrar por pantalla 
 *  La cantidad total de estacionamineto por hora
 *  La cantidad total de estacionamineto por media jornada
 *  La cantidad total de estacionamineto por jornada completa
 *  La suma total de ingesos en USD que hubo durante el dia
 */

import java.util.Scanner;

public class Estacionamiento {

  private static double pagoTotal = 0;

  public static void patenteEstacionamiento(String patente, String estacionamiento) {
    Scanner in = new Scanner(System.in);
    double mediaJornada = 15;
    double jornadaCompleta = 30;

    if (estacionamiento.equals("1")) {
      System.out.println("Ingrese la cantidad de horas que desea estaconar el vehiculo");
      long cantidadHoras = in.nextInt();
      long pago = (cantidadHoras * 3);
      System.out.println("Pagaras $" + pago + " USD");
      agregarValor(pago);
    } else if (estacionamiento.equals("2")) {
      double pagoMediaJornada = mediaJornada - (mediaJornada * 0.05);
      System.out.printf("Tu pago por el estacionamiento es de $%f USD\n", pagoMediaJornada);
      agregarValor(pagoMediaJornada);
    } else {
      double pagoJornadaCompleta = jornadaCompleta - (jornadaCompleta * 0.1);
      System.out.printf("Tu pago por el estacionamiento es de %f$ USD\n", pagoJornadaCompleta);
      agregarValor(pagoJornadaCompleta);
    }
    System.out.println(" El total de ingresos en el dia es de $" + pagoTotal + " USD");
  }

  public static void agregarValor(double valor) {
    pagoTotal += valor;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String patente = "";
    System.out.println("Ingrese la pantente");
    while (!patente.equals("fin")) {
      patente = in.nextLine();
      System.out.println("Ingrese el estacionamiento");
      String estacionamiento = in.nextLine();
      System.out.println("Ingrese la pantente");
      patente = in.nextLine();
      patenteEstacionamiento(patente, estacionamiento);
    }
    in.close();
  }
}
