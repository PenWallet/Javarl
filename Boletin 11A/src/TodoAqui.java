import java.io.*;

public class TodoAqui
{
    public static void main (String[] args)
    {
        ej1Listado();
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

    public static void ej5Estadisticas(String ruta)
    {
        File fichero;
        int nPalabras = 0, nParrafos = 0, nCaracteres = 0, mCaracteres = 0, mPalabras = 0;

        try
        {
            fichero = new
        }
    }


}
