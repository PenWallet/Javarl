import java.io.*;

public class CondBuscaminasFunction
{
	
	public static void main(String[] args)
	{
		Casilla[][] Grid = new Casilla[10][10];
		
		for(int i = 0; i < Grid.length; i++)
		{
			for(int j = 0; j < Grid[0].length; j++)
			{
				Grid[i][j] = new Casilla();
			}
		}
		
		//Primer grid, donde todo debería estar oculto
		System.out.println("PRIMER GRID, TODO DEBERÍA ESTAR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
		for(int i = 0; i < Grid.length; i++)
		{
			for(int j = 0; j < Grid[0].length; j++)
			{
				Grid[i][j].setNumberOfBombs(BuscaminasFunctions.contarBombas(Grid, i, j));
			}
		}
		
		//Segundo grid, donde todo debería seguir oculto
		System.out.println("SEGUNDO GRID, TODO DEBERÍA SEGUIR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
		//Vamos a poner todas descubiertas
		for(int i = 0; i < Grid.length; i++)
		{
			for(int j = 0; j < Grid[0].length; j++)
			{
				Grid[i][j].changeToDiscovered();
			}
		}
		
		//Segundo grid, donde todos deberían estar descubiertas
		System.out.println("\n\nTERCER GRID, TODO DEBERÍA ESTAR DESCUBIERTO");
		BuscaminasFunctions.MostrarGrid(Grid);

		
	}
	
}
	
	
	