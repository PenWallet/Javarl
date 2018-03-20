import java.util.Scanner;
import java.io.*;

public class TestTest {

	public static void main(String[] args)
	{
		//Prueba de los constructores
        //El constructor con parámetros ya está testeado en CondGestoraPlantilla al usar GestoraPlantilla.generarCandidatos
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test(t1);
        Test t4 = new Test(t2);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());

        //Prueba de los getters
        System.out.println(t1.getPuntuacion());
        System.out.println(t2.getPuntuacion());
        System.out.println(t3.getPuntuacion());
        System.out.println(t4.getPuntuacion());

        System.out.println(t1.getNombre());
        System.out.println(t2.getNombre());
        System.out.println(t3.getNombre());
        System.out.println(t4.getNombre());

        System.out.println(t1.getNumero());
        System.out.println(t2.getNumero());
        System.out.println(t3.getNumero());
        System.out.println(t4.getNumero());

        //Prueba de los setters
        t1.setNombre("jahdasd");
        t2.setNombre("ad");
        t3.setNombre("dhfh");
        t4.setNombre("asdt");
        System.out.println(t1.getNombre());
        System.out.println(t2.getNombre());
        System.out.println(t3.getNombre());
        System.out.println(t4.getNombre());

	}

}

		
		
		
		
		
		
		
		
		
