import java.io.*;
import Clases.*;

/*
    Nombre del programa: Sea of Zifs
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
                Repetir
                    MostrarMP * //MP, Men� Principal
                    Leer y validar opci�n MP
                    Seg�n (opci�n MP)
                        Caso '1':
                            MostrarMPG * //MPG, Men� Partidas Guardadas
                            Leer y validar opci�n MPG
                            Fin Si
                        Caso '2':
                            CrearPartidaNueva *
                    Fin Seg�n
                Mientras (opci�n no sea correcta)
                Mientras (opci�n no sea salir de la partida)
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
            Mientras (opcion no sea salir del juego)
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

public class SeaOfZifs {
    public static void main(String[] args)
    {



    }
}