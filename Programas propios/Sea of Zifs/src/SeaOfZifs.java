/*  Nombre del programa:
        Sea of Zifs

    Análisis:
        Este juego se basa en el reciente (20 marzo, 2018) juego de piratas, donde vas buscando tesoros por islas,
        donde te puedes encontrar a otros jugadores, atacarles, robarles, encontrarte con enemigos, etc.
        No se implementará la parte de encontrarse a otros jugadores, pero sí lo demás.

        El juego tendrá un mapa, con 6 islas distintas, más una isla principal, en la que se empieza:
            Happiness Island //Aquí se empieza
            Calamah Island
            Null Island
            Cucumber Island
            Bolsillodedoraimon Island
            Tritetua Island
            Staling Island

        Se podrá navegar por todo el mar, y se podrá andar por tierra. Podrás encontrarte enemigos mientras andas
        por las islas, y podrás pedirle quests a algunos NPCs

        Las batallas serán estilo Pokemon, con un menú de pelea, y donde se podrá ver la vida del enemigo, etc.

        Siendo un juego, necesitará unos controles. Se hará mediante letras. El jugador tendrá que ir escribiendo las
        letras y pulsando el intro para ir moviéndose, o haciendo las diferentes acciones. Estos son los controles:
            W, A, S, D ------> Moverse en diferentes direcciones
            E ---------------> Acción (hablar con NPCs, usar objeto, etc.)
            M ---------------> Menú In-Game
            I ---------------> Inventario

        El MIG (Menú In-Game) contendrá las siguientes opciones:
            Guardar partida
            Guardar y salir
            Cambiar dificultad
            Salir sin guardar

    Pseudocódigo Generalizado:
        Inicio
            Repetir
                mostrarMP * //MP, Menú Principal
                Leer y validar opción MP
                Según (opcionMP)
                    Caso '1':
                        Cargar partida
                    Caso '2':
                        Crear partida
                    Caso '3':
                        Borrar partida
                    Caso '0':
                        Salir
                Fin Según
                Mientras (jugar)
                    MostrarMapa *
                    Leer y validar Letra de Control
                    Según (letra de control) //Letras de control descritas en Análisis
                        Caso 'W': MovimientoW *
                        Caso 'A': MovimientoA *
                        Caso 'S': MovimientoS *
                        Caso 'D': MovimientoD *
                        TODO Caso 'E': AccionRealizada *
                        Caso 'M': MostrarMenuJugador *
                        TODO Caso 'I': AbrirInventario *
                    Fin Según
                Fin Mientras
            Mientras (opcionMP != '0')
        Fin


    Pseudocódigo Específico (MenuPartidasGuardadas)
        Inicio
            Abrir fichero de guardado para leer
            Leer partidas guardadas
            Mostrar en pantalla partidas guardadas
        Fin

    Pseudocódigo Específico (CrearPartidaNueva)
        Inicio
            Leer nombre de guardado
            Copiar fichero de partida nueva y nombrar //Copiar de "assets" y guardar copia en "savegames"
            Copiar fichero de partida para uso temporal //Copiar en "savegames" bajo el nombre de $~(nombre de guardado)
        Fin

    Pseudocódigo Específico (MostrarMapa)
        Inicio
            Abrir fichero de partida en uso para leer
            Leer carácter de fichero
            Mientras (carácter != -1)
                Imprimir carácter en pantalla
                Leer carácter de fichero
            Fin Mientras
        Fin

    Pseudocódigo Específico (Movimiento[WASD])
        Inicio
            Abrir fichero de partida en uso para escribir
            Mover Jugador
            Según (carácter al que se haya movido)
                TODO: Elegir qué caracteres representará cada cosa (agua, tierra, NPC, personaje, etc)
        Fin

    TODO Pseudocódigo Específico (AccionRealizada)
        Inicio
            Mirar casillas alrededor
            Si (hay algo que hacer)
                Según (qué hay alrededor)
                    TODO: Elegir qué caracteres representará cada cosa (agua, tierra, NPC, personaje, etc)
                Fin Según
            Si no
                Mostrar mensaje de error
            Fin Si
        Fin





 */
import java.util.*;

import Gestoras.*;

public class SeaOfZifs {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        GestoraMenus g = new GestoraMenus();
        GestoraPartidas gp = new GestoraPartidas();
        GestoraJuego gj = new GestoraJuego();

        char opcionMP;

        boolean jugar = false;
        boolean borrado;
        boolean cargado;
        boolean empty;

        String nombrePartidaNueva;
        String nombrePartidaCargada = "";

        do
        {
            g.mostrarMP();
            //Leer y validar opción MP
            do
            {
                opcionMP = teclado.next().charAt(0);
                if(opcionMP < '0' ||opcionMP > '3')
                {
                    System.out.println("¡Solo del 1 al 3, o 0 para salir!");
                }
            }while(opcionMP < '0' ||opcionMP > '3');


            switch(opcionMP)
            {
                case '1':
                    //Cargar partida
                    empty = gp.mostrarMPG();
                    if(!empty)
                    {
                        System.out.println("Escribe el nombre de la partida que quieres cargar:");
                        nombrePartidaCargada = tecladoS.nextLine();
                        cargado = gp.cargarPartida(nombrePartidaCargada);
                        if (cargado)
                         {
                            System.out.println("¡Partida cargada con éxito!");
                            jugar = true;
                        } else {
                            System.out.println("¡No se ha podido encontrar una partida con ese nombre!");
                        }
                    }

                    break;

                case '2':
                    //Crear partida
                    System.out.println("Escribe tu nombre:");
                    nombrePartidaNueva = tecladoS.nextLine();
                    gp.crearPartidaNueva(nombrePartidaNueva);
                    nombrePartidaCargada = nombrePartidaNueva;
                    gp.cargarPartida(nombrePartidaCargada);

                    jugar = true;
                    break;

                case '3':
                    //Borrar partida
                    empty = gp.mostrarMPG();
                    if(!empty)
                    {
                        System.out.println("Escribe el nombre de la partida que quieres borrar:");
                        borrado = gp.borrarPartida(tecladoS.nextLine());
                        if(borrado)
                            System.out.println("¡Tu partida se ha borrado correctamente!");
                        else
                            System.out.println("La partida que has indicado no se ha encontrado");
                    }

                    jugar = false;
                    break;

                case '0': jugar = false; break;
            }

            //El juego en sí
            while(jugar)
            {
                gj.mostrarMapa(nombrePartidaCargada);

                gp.descargarPartida(nombrePartidaCargada);
                jugar = false;
            }

        }while(opcionMP != '0');
    }
}