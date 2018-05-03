package Funciones;

import java.io.*;
import java.util.Scanner;

public class GestoraPartidas {

    public void mostrarMPG()
    {
        String[] array;

        File directory = new File("savegames");
        array = directory.list();

        if(array.length == 0)
            System.out.println("¡No hay partidas guardadas!");
        else
        {
            System.out.println("Partidas guardadas:");
            for(int i = 0; i < array.length; i++)
            {
                System.out.println((i+1)+". "+array[i]);
            }
        }
    }

    public void crearPartidaNueva(String nombre)
    {
        String destino = "savegames\\"+nombre;

        File filePath = null;
        File file = null;
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;


        String line = null;

        try
        {
            filePath = new File(destino);
            filePath.mkdirs();

            file = new File(destino, "mapa.txt");

            fr = new FileReader("assets\\cleanMap.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
        }catch(IOException e) { System.out.println("Error al abrir el stream"); }

        try
        {
            line = br.readLine();

            while(line != null)
            {
                bw.write(line);
                line = br.readLine();
                if(line != null)
                    bw.newLine();
            }


        }catch(IOException e) { System.out.println("Error al leer/escribir"); }
        finally
        {
            try
            {
                bw.close();
                br.close();
                fw.close();
                fr.close();
            }catch(IOException e) { System.out.println("Error al cerrar el stream"); }
        }
    }

    /*  Interfaz:
            Comentario:
               	Procedimiento que se encargará de todo el proceso de borrar una partida
            Cabecera:
                void borrarPartida()
            Precondiciones:

            Entradas:

            Salida:

            E/S:

            Postcondiciones:

    */
    public void borrarPartida()
    {
        boolean deleted = true;
        File partidas = new File("savegames");
        String[] array = partidas.list();
        Scanner teclado = new Scanner(System.in);

        if(array.length != 0)
        {
            do
            {
                mostrarMPG();
                System.out.println("Escribe el nombre de la partida que quieres borrar:");
            }while();


        }
    }

}
