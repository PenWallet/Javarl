/* Estudio interfaz (clase):
 * 
 * - Definici�n: 
 * 	Clase 'Casilla', que se usar� para implementar el juego 'Buscaminas'. Cada objeto de
 * 	esta clase representar� una casilla del tablero del Buscaminas
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 	- isBomb: Boolean, consultable
 * 	- isFlagged: Boolean, consultable, modificable
 * 
 * - Indicar las propiedades derivadas (f�rmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 		boolean getBomb()
 * 		boolean getFlagged()
 * 		 
 * 
*/

import java.io.*;
import java.util.*;

public class Casilla
{
	private boolean isBomb;
	private boolean isFlagged;
	private boolean isDiscovered;
	
	//Constructor �nico para juego Buscaminas
	public Casilla()
	{
		Random random = new Random();
		int r = random.nextInt(10)+1;
		if(r == 1)
			isBomb = true;
		else
			isBomb = false;
		
		isFlagged = false;
		isDiscovered = false;
	}
	
	//Getters
	public boolean getBomb() { return(isBomb); }
	public boolean getFlagged() { return(isFlagged); }
	public boolean getDiscovered() { return(isDiscovered); }
	
	public String toString()
	{
		String s = ("isBomb: "+isBomb+", isFlagged: "+isFlagged);
		return(s);
	}
}
	
	
	
	
	
	
		
		
		
		
