import java.io.*;

public class Prueba
{
    public static void main(String[] args) throws Exception
    {
       //FileReader
        int c; //Variable que almacena el c�digo ASCII que lee
        char cC; //Variable que almacena el car�cter ya casteado

        /*
            Metemos en un try catch, ya que el constructor lanza FileNotFoundException
            Adem�s, read() lanza IOException, y como FileNotFoundException hereda de IOException, podemos poner solo IOException
            en el bloque try - catch
        */
        try
        {
            //Instanciamos el FileReader
            FileReader r2 = new FileReader("C:\\Users\\Oscar\\Desktop\\DAM\\Javarl\\FileReader y FileWriter\\assets\\prueba.txt");
            do
            {
                //Leemos el primer car�cter
                c = r2.read();
                //Cuando read() llega al FF, devuelve -1, as� que nos aseguramos de que no es -1 para pintarlo en pantalla
                if(c != -1)
                {
                    //Un simple casteo
                    cC = (char) c;
                    System.out.print(cC);
                }
            }while(c != -1); //Y lo repetimos todo mientras que no lleguemos al FF
        }catch(IOException e){System.out.println("Archivo no encontrado");};




        //FileWriter
        FileWriter w1 = new FileWriter("C:\\Users\\Oscar\\Desktop\\DAM\\Javarl\\FileReader y FileWriter\\assets\\prueba2.txt", true); //El true del final indica que vamos a seguir escribiendo despu�s de lo que ya hay escrito dentro
        w1.write("\nBuenas tardes, compa�eros"); //Comando para escribir
        w1.flush(); //IMPORTANTE: Esto escribe lo que hay en el buffer (memoria intermedia)

        //Probamos a leer qu� hay
        try
        {
            FileReader r3 = new FileReader("C:\\Users\\Oscar\\Desktop\\DAM\\Javarl\\FileReader y FileWriter\\assets\\prueba2.txt");
            do
            {
                c = r3.read();
                if(c != -1)
                {
                    cC = (char) c;
                    System.out.print(cC);
                }
            }while(c != -1);
        }catch(IOException e){System.out.println("Archivo no encontrado");}
    }
}
