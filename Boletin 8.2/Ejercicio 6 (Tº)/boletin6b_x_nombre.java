/* Nombre del programa: TemperaturaPorDia
 * 
 * Análisis:
 * Es un mini programa para practicar arrays bidimensionales, en el que un array de 12x31 se cargará aleatoriamente
 * de números enteros, simulando la temperatura media que hizo cada día del mes
 * Tendremos que poder tener: La Tº media de cada mes, el día más caluroso y el más frío del mes, el día más caluroso y más frío del año
 * 
 * Entrada:
 * - Opción como char
 * 
 * Salida:
 * - Dependiendo de la opción, lo ya explicado en el comentario
 * - 
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Declarar array[12][31]
 * 	Cargar array aleatoriamente
 * 	Repetir
 * 		Mostrar menú y leer y validar opcion
 * 		Según (opcion)
 * 			Caso 1: Calcular Tº media de cada mes y mostrar en pantalla
 * 			Caso 2: Calcular día más caluroso y más frío del mes y mostrar en pantalla
 * 			Caso 3: Calcular día más caluroso del año y mostrar en pantalla
 * 			Caso 4: Calcular día más frío edl año y mostrar en pantalla
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
			//Mostrar menú y leer y validar opción
			System.out.println("---------------------------------------------");
			System.out.println("|                    Menú                   |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|            1. Tº media cada mes           |");
			System.out.println("|    2. Día más y menos caluroso cada mes   |");
			System.out.println("|        3. Día más caluroso cada año       |");
			System.out.println("|       4. Día menos caluroso cada año      |");
			System.out.println("|-------------------------------------------|");
			System.out.println("|                  0. Salir                 |");
			System.out.println("---------------------------------------------");
			
			do
			{
				System.out.println("Elige una opción");
				opcion = teclado.next().charAt(0);
				if(opcion < 0 || opcion > 4)
					System.out.println("¡Opción incorrecta!");
			}while(opcion < 0 || opcion > 4);
			
			switch(opcion)
			{
				case '1':
					//Tº media de cada mes y mostrar en pantalla
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en enero: "+media/31);
					for(int j = 0; j < 28; j++) { media += array[0][j] }
					System.out.println("Tº media en febrero: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en marzo: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("Tº media en abril: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en mayo: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("Tº media en junio: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en julio: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en agosto: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("Tº media en septiembre: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en octubre: "+media/31);
					for(int j = 0; j < 30; j++) { media += array[0][j] }
					System.out.println("Tº media en noviembre: "+media/31);
					for(int j = 0; j < 31; j++) { media += array[0][j] }
					System.out.println("Tº media en diciembre: "+media/31);
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
		
		
		
		
		
		
		
		
		
		
		
		
