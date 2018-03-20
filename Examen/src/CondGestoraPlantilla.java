public class CondGestoraPlantilla
{
	public static void main (String[] args)
	{
		int numero;
		boolean[] array1 = new boolean[10];
		boolean[] array2 = new boolean[10];
		boolean[] array3 = new boolean[10];

		//Prueba simple del menú
		GestoraPlantilla.MostrarMenu();

		//Prueba de generarNumeroCandidatos
		//Nos aseguramos que tiene límite en 10 y 50
		do
		{
			numero = GestoraPlantilla.generarNumeroCandidatos();
			System.out.println(numero);
			if(numero == 10)
				System.out.println("¡¡Fin del bucle!! Ha encontrado un 10");
		}while (numero != 10);

		do
		{
			numero = GestoraPlantilla.generarNumeroCandidatos();
			System.out.println(numero);
			if(numero == 50)
				System.out.println("¡¡Fin del bucle!! Ha encontrado un 50");
		}while (numero != 50);

		//Probamos el generador de array de puntuaciones
		array1 = GestoraPlantilla.generarArrayPuntuaciones();
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("Array 1, boolean nº " + (i + 1) + ": " + array1[i]);
		}
		System.out.println("\n\n");
		array2 = GestoraPlantilla.generarArrayPuntuaciones();
		for(int i = 0; i < array2.length; i++)
		{
			System.out.println("Array 2, boolean nº " + (i + 1) + ": " + array2[i]);
		}
		System.out.println("\n\n");
		array3 = GestoraPlantilla.generarArrayPuntuaciones();
		for(int i = 0; i < array3.length; i++)
		{
			System.out.println("Array 3, boolean nº " + (i + 1) + ": " + array3[i]);
		}

		//Prueba de generarCandidatos
		System.out.println("\n\nHabrá 10 candidatos");
		Test[] arrayCandidatos = new Test[10];
		arrayCandidatos = GestoraPlantilla.generarCandidatos(10);
		boolean[] arrayNotas = new boolean[10];


		for(int i = 0; i < array1.length; i++)
		{
			arrayNotas = arrayCandidatos[i].getCalificaciones();
			System.out.println("Nombre: "+arrayCandidatos[i].getNombre()+", Numero: "+arrayCandidatos[i].getNumero()+"\n");
			for(int j = 0; j < arrayNotas.length; j++)
			{
				System.out.println("Respuesta "+(j+1)+": "+arrayNotas[j]);
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
