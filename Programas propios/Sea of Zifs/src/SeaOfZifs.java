import java.io.*;

/*
    Nombre del programa: Sea of Zifs
    Análisis:
        Este juego se basa en el reciente (20 marzo, 2018) juego de piratas, donde vas buscando tesoros por islas,
        donde te puedes encontrar a otros jugadores, atacarles, robarles, encontrarte con enemigos, etc.
        No se implementará la parte de encontrase a otros jugadores por falta de conocimientos, pero sí lo demás.

        El juego tendrá un mapa, con 6 islas distintas, más una isla principal, en la que se empiezan. Estos los nombres:
            Calamah Island
            Happiness Island //Aquí se empieza
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
            G ---------------> Guardar partida
            E ---------------> Acción (hablar con NPCs, usar objeto, etc.)
            M ---------------> Menú
            I ---------------> Inventario


    Pseudocódigo Generalizado:
        Inicio
            Repetir
                Repetir
                    MostrarMP * //MP, Menú Principal
                    Leer y validar opción MP
                    Según (opción MP)
                        Caso '1':
                            MostrarMPG * //MPG, Menú Partidas Guardadas
                            Leer y validar opción MPG
                        Caso '2':
                            CrearPartidaNueva *
                    Fin Según
                Mientras (opción no sea correcta)
                MostrarMapa *
                Leer y validar Letra de Control
                    Según (letra de control) //Letras de control descritas en Análisis
                        Caso 'W': MovimientoW *
                        Caso 'A': MovimientoA *
                        Caso 'S': MovimientoS *
                        Caso 'D': MovimientoD *
                        Caso 'G': GuardarPartida *
                        Caso 'E': AccionRealizada *
                        Caso 'M': MostrarMenuJugador *
                        Caso 'I': AbrirInventario *
                    Fin Según
            Mientras (opcion no sea salir)
        Fin


    Pseudocódigo Específico (MenuPartidasGuardadas)
        Inicio
            Abrir fichero de guardado para leer
            Leer partidas guardadas
            Mostrar en pantalla partidas guardadas
        Fin
 */

public class SeaOfZifs {
    public static void main(String[] args)
    {









    }
}