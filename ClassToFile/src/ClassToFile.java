import java.io.*;

public class ClassToFile
{
    public static void main (String[] args)
    {
        Persona p1 = null;
        Persona p2 = null;
        Persona p3 = null;

        try
        {
            p1 = new Persona("Oscar", 18, "77937080Q", 'H', 100,180);
            p2 = new Persona();
            p3 = new Persona("Alguien",26,"54198751H",'M',80,190);
        }catch (PersonaException e) { System.out.println("¡No se han creado los objetos!"); }



        //Abrimos el stream de escritura de caracteres
        FileWriter fw = null;

        try {
            fw = new FileWriter("assets/clases.txt", true);
        } catch (IOException e) {}

        BufferedWriter bw = new BufferedWriter(fw);


        //Escribimos los toString en el documento
        try {
            bw.write(p1.toString()); bw.newLine();
            bw.write(p2.toString()); bw.newLine();
            bw.write(p3.toString()); bw.newLine();
        } catch (IOException e) {}

        try {
            bw.close();
            fw.close();
        } catch (IOException e) {}



        //PARTE DE LEER LOS DATOS
        //Abrimos el stream de lectura de caracteres
        FileReader fr = null;

        try {
            fr = new FileReader("assets/clases.txt");
        } catch (FileNotFoundException e) {}

        BufferedReader bw = new BufferedReader(fr);

        //Variables para crear la clase
        String nombre;
        int edad;
        String dni;
        char sexo;
        double peso;
        int altura;
        int c = 0;
        Persona p4 = null;
        Persona p5 = null;
        Persona p6 = null;

        //Leemos
        try {
            //Leemos la primera línea
            String[] atr = null;
            String s = bw.readLine();

            while(s != null)
            {
                atr = s.split(",");

                /*Sé que mi toString se divide de la siguiente forma:
                    1. Nombre: String
                    2. Edad: Int
                    3. DNI: String
                    4. Sexo: Char
                    5. Peso: Double
                    6. Altura: Int
                */

                nombre = atr[0];
                edad = Integer.parseInt(atr[1]);
                dni = atr[2];
                sexo = atr[3].charAt(0);
                peso = Double.parseDouble(atr[4]);
                altura = Integer.parseInt(atr[5]);





            }


        } catch (IOException e) {}


    }
}
