import java.io.*;

public class pruebaPantalla {
    public static void main(String[] args)
    {
        FileReader fr = null;
        BufferedReader br = null;
        String line;

        try
        {
            fr = new FileReader("assets\\cleanMap2.txt");
            br = new BufferedReader(fr);

            line = br.readLine();
            while(line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }

        }catch(Exception e){}



        /*
        for (int i = 0; i < 100; i++)
        {
            System.out.print("·········|");
        }
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i + 1);
        }

        //Resultado: 180 x 44

        //Nombre de las islas:
        /*
        Calamah Island
        Happiness Island //Aquí se empieza
        Null Island
        Cucumber Island
        Bolsillodedoraimon Island
        Tritetua Island
        Staling Island
         */
    }
}