import java.io.*;
import java.util.*;

public class pruebaCleanMap {
    public static void main (String[] args)
    {
       FileWriter fw = null;
       BufferedWriter bw = null;

       try
       {
           fw = new FileWriter("assets\\cleanMap.txt");
           bw = new BufferedWriter(fw);
       }catch(Exception e) { System.out.println("Error al abrir el stream"); }

       try
       {
           for(int cont = 0; cont < 44; cont++)
           {
               for(int i = 0; i < 180; i++)
               {
                   bw.write("~");
               }

               bw.newLine();
           }

           bw.close();
           fw.close();
       }catch(Exception e) { System.out.println("Error al escribir"); }



    }
}
