package Funciones;

import java.io.*;

public class GestoraPartidas {

    /**
     * Muestra el Menú de Personajes Guardados
     *
     * @return String[] con los nombres de todas las partidas guardadas
     */

    public String[] mostrarMPG()
    {
        String[] array;

        File directory = new File("savegames");
        array = directory.list();

        if(array.length == 0)
            System.out.println("¡No hay partidas guardadas!");
        else
        {
            for(int i = 0; i < array.length; i++)
            {
                System.out.println((i+1)+". "+array[i]);
            }
        }

        return(array);
    }

    /**
     * Crea una partida nueva con el nombre que se le pase en el parámetro de entrada
     *
     * @param nombre Nombre de la partida a crear
     */

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

    /**
     * Borra la partida que se le indique mediante el parámetro de entrada
     *
     * @param partida Nombre de la partida a borrar
     * @return true si se ha borrado la partida, false si no se ha borrado y/o no se ha encontrado
     */

    public boolean borrarPartida(String partida)
    {
        boolean deleted = false;
        File partidas = new File("savegames");
        String[] array = partidas.list();

        for(int i = 0; i < array.length && !deleted; i++)
        {
            if(array[i].equals(partida))
            {
                File mapa = new File("savegames\\"+partida+"\\mapa.txt");
                File carpeta = new File("savegames\\"+partida);
                mapa.delete();
                carpeta.delete();
                deleted = true;
            }
        }
        return(deleted);
    }

    /**
     * Carga la partida mediante la creación de un archivo en el que se irán guardando los cambios temporalmente
     *
     * @param partida El nombre de la partida (que debe existir)
     */

    public void cargarPartida(String partida)
    {
        FileReader fr = null;
        BufferedReader br = null;

        FileWriter fw = null;
        BufferedWriter bw = null;

        String line;

        try
        {
            fr = new FileReader("savegames\\"+partida+"\\mapa.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter("savegames\\"+partida+"\\mapaTemp.txt");
            bw = new BufferedWriter(fw);
        }catch(IOException e) { System.out.println("¡Error al abrir el stream!"); }


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

    /**
     * Descarga la partida, guardando los cambios hechos en el archivo temporal creado en 'cargarPartida' al archivo real,
     * y borrando el temporal
     *
     * @param partida El nombre de la partida (que debe existir)
     */

    public void descargarPartida(String partida)
    {
        FileReader fr = null;
        BufferedReader br = null;

        FileWriter fw = null;
        BufferedWriter bw = null;

        String line;

        try
        {
            fr = new FileReader("savegames\\"+partida+"\\mapaTemp.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter("savegames\\"+partida+"\\mapa.txt");
            bw = new BufferedWriter(fw);
        }catch(IOException e) { System.out.println("¡Error al abrir el stream!"); }

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
}
