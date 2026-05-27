package Corte2.ListasCircularesDobles.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        MetroCircular metro = new MetroCircular();

        metro.agregarEstacion("A", 1, 1000);
        metro.agregarEstacion("B", 2, 1500);
        metro.agregarEstacion("C", 3, 2000);
        metro.agregarEstacion("D", 1, 1200);
        metro.agregarEstacion("E", 2, 1800);
        metro.agregarEstacion("F", 3, 1600);

        metro.rutaMasCorta("A", "D");
    }
}