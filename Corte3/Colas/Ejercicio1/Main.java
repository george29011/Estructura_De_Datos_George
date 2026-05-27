package Corte3.Colas.Ejercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColaLlamadas cola = new ColaLlamadas();

        int opcion;

        do {

            System.out.println("\n===== CENTRO DE LLAMADAS =====");
            System.out.println("1. Agregar llamada");
            System.out.println("2. Atender llamada");
            System.out.println("3. Mostrar llamadas en espera");
            System.out.println("4. Contar llamadas por motivo");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese ID de llamada: ");
                    String id = sc.nextLine();

                    System.out.print("Ingrese nombre del cliente: ");
                    String nombre = sc.nextLine();

                    System.out.println("Motivos disponibles:");
                    System.out.println("- Facturación");
                    System.out.println("- Soporte Técnico");
                    System.out.println("- Cancelación");
                    System.out.println("- Información");

                    System.out.print("Ingrese motivo de consulta: ");
                    String motivo = sc.nextLine();

                    System.out.print("Ingrese duración estimada (minutos): ");
                    int duracion = sc.nextInt();

                    Llamada nueva = new Llamada(id,nombre,motivo,duracion);

                    cola.agregarLlamada(nueva);

                    break;

                case 2:

                    cola.atenderLlamada();

                    break;

                case 3:

                    cola.mostrarLlamadas();

                    break;

                case 4:

                    System.out.print("Ingrese el motivo a buscar: ");
                    String motivoBuscar = sc.nextLine();

                    int cantidad = cola.contarPorMotivo(motivoBuscar);

                    System.out.println(
                            "Cantidad de llamadas con motivo '" +
                            motivoBuscar + "': " + cantidad
                    );

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}