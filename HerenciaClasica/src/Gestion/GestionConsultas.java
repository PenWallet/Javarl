package Gestion;
import Clases.*;
import java.io.*;

/**
 * Clase gestionadora para las consultas de "Ver X"
 */
public class GestionConsultas {

    /**
     * Procedimiento para mostrar en pantalla todas las películas disponibles para alquilar
     */
    public void mostrarPeliculas()
    {
        File file = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Pelicula pelicula = null;

        try
        {
            file = new File("assets\\Peliculas.dat");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
        }catch(FileNotFoundException e) { System.out.println("Error al abrir el archivo. No encontrado"); }
        catch(IOException e2) { System.out.println("Error al abrir el stream"); }

        //pelicula = ois.readObject();
    }



}
