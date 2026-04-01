//  Referencias a arrays

package Tema_2;

public class Ejercicio_7 {
  public static void main(String[] args) {
    int[] StockAlmacen = {30,40,50,60};
    int[] StockReportes= StockAlmacen;

    StockReportes[0] -= 5;

    System.out.println("Stock reportes se redujo en: " + StockReportes[0] + " unidades ");
    System.out.println("Stock almacen se reduce igualmente: " + StockAlmacen[0] + ", ya que el stock reportes es una referencia al mismo array.");
  }
}
