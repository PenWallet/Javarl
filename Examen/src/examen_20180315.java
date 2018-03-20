/* Nombre del programa: examen_20180315
 * 
 * Análisis:
 * 	Programa que una empresa usará para conocer cuáles de sus candidatos son aptos para entrar en plantilla mediante
 * 	el uso de un test de 10 preguntas que, por cada pregunta correctamente respondida, añadirá un punto a su nota.
 *
 * 	La condición para poder entrar en plantilla es haber acertado correctamente los puntos 1, 2 y 3; haber hacertado al
 * 	menos dos de las preguntas 4, 5, 6 y 7; y haber acertado al menos una de las preguntas 8, 9 y 10
 *
 * 	En este programa se usarán estructuras de datos (arrays, en específico) y métodos de ordenación
 *
 * 	- Entradas:
 *      · Opcion
 *      · Nombre de los aspirantes
 *
 * 	- Salidas:
 *      · Menú por pantalla
 *      · Las diferentes listas de cada opción por pantalla
 *
 * 	- Restricciones:
 *      · El numero de candidatos debe estar entre 10 y 50
 *      · La opción deberá ser un número entre 0 y 3, inclusive
 * 
*/

/* Pseudocódigo Generalizado:
 * 	Inicio
 * 		GenerarCandidatos *
 * 		Repetir
 * 			MostrarMenu *
 * 			Leer y validar opcion
 * 			Según (opcion)
 * 				Caso 1: AspirantesOrdenadosNumero
 * 				Caso 2: AspirantesOrdenadosPuntuaciones
 * 				Caso 3: AspirantesDatosGenerales
 * 			Fin_segun
 * 		Mientras(opcion != 0)
 * 	Fin
 * 
*/

import java.io.*;
import java.util.*;

public class examen_20180315
{
	public static void main(String[] args)
	{
		//Declarar variables
		Scanner teclado = new Scanner(System.in);
		int numeroCandidatos = GestoraPlantilla.generarNumeroCandidatos();
		Test[] arrayCandidatos = new Test[numeroCandidatos];
		char opcion;
		int iMayorNota = 0;
		int iMenorNota = 0;
		float media = 0;
		int numeroAdmitidos = 0;

		//GenerarCandidatos
        System.out.println("Tenemos que introducir los nombres de los candidatos");
        System.out.println(numeroCandidatos+" candidatos han realizado la prueba");
        arrayCandidatos = GestoraPlantilla.generarCandidatos(numeroCandidatos);
        System.out.println("\n¡Gracias! Los datos de los candidatos han sido recogidos");
        System.out.println("\n\n");
        do
        {
          //Mostrar menú
          GestoraPlantilla.MostrarMenu();

          //Leer y validar opcion
          do
          {
              System.out.println("Elija una opción (Solo 1, 2, 3 o 0 para salir)");
              opcion = teclado.next().charAt(0);
              if(opcion < '0' || opcion > '3')
                  System.out.println("¡Solo 1, 2, 3 o 0 para salir!");
          }while(opcion < '0' || opcion > '3');

          switch (opcion)
          {
              case '1':
                  //AspirantesOrdenadosNumero
                  GestoraPlantilla.ordenarNumero(arrayCandidatos);
                  System.out.println("\nNOMBRE     NUMERO ASPIRANTE     PUNTUACION");
                  System.out.println("------     ----------------     ----------");
                  for(int i = 0; i < arrayCandidatos.length; i++)
                  {
                      System.out.println(arrayCandidatos[i].getNombre()+"       "+arrayCandidatos[i].getNumero()+"      "+arrayCandidatos[i].getPuntuacion());
                  }
                  break;

              case '2':
                  //AspirantesOrdenadosPuntuaciones
                  GestoraPlantilla.ordenarPuntuacion(arrayCandidatos);
                  System.out.println("\nNOMBRE        NUMERO ASPIRANTE        PUNTUACION");
                  System.out.println("------        ----------------        ----------");
                  for(int i = 0; i < arrayCandidatos.length; i++)
                  {
                      System.out.println(arrayCandidatos[i].getNombre()+"       "+arrayCandidatos[i].getNumero()+"      "+arrayCandidatos[i].getPuntuacion());
                  }
                  break;

              case '3':
                  //AspirantesDatosGenerales
                  GestoraPlantilla.ordenarPuntuacion(arrayCandidatos);
                  for(int i = 0; i < arrayCandidatos.length; i++)
                  {
                      if(arrayCandidatos[i].estaAprobado())
                          numeroAdmitidos++;
                  }
                  for(int i = 1; i < arrayCandidatos.length; i++)
                  {
                      if(arrayCandidatos[i].getPuntuacion() >= arrayCandidatos[iMayorNota].getPuntuacion())
                          iMayorNota = i;
                  }
                  for(int i = 1; i < arrayCandidatos.length; i++)
                  {
                      if(arrayCandidatos[i].getPuntuacion() <= arrayCandidatos[iMenorNota].getPuntuacion())
                          iMenorNota = i;
                  }
                  for(int i = 0; i < arrayCandidatos.length; i++)
                  {
                      media += arrayCandidatos[i].getPuntuacion();
                  }
                  media = media/numeroCandidatos;

                  System.out.println("Numero total admitidos..........."+numeroAdmitidos);
                  System.out.println(arrayCandidatos[iMayorNota].getNombre()+" puntuación........."+arrayCandidatos[iMayorNota].getPuntuacion());
                  System.out.println(arrayCandidatos[iMenorNota].getNombre()+" puntuación........."+arrayCandidatos[iMenorNota].getPuntuacion());
                  System.out.println("Media............................"+media);

                  break;
          }
        }while(opcion != '0');
	}
}

		
		
		
		
		
		
		
		
		
