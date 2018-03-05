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
		
		//Primer grid, donde todo deber�a estar oculto
		System.out.println("PRIMER GRID, TODO DEBER�A ESTAR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
		for(int i = 0; i < Grid.length; i++)
		{
			for(int j = 0; j < Grid[0].length; j++)
			{
				Grid[i][j].setNumberOfBombs(BuscaminasFunctions.contarBombas(Grid, i, j));
			}
		}
		
		//Segundo grid, donde todo deber�a seguir oculto
		System.out.println("SEGUNDO GRID, TODO DEBER�A SEGUIR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
		//Vamos a poner todas descubiertas
		for(int i = 0; i < Grid.length; i++)
		{
			for(int j = 0; j < Grid[0].length; j++)
			{
				Grid[i][j].changeToDiscovered();
			}
		}
		
		//Segundo grid, donde todos deber�an estar descubiertas
		System.out.println("\n\nTERCER GRID, TODO DEBER�A ESTAR DESCUBIERTO");
		BuscaminasFunctions.MostrarGrid(Grid);

		
	}
	
}
	
	
	