/* Nombre del programa: examenoscar_20171214
 * 
 * An�lisis:
 * 
 * Comentario: 
 * Programa con varias opciones de men�, donde podremos elegir
 * entre hacer operaciones con fechas o pintar figuras geom�tricas
 * 
 * Calcular la semana del a�o y pintar cuadrado est�n en resguardo
 * De pintar cono no sabemos nada
 * 
 * Entradas:
 * - N�mero para elegir opci�n de men�
 * - Fechas
 * - Car�cter para pintar cuadrado
 * - N�mero para indicar los niveles del cuadrado
 * 
 * Salidas:
 * - Men� pintado en pantalla
 * - Fechas comparadas
 * - Fechas sumadas
 * - Cuadrado en pantalla
 * 
 * Requisitos:
 * - El n�mero para elegir opci�n ser� un n�mero entero entre 0 y 3
 * - Las fechas no pueden ser anteriores a 1582
 * - El car�cter debe ser imprimible
 * - El n�mero para indicar los niveles debe ser mayor a 0
*/

/* Pseudoc�digo Generalizado:
 * 	Inicio
 * 		MostrarMen� * y leer y validar opci�n1
 * 		Mientras (opcion1 sea distinto de 0)
 * 			Seg�n (opcion1)
 * 				caso 1:
 * 					MostrarMen�Fechas * y leer y validar opcion2
 * 					Mientras (opcion2 sea distinto de 0)
 * 						Seg�n (opcion2)
 * 							caso 1:
 * 								Leer y validar primera fecha (fechaCorrecta *)
 * 								Leer y validar segunda fecha (fechaCorrecta *)
 * 								comparaFechas *
 * 								Mostrar resultado de comparaFechas
 * 							caso 2:
 * 								Leer y validar fecha (fechaCorrecta *)
 * 								Leer y validar cantidad de tiempo a a�adir
 * 								addFecha *
 * 							caso 3:
 * 								En resguardo
 * 						Fin Seg�n
 * 						MostrarMen�Fechas * y leer y validar opcion2
 * 					Fin Mientras
 * 				caso 2:
 * 					MostrarMenuPintar * y leer y validar opcion3
 * 					Mientras (opcion3 sea distinto de 0)
 * 						Seg�n (opcion3)
 * 							caso 1: En resguardo
 * 							caso 2: En resguardo
 * 						Fin Seg�n
 * 						MostrarMen�Pintar * y leer y validar opcion3
 * 					Fin Mientras
 * 			Fin Seg�n
 * 			MostrarMen� * y leer y validar opci�n1
 * 		Fin Mientras
 * 	Fin
 * 	
 * 
 * 
*/

import java.util.Scanner;
import java.io.*;

public class examenoscar_20171214
{
	
	public static void main (String[] args) 
	{
		//Declarar variables
		Scanner teclado = new Scanner (System.in);
		
		char opcion1;
		char opcion2;
		char opcion3;
		
		int dia1;
		int dia2;
		int mes1;
		int mes2;
		int anyo1;
		int anyo2;
		
		byte comparacionFechas;
		
		boolean fechaEsCorrecta;
		
		//MostrarMen� * y leer y validar opci�n1
		do
		{
			Funciones.MostrarMenu();
			opcion1 = teclado.next().charAt(0);
			if (opcion1 < '0' || opcion1 > '2')
				System.out.println("�Solo 1, 2, o 0 para salir!");
		}while (opcion1 < '0' || opcion1 > '2');
		
		while (opcion1 != '0')
		{
			switch (opcion1)
			{
				case '1':
					//MostrarMen�Fechas * y leer y validar opcion2
					do
					{
						Funciones.MostrarMenuFechas();
						opcion2 = teclado.next().charAt(0);
						if (opcion2 < '0' || opcion2 > '3')
							System.out.println("�Solo 1, 2, 3, o 0 para salir!");
					}while (opcion2 < '0' || opcion2 > '3');
					
					while (opcion2 != '0')
					{
						switch (opcion2)
						{
							case '1':
								//Leer y validar primera fecha
								do
								{
									System.out.println("\nIntroduce el d�a de la primera fecha");
									dia1 = teclado.nextInt();
									System.out.println("Introduce el mes de la primera fecha");
									mes1 = teclado.nextInt();
									System.out.println("Introduce el a�o de la primera fecha");
									anyo1 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia1, mes1, anyo1);
									if(!fechaEsCorrecta)
										System.out.println("�Fecha incorrecta!");
								}while (!fechaEsCorrecta);
								
								//Leer y validar segunda fecha
								do
								{
									System.out.println("\nIntroduce el d�a de la segunda fecha");
									dia2 = teclado.nextInt();
									System.out.println("Introduce el mes de la segunda fecha");
									mes2 = teclado.nextInt();
									System.out.println("Introduce el a�o de la segunda fecha");
									anyo2 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia2, mes2, anyo2);
									if(!fechaEsCorrecta)
										System.out.println("�Fecha incorrecta!");
								}while (!fechaEsCorrecta);
								
								//comparaFechas *
								comparacionFechas = Funciones.comparaFecha(dia1, mes1, anyo1, dia2, mes2, anyo2);
								
								//Mostrar resultados
								switch(comparacionFechas)
								{
									case 1:
										System.out.println("El "+dia1+"/"+mes1+"/"+anyo1+" es anterior al "+dia2+"/"+mes2+"/"+anyo2);
									case 2:
										System.out.println("El "+dia1+"/"+mes1+"/"+anyo1+" es posterior al "+dia2+"/"+mes2+"/"+anyo2);
									case 0:
										System.out.println("El "+dia1+"/"+mes1+"/"+anyo1+" es igual al "+dia2+"/"+mes2+"/"+anyo2);
								}
								
								break;
							
							case '2':
								//Leer y validar fecha
								do
								{
									System.out.println("\nIntroduce el d�a de la primera fecha");
									dia1 = teclado.nextInt();
									System.out.println("Introduce el mes de la primera fecha");
									mes1 = teclado.nextInt();
									System.out.println("Introduce el a�o de la primera fecha");
									anyo1 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia1, mes1, anyo1);
									if(!fechaEsCorrecta)
										System.out.println("�Fecha incorrecta!");
								}while (!fechaEsCorrecta);
								
								//Leer y validar cantidad de tiempo a a�adir
								do
								{
									System.out.println("\nIntroduce cu�ntos d�as quieres a�adir");
									dia2 = teclado.nextInt();
									if (dia2 < 0)
										System.out.println("�Cantidad de d�as inv�lidos!");
								}while (dia2 < 0);
								
								do
								{
									System.out.println("\nIntroduce cu�ntos meses quieres a�adir");
									mes2 = teclado.nextInt();
									if (mes2 < 0)
										System.out.println("�Cantidad de meses inv�lidos!");
								}while (mes2 < 0);
								
								do
								{
									System.out.println("\nIntroduce cu�ntos a�os quieres a�adir");
									anyo2 = teclado.nextInt();
									if (anyo2 < 0)
										System.out.println("�Cantidad de a�os inv�lidos!");
								}while (anyo2 < 0);
								
								//En resguardo
								
								
								break;
								
							case '3':
								System.out.println("En resguardo");
								
								break;
						}
						
						//MostrarMen�Fechas * y leer y validar opcion2
						do
						{
							Funciones.MostrarMenuFechas();
							opcion2 = teclado.next().charAt(0);
							if (opcion2 < '0' || opcion2 > '3')
								System.out.println("�Solo 1, 2, 3, o 0 para salir!");
						}while (opcion2 < '0' || opcion2 > '3');
					}
					
					break;
					
				case '2':
					//MostrarMenuPintar * y leer y validar opcion3
					do
					{
						Funciones.MostrarMenuPintar();
						opcion3 = teclado.next().charAt(0);
						if (opcion3 < '0' || opcion3 > '2')
							System.out.println("�Solo 1, 2, o 0 para salir!");
					}while (opcion3 < '0' || opcion3 > '2');
					
					while(opcion3 != '0')
					{
						switch (opcion3)
						{
							case '1':
								Funciones.pintarCuadrado('A', 1);
								break;
								
							case '2':
								System.out.println("En construcci�n");
								break;
						}
						
						do
						{
							Funciones.MostrarMenuPintar();
							opcion3 = teclado.next().charAt(0);
							if (opcion3 < '0' || opcion3 > '2')
								System.out.println("�Solo 1, 2, o 0 para salir!");
						}while (opcion3 < '0' || opcion3 > '2');
					}
					
					break;
			}
			do
			{
				Funciones.MostrarMenu();
				opcion1 = teclado.next().charAt(0);
				if (opcion1 < '0' || opcion1 > '2')
					System.out.println("�Solo 1, 2, o 0 para salir!");
			}while (opcion1 < '0' || opcion1 > '2');
		}
	}				
}
