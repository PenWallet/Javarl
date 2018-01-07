public class CondFechaCorrecta
{
	public static void main (String[] args) 
	{
		System.out.println(Funciones.fechaCorrecta(31, 2, 1999));
		System.out.println(Funciones.fechaCorrecta(-1, 4, 1600));
		System.out.println(Funciones.fechaCorrecta(1, 1, 800));
		System.out.println(Funciones.fechaCorrecta(1, 12, 1999));
		System.out.println(Funciones.fechaCorrecta(29, 2, 1600));
		System.out.println(Funciones.fechaCorrecta(28, 2, 1599));
		System.out.println(Funciones.fechaCorrecta(16, 8, 1999));
	}
}
		
		
		
		
		
		
		
		
		
