package Gestion;

public class GestionMenus {

    /**
     * Muestra el primer men� al abrir el programa, el de logearse como usuario o como admin
     */
    public static void MostrarMenuLogIn()
    {
        System.out.println("---------------------------------");
        System.out.println("|      M E N �  L O G - I N     |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Loggearse como usuario     |");
        System.out.println("| 2. Loggearse como admin       |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

    /**
     * Muestra el men� de opciones disponibles para un usuario normal
     */
    public static void MostrarMenuUsuario()
    {
        System.out.println("---------------------------------");
        System.out.println("|    M E N �  U S U A R I O     |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Hacer pedido               |");
        System.out.println("| 2. Consultar pedido           |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

    /**
     * Muestra el men� de opciones disponibles para un usuario normal
     */
    public static void MostrarMenuAdmin()
    {
        System.out.println("---------------------------------");
        System.out.println("|       M E N �  A D M I N      |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. A�adir pan                 |");
        System.out.println("| 2. A�adir complemento         |");
        System.out.println("| 3. A�adir ingrediente         |");
        System.out.println("| 4. A�adir cliente             |");
        System.out.println("| 5. Quitar pedido              |");
        System.out.println("|-------------------------------|");
        System.out.println("| 0. Salir                      |");
        System.out.println("---------------------------------\n");
    }

}
