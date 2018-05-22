package Gestoras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestoraJuego {

    /**
     * Función que muestra el mapa actualizado de la partida en pantalla
     *
     * @param nombre Nombre de la partida que está siendo usada
     */

    public void mostrarMapa (String nombre)
    {
        FileReader fr = null;
        BufferedReader br = null;
        String line;

        try
        {
            fr = new FileReader("savegames\\"+nombre+"\\mapaTemp.txt");
            br = new BufferedReader(fr);

            line = br.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }

        }catch(IOException e) { System.out.println("¡Error al leer del fichero!"); }
    }
}
