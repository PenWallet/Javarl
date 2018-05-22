/*  Nombre del programa:
        Sea of Zifs

    An�lisis:
        Este juego se basa en el reciente (20 marzo, 2018) juego de piratas, donde vas buscando tesoros por islas,
        donde te puedes encontrar a otros jugadores, atacarles, robarles, encontrarte con enemigos, etc.
        No se implementar� la parte de encontrarse a otros jugadores, pero s� lo dem�s.

        El juego tendr� un mapa, con 6 islas distintas, m�s una isla principal, en la que se empieza:
            Happiness Island //Aqu� se empieza
            Calamah Island
            Null Island
            Cucumber Island
            Bolsillodedoraimon Island
            Tritetua Island
            Staling Island

        Se podr� navegar por todo el mar, y se podr� andar por tierra. Podr�s encontrarte enemigos mientras andas
        por las islas, y podr�s pedirle quests a algunos NPCs

        Las batallas ser�n estilo Pokemon, con un men� de pelea, y donde se podr� ver la vida del enemigo, etc.

        Siendo un juego, necesitar� unos controles. Se har� mediante letras. El jugador tendr� que ir escribiendo las
        letras y pulsando el intro para ir movi�ndose, o haciendo las diferentes acciones. Estos son los controles:
            W, A, S, D ------> Moverse en diferentes direcciones
            E ---------------> Acci�n (hablar con NPCs, usar objeto, etc.)
            M ---------------> Men� In-Game
            I ---------------> Inventario

        El MIG (Men� In-Game) contendr� las siguientes opciones:
            Guardar partida
            Guardar y salir
            Cambiar dificultad
            Salir sin guardar

    Pseudoc�digo Generalizado:
        Inicio
            Repetir
                mostrarMP * //MP, Men� Principal
                Leer y validar opci�n MP
                Seg�n (opcionMP)
                    Caso '1':
                        Cargar partida
                    Caso '2':
                        Crear partida
                    Caso '3':
                        Borrar partida
                    Caso '0':
                        Salir
                Fin Seg�n
                Mientras (jugar)
                    MostrarMapa *
                    Leer y validar Letra de Control
                    Seg�n (letra de control) //Letras de control descritas en An�lisis
                        Caso 'W': MovimientoW *
                        Caso 'A': MovimientoA *
                        Caso 'S': MovimientoS *
                        Caso 'D': MovimientoD *
                        TODO Caso 'E': AccionRealizada *
                        Caso 'M': MostrarMenuJugador *
                        TODO Caso 'I': AbrirInventario *
                    Fin Seg�n
                Fin Mientras
            Mientras (opcionMP != '0')
        Fin


    Pseudoc�digo Espec�fico (MenuPartidasGuardadas)
        Inicio
            Abrir fichero de guardado para leer
            Leer partidas guardadas
            Mostrar en pantalla partidas guardadas
        Fin

    Pseudoc�digo Espec�fico (CrearPartidaNueva)
        Inicio
            Leer nombre de guardado
            Copiar fichero de partida nueva y nombrar //Copiar de "assets" y guardar copia en "savegames"
            Copiar fichero de partida para uso temporal //Copiar en "savegames" bajo el nombre de $~(nombre de guardado)
        Fin

    Pseudoc�digo Espec�fico (MostrarMapa)
        Inicio
            Abrir fichero de partida en uso para leer
            Leer car�cter de fichero
            Mientras (car�cter != -1)
                Imprimir car�cter en pantalla
                Leer car�cter de fichero
            Fin Mientras
        Fin

    Pseudoc�digo Espec�fico (Movimiento[WASD])
        Inicio
            Abrir fichero de partida en uso para escribir
            Mover Jugador
            Seg�n (car�cter al que se haya movido)
                TODO: Elegir qu� caracteres representar� cada cosa (agua, tierra, NPC, personaje, etc)
        Fin

    TODO Pseudoc�digo Espec�fico (AccionRealizada)
        Inicio
            Mirar casillas alrededor
            Si (hay algo que hacer)
                Seg�n (qu� hay alrededor)
                    TODO: Elegir qu� caracteres representar� cada cosa (agua, tierra, NPC, personaje, etc)
                Fin Seg�n
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
            //Leer y validar opci�n MP
            do
            {
                opcionMP = teclado.next().charAt(0);
                if(opcionMP < '0' ||opcionMP > '3')
                {
                    System.out.println("�Solo del 1 al 3, o 0 para salir!");
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
                            System.out.println("�Partida cargada con �xito!");
                            jugar = true;
                        } else {
                            System.out.println("�No se ha podido encontrar una partida con ese nombre!");
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
                            System.out.println("�Tu partida se ha borrado correctamente!");
                        else
                            System.out.println("La partida que has indicado no se ha encontrado");
                    }

                    jugar = false;
                    break;

                case '0': jugar = false; break;
            }

            //El juego en s�
            while(jugar)
            {
                gj.mostrarMapa(nombrePartidaCargada);

                gp.descargarPartida(nombrePartidaCargada);
                jugar = false;
            }

        }while(opcionMP != '0');
    }
}