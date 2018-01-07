/* Nombre del programa: examenoscar_20171214
 * 
 * Análisis:
 * 
 * Comentario: 
 * Programa con varias opciones de menú, donde podremos elegir
 * entre hacer operaciones con fechas o pintar figuras geométricas
 * 
 * Calcular la semana del año y pintar cuadrado están en resguardo
 * De pintar cono no sabemos nada
 * 
 * Entradas:
 * - Número para elegir opción de menú
 * - Fechas
 * - Carácter para pintar cuadrado
 * - Número para indicar los niveles del cuadrado
 * 
 * Salidas:
 * - Menú pintado en pantalla
 * - Fechas comparadas
 * - Fechas sumadas
 * - Cuadrado en pantalla
 * 
 * Requisitos:
 * - El número para elegir opción será un número entero entre 0 y 3
 * - Las fechas no pueden ser anteriores a 1582
 * - El carácter debe ser imprimible
 * - El número para indicar los niveles debe ser mayor a 0
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		MostrarMenú * y leer y validar opción1
 * 		Mientras (opcion1 sea distinto de 0)
 * 			Según (opcion1)
 * 				caso 1:
 * 					MostrarMenúFechas * y leer y validar opcion2
 * 					Mientras (opcion2 sea distinto de 0)
 * 						Según (opcion2)
 * 							caso 1:
 * 								Leer y validar primera fecha (fechaCorrecta *)
 * 								Leer y validar segunda fecha (fechaCorrecta *)
 * 								comparaFechas *
 * 								Mostrar resultado de comparaFechas
 * 							caso 2:
 * 								Leer y validar fecha (fechaCorrecta *)
 * 								Leer y validar cantidad de tiempo a añadir
 * 								addFecha *
 * 							caso 3:
 * 								En resguardo
 * 						Fin Según
 * 						MostrarMenúFechas * y leer y validar opcion2
 * 					Fin Mientras
 * 				caso 2:
 * 					MostrarMenuPintar * y leer y validar opcion3
 * 					Mientras (opcion3 sea distinto de 0)
 * 						Según (opcion3)
 * 							caso 1: En resguardo
 * 							caso 2: En resguardo
 * 						Fin Según
 * 						MostrarMenúPintar * y leer y validar opcion3
 * 					Fin Mientras
 * 			Fin Según
 * 			MostrarMenú * y leer y validar opción1
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
		
		//MostrarMenú * y leer y validar opción1
		do
		{
			Funciones.MostrarMenu();
			opcion1 = teclado.next().charAt(0);
			if (opcion1 < '0' || opcion1 > '2')
				System.out.println("¡Solo 1, 2, o 0 para salir!");
		}while (opcion1 < '0' || opcion1 > '2');
		
		while (opcion1 != '0')
		{
			switch (opcion1)
			{
				case '1':
					//MostrarMenúFechas * y leer y validar opcion2
					do
					{
						Funciones.MostrarMenuFechas();
						opcion2 = teclado.next().charAt(0);
						if (opcion2 < '0' || opcion2 > '3')
							System.out.println("¡Solo 1, 2, 3, o 0 para salir!");
					}while (opcion2 < '0' || opcion2 > '3');
					
					while (opcion2 != '0')
					{
						switch (opcion2)
						{
							case '1':
								//Leer y validar primera fecha
								do
								{
									System.out.println("\nIntroduce el día de la primera fecha");
									dia1 = teclado.nextInt();
									System.out.println("Introduce el mes de la primera fecha");
									mes1 = teclado.nextInt();
									System.out.println("Introduce el año de la primera fecha");
									anyo1 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia1, mes1, anyo1);
									if(!fechaEsCorrecta)
										System.out.println("¡Fecha incorrecta!");
								}while (!fechaEsCorrecta);
								
								//Leer y validar segunda fecha
								do
								{
									System.out.println("\nIntroduce el día de la segunda fecha");
									dia2 = teclado.nextInt();
									System.out.println("Introduce el mes de la segunda fecha");
									mes2 = teclado.nextInt();
									System.out.println("Introduce el año de la segunda fecha");
									anyo2 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia2, mes2, anyo2);
									if(!fechaEsCorrecta)
										System.out.println("¡Fecha incorrecta!");
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
									System.out.println("\nIntroduce el día de la primera fecha");
									dia1 = teclado.nextInt();
									System.out.println("Introduce el mes de la primera fecha");
									mes1 = teclado.nextInt();
									System.out.println("Introduce el año de la primera fecha");
									anyo1 = teclado.nextInt();
									fechaEsCorrecta = Funciones.fechaCorrecta(dia1, mes1, anyo1);
									if(!fechaEsCorrecta)
										System.out.println("¡Fecha incorrecta!");
								}while (!fechaEsCorrecta);
								
								//Leer y validar cantidad de tiempo a añadir
								do
								{
									System.out.println("\nIntroduce cuántos días quieres añadir");
									dia2 = teclado.nextInt();
									if (dia2 < 0)
										System.out.println("¡Cantidad de días inválidos!");
								}while (dia2 < 0);
								
								do
								{
									System.out.println("\nIntroduce cuántos meses quieres añadir");
									mes2 = teclado.nextInt();
									if (mes2 < 0)
										System.out.println("¡Cantidad de meses inválidos!");
								}while (mes2 < 0);
								
								do
								{
									System.out.println("\nIntroduce cuántos años quieres añadir");
									anyo2 = teclado.nextInt();
									if (anyo2 < 0)
										System.out.println("¡Cantidad de años inválidos!");
								}while (anyo2 < 0);
								
								//En resguardo
								
								
								break;
								
							case '3':
								System.out.println("En resguardo");
								
								break;
						}
						
						//MostrarMenúFechas * y leer y validar opcion2
						do
						{
							Funciones.MostrarMenuFechas();
							opcion2 = teclado.next().charAt(0);
							if (opcion2 < '0' || opcion2 > '3')
								System.out.println("¡Solo 1, 2, 3, o 0 para salir!");
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
							System.out.println("¡Solo 1, 2, o 0 para salir!");
					}while (opcion3 < '0' || opcion3 > '2');
					
					while(opcion3 != '0')
					{
						switch (opcion3)
						{
							case '1':
								Funciones.pintarCuadrado('A', 1);
								break;
								
							case '2':
								System.out.println("En construcción");
								break;
						}
						
						do
						{
							Funciones.MostrarMenuPintar();
							opcion3 = teclado.next().charAt(0);
							if (opcion3 < '0' || opcion3 > '2')
								System.out.println("¡Solo 1, 2, o 0 para salir!");
						}while (opcion3 < '0' || opcion3 > '2');
					}
					
					break;
			}
			do
			{
				Funciones.MostrarMenu();
				opcion1 = teclado.next().charAt(0);
				if (opcion1 < '0' || opcion1 > '2')
					System.out.println("¡Solo 1, 2, o 0 para salir!");
			}while (opcion1 < '0' || opcion1 > '2');
		}
	}				
}
