import java.io.*;

/*
    Nombre del programa: Sea of Zifs
    An�lisis:
        Este juego se basa en el reciente (20 marzo, 2018) juego de piratas, donde vas buscando tesoros por islas,
        donde te puedes encontrar a otros jugadores, atacarles, robarles, encontrarte con enemigos, etc.
        No se implementar� la parte de encontrase a otros jugadores por falta de conocimientos, pero s� lo dem�s.

        El juego tendr� un mapa, con 6 islas distintas, m�s una isla principal, en la que se empiezan. Estos los nombres:
            Calamah Island
            Happiness Island //Aqu� se empieza
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
            G ---------------> Guardar partida
            E ---------------> Acci�n (hablar con NPCs, usar objeto, etc.)
            M ---------------> Men�
            I ---------------> Inventario


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
                        Caso '2':
                            CrearPartidaNueva *
                    Fin Seg�n
                Mientras (opci�n no sea correcta)
                MostrarMapa *
                Leer y validar Letra de Control
                    Seg�n (letra de control) //Letras de control descritas en An�lisis
                        Caso 'W': MovimientoW *
                        Caso 'A': MovimientoA *
                        Caso 'S': MovimientoS *
                        Caso 'D': MovimientoD *
                        Caso 'G': GuardarPartida *
                        Caso 'E': AccionRealizada *
                        Caso 'M': MostrarMenuJugador *
                        Caso 'I': AbrirInventario *
                    Fin Seg�n
            Mientras (opcion no sea salir)
        Fin


    Pseudoc�digo Espec�fico (MenuPartidasGuardadas)
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