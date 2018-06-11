package Gestion;

public class GestionMenus {

    /**
     * Muestra el primer menú al abrir el programa, el de logearse como usuario o como admin
     */
    public static void MostrarMenuLogIn()
    {
        System.out.println("---------------------------------");
        System.out.println("|      M E N Ú  L O G - I N     |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Loggearse como usuario     |");
        System.out.println("| 2. Loggearse como admin       |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

    /**
     * Muestra el menú de opciones disponibles para un usuario normal
     */
    public static void MostrarMenuUsuario()
    {
        System.out.println("---------------------------------");
        System.out.println("|    M E N Ú  U S U A R I O     |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Hacer pedido               |");
        System.out.println("| 2. Consultar pedido           |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

    /**
     * Muestra el menú de opciones disponibles para un usuario normal
     */
    public static void MostrarMenuAdmin()
    {
        System.out.println("---------------------------------");
        System.out.println("|       M E N Ú  A D M I N      |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Añadir pan                 |");
        System.out.println("| 2. Añadir complemento         |");
        System.out.println("| 3. Añadir ingrediente         |");
        System.out.println("| 4. Añadir cliente             |");
        System.out.println("| 5. Quitar pedido              |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

}
