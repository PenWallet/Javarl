package Funciones;

import java.io.*;

public class GestoraPartidas {

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
        }catch(IOException e) { System.out.println("Error al abrir el stream"); }

        try
        {
            line = br.readLine();

            while(line != null)
            {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
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
}
