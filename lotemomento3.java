import java.util.Scanner;

public class lotemomento3 {

    public static boolean buscarReferencia(String[] lote, String nombreBuscado) {
        for (int i = 0; i < lote.length; i++) {
            if (lote[i] != null && lote[i].equalsIgnoreCase(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lote = {"Jeans AirFlex", "Graphic Tee", "Denim Jacket", null, null};
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE LOTES AMERICAN EAGLE ---");
            System.out.println("1. Listar coleccion en bodega");
            System.out.println("2. Buscar referencia en lote");
            System.out.println("3. Ingresar prenda al lote");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < lote.length; i++) {
                        if (lote[i] != null) {
                            System.out.println("- " + lote[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nombre de la referencia: ");
                    String nombreBuscado = sc.nextLine();
                    if (buscarReferencia(lote, nombreBuscado)) {
                        System.out.println("La prenda esta guardada en la caja.");
                    } else {
                        System.out.println("La prenda no esta en la caja.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre de la nueva referencia: ");
                    String nuevaPrenda = sc.nextLine();
                    boolean guardada = false;
                    for (int i = 0; i < lote.length; i++) {
                        if (lote[i] == null) {
                            lote[i] = nuevaPrenda;
                            guardada = true;
                            break;
                        }
                    }
                    if (guardada) {
                        System.out.println("Prenda ingresada al lote.");
                    } else {
                        System.out.println("La caja esta llena.");
                    }
                    break;

                case 4:
                    System.out.println("Aplicacion cerrada.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}