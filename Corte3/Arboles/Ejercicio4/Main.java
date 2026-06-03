package Corte3.Arboles.Ejercicio4;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RankingELO ranking = new RankingELO();
        int opcion;

        do {
            System.out.println("\n*** MENÚ TORNEO DE AJEDREZ ***");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Listar jugadores en rango ELO");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ELO: ");
                    int elo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre de usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("País: ");
                    String pais = sc.nextLine();
                    System.out.print("Partidas jugadas: ");
                    int partidas = sc.nextInt();
                    sc.nextLine();

                    ranking.insertar(elo, nombre, pais, partidas);
                    break;

                case 2:
                    System.out.print("ELO mínimo: ");
                    int eloMin = sc.nextInt();
                    System.out.print("ELO máximo: ");
                    int eloMax = sc.nextInt();
                    sc.nextLine();

                    ranking.listarEnRango(eloMin, eloMax);
                    break;

                case 0:
                    System.out.println("Fin del sistema de torneo.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
