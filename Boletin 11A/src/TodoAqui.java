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
    EJERCICIO 5.- Dise�a un programa para realizar unas estad�sticas respecto a ficheros de texto.
    La ruta de un fichero de texto ser� pasada desde la l�nea de comando y queremos un listado en pantalla con el
    n�mero de palabras de ese fichero, el n�mero de p�rrafos, el n�mero de caracteres, la media de caracteres por
    palabra y la media de palabras por p�rrafo.
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

            System.out.println("N�mero de palabras: "+nPalabras);
            System.out.println("N�mero de parrafos: "+nParrafos);
            System.out.println("N�mero de caracteres: "+nCaracteres);
            System.out.println("Media de caracteres/palabra: "+(float)(nCaracteres/nPalabras));
            System.out.println("Media de palabras/parrafo: "+(float)(nPalabras/nParrafos));


        }catch(IOException e){System.out.println("�Archivo no encontrado!");}
    }


}
