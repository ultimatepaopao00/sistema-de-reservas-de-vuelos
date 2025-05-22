import java.util.Scanner;

public class SistemaReserva {

    private static GestorVuelos gestorVuelos = new GestorVuelos();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearVuelo();
                    break;
                case 2:
                    eliminarVuelo();
                    break;
                case 3:
                    reservarAsiento();
                    break;
                case 4:
                    mostrarVuelos();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n--- SISTEMA DE RESERVA DE VUELOS ---");
        System.out.println("1. Crear vuelo");
        System.out.println("2. Eliminar vuelo");
        System.out.println("3. Reservar asiento");
        System.out.println("4. Mostrar vuelos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearVuelo() {
        System.out.print("Ingrese el ID del vuelo: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese el origen: ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();
        System.out.print("Ingrese la capacidad del vuelo: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        gestorVuelos.crearVuelo(id, origen, destino, capacidad);
        System.out.println("Vuelo creado exitosamente.");
    }

    private static void eliminarVuelo() {
        System.out.print("Ingrese el ID del vuelo a eliminar: ");
        String id = scanner.nextLine();
        if (gestorVuelos.eliminarVuelo(id)) {
            System.out.println("Vuelo eliminado.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    private static void reservarAsiento() {
        System.out.print("Ingrese el ID del vuelo: ");
        String id = scanner.nextLine();
        if (gestorVuelos.reservarAsiento(id)) {
            System.out.println("Asiento reservado.");
        } else {
            System.out.println("No se pudo reservar el asiento (vuelo lleno o no existe).");
        }
    }

    private static void mostrarVuelos() {
        gestorVuelos.mostrarVuelos();
    }
}

