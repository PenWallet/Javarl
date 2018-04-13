import java.io.*;
import java.util.*;

public class TodoAqui
{
    public static void main (String[] args)
    {
        System.out.println("*************EJERCICIO 1*************");

        ej1Listado();

        System.out.println("\n*************EJERCICIO 2*************");

        Scanner teclado = new Scanner(System.in);
        String path = teclado.nextLine();
        ej5Estadisticas(path);
    }

    public static void ej1Listado()
    {
        File archivo;
        String[] listado;

        try
        {
            archivo = new File("C:\\Users\\ofunes\\Desktop\\DAM\\Javarl\\Boletin 11A\\assets");

            listado = archivo.list();


        for(int i = 0; i < listado.length; i++)
        {
            System.out.println(listado[i]);
        }

        }catch(Exception e) {System.out.println("Error");}
    }


    /*
    EJERCICIO 5.- Diseña un programa para realizar unas estadísticas respecto a ficheros de texto.
    La ruta de un fichero de texto será pasada desde la línea de comando y queremos un listado en pantalla con el
    número de palabras de ese fichero, el número de párrafos, el número de caracteres, la media de caracteres por
    palabra y la media de palabras por párrafo.
     */

    public static void ej5Estadisticas(String ruta)
    {
        FileReader fichero;
        BufferedReader ficheroR;
        int nPalabras = 0, nParrafos = 0, nCaracteres = 0;
        String[] palabras;
        String parrafo;
        int caracterInt;

        try
        {
            fichero = new FileReader(ruta);
            ficheroR = new BufferedReader(fichero);

            parrafo = ficheroR.readLine();
            while(parrafo != null)
            {
                nParrafos++;

                palabras = parrafo.split(" ");
                nPalabras += palabras.length;

            }

            caracterInt = ficheroR.read();
            while(caracterInt != -1)
            {
                caracterInt = (char)caracterInt;
                nCaracteres++;
            }

            System.out.println("Número de palabras: "+nPalabras);
            System.out.println("Número de parrafos: "+nParrafos);
            System.out.println("Número de caracteres: "+nCaracteres);
            System.out.println("Media de caracteres/palabra: "+(float)(nCaracteres/nPalabras));
            System.out.println("Media de palabras/parrafo: "+(float)(nPalabras/nParrafos));


        }catch(IOException e){System.out.println("¡Archivo no encontrado!");}
    }


}
