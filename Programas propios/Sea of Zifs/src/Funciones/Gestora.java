package Funciones;

import java.io.*;

public class Gestora {
    public static void MostrarMP()
    {
        System.out.println("-----------------------------");
        System.out.println("|           Menú            |");
        System.out.println("|---------------------------|");
        System.out.println("|     1. Cargar Partida     |");
        System.out.println("|     2. Nueva Partida      |");
        System.out.println("|---------------------------|");
        System.out.println("|         0. Salir          |");
        System.out.println("-----------------------------");
    }

    public static void MostrarMPG()
    {
        System.out.println("En resguardo");
    }

    public static void crearPartidaNueva(String nombre)
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

            line = br.readLine();
        }catch(IOException e) { System.out.println("Error al abrir el stream"); }

        while(line != null)
        {
            try
            {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }catch(IOException e) { System.out.println("Error al leer/escribir"); }
        }

        try
        {
            bw.close();
            br.close();
            fw.close();
            fr.close();
        }catch(IOException e) { System.out.println("Error al cerrar el stream"); }
    }



}
