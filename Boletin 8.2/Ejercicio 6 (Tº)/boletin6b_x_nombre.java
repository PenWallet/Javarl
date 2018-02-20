/* Nombre del programa: TemperaturaPorDia
 * 
 * An�lisis:
 * Es un mini programa para practicar arrays bidimensionales, en el que un array de 12x31 se cargar� aleatoriamente
 * de n�meros enteros, simulando la temperatura media que hizo cada d�a del mes
 * Tendremos que poder tener: La T� media de cada mes, el d�a m�s caluroso y el m�s fr�o del mes, el d�a m�s caluroso y m�s fr�o del a�o
 * 
 * Entrada:
 * - Opci�n como char
 * 
 * Salida:
 * - Dependiendo de la opci�n, lo ya explicado en el comentario
 * - 
 * 
*/

/* Pseudoc�digo Generalizado:
 * 	Declarar array[12][31]
 * 	Cargar array aleatoriamente
 * 	Repetir
 * 		Mostrar men� y leer y validar opcion
 * 		Seg�n (opcion)
 * 			Caso 1: Calcular T� media de cada mes y mostrar en pantalla
 * 			Caso 2: Calcular d�a m�s caluroso y m�s fr�o del mes y mostrar en pantalla
 * 			Caso 3: Calcular d�a m�s caluroso del a�o y mostrar en pantalla
 * 			Caso 4: Calcular d�a m�s fr�o edl a�o y mostrar en pantalla
 * 	Mientras(opcion != 0)
 * 
 * 
*/

import java.util.*;
import java.io.*;

public class boletin6b_x_nombre
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		char opcion;
		double media;
		double mayortmes;
		double menortmes;
		double mayortanyo;
		double menortanyo;
		
		//Declarar array
		int[][] array = new int[12][31];
		
		//Cargar array aleatoriamente
		for(int j = 0; j < 31; j++) { array[0][j] = random.nextInt(25)-10; }
		for(int j = 0; j < 28; j++) { array[1][j] = random.nextInt(25)-10; }
		for(int j = 0; j < 31; j++) { array[2][j] = random.nextInt(25)-3; }
		for(int j = 0; j < 30; j++) { array[3][j] = random.nextInt(25)-3; }
		for(int j = 0; j < 31; j++) { array[4][j] = random.nextInt(25)+5; }
		for(int j = 0; j < 30; j++) { array[5][j] = random.nextInt(25)+10; }
		for(int j = 0; j < 31; j++) { array[6][j] = random.nextInt(25)+15; }
		for(int j = 0; j < 31; j++) { array[7][j] = random.nextInt(25)+20; }
		for(int j = 0; j < 30; j++) { array[8][j] = random.nextInt(25)+15; }
		for(int j = 0; j < 31; j++) { array[9][j] = random.nextInt(25)+5; }
		for(int j = 0; j < 30; j++) { array[10][j] = random.nextInt(25); }
		for(int j = 0; j < 31; j++) { array[11][j] = random.nextInt(25)-5; }
		
		do
		{
			//Mostrar men� y leer y validar opci�n
			System.out.println("---------------------------------------------");
			System.out.println("|                    Men�                   |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|            1. T� media cada mes           |");
			System.out.println("|    2. D�a m�s y menos caluroso cada mes   |");
			System.out.println("|        3. D�a m�s caluroso cada a�o       |");
			System.out.println("|       4. D�a menos caluroso cada a�o      |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|                  0. Salir                 |");
			System.out.println("---------------------------------------------");
			
			do
			{
				System.out.println("Elige una opci�n");
				opcion = teclado.next().charAt(0);
				if(opcion < 0 || opcion > 4)
					System.out.println("�Opci�n incorrecta!");
			}while(opcion < 0 || opcion > 4);
			
			switch(opcion)
			{
				case '1':
					//T� media de cada mes y mostrar en pantalla
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en enero: "+media/31);
					for(int j = 0; j < 28; j++) { media += array[0][j] }
					System.out.println("T� media en febrero: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en marzo: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("T� media en abril: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en mayo: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("T� media en junio: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en julio: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en agosto: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("T� media en septiembre: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en octubre: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("T� media en noviembre: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("T� media en diciembre: "+media/31);
					break;
					
				case '2';
					for(mayortmes = array[0][0], int i = 0, j = 0; j < 31; j++)
					{
						if(array[i][j] > mayortmes)
							mayortmes = array[i][j]
					}
					for(int i = 0, j = 0, mayortmes = array[i][j]; j < 31; j++)
					{
						if(array[i][j] > mayortmes)
							mayortmes = array[i][j]
					}
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
