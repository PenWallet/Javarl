import java.io.*;

public class CondBuscaminasFunction
{
	
	public static void main(String[] args)
	{
		Casilla[][] Grid = new Casilla[10][10];
		
		for(int i = 0; i < (Grid.length - 1); i++)
		{
			for(int j = 0; j < (Grid[0].length - 1); j++)
			{
				Grid[i][j] = new Casilla();
			}
		}
		
		//Primer grid, donde todo deber�a estar oculto
		System.out.println("PRIMER GRID, TODO DEBER�A ESTAR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
		for(int i = 0; i < (Grid.length - 1); i++)
		{
			for(int j = 0; j < (Grid[0].length - 1); j++)
			{
				Grid[i][j].setNumberOfBombs(BuscaminasFunctions.contarBombas(Grid, i, j));
			}
		}
		
		//Segundo grid, donde todo deber�a seguir oculto
		System.out.println("SEGUNDO GRID, TODO DEBER�A SEGUIR OCULTO");
		BuscaminasFunctions.MostrarGrid(Grid);
		
	}
	
}
	
	
	