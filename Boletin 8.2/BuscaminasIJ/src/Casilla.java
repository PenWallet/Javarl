/* Estudio interfaz (clase):
 * 
 * - Definici?n: 
 * 	Clase 'Casilla', que se usar? para implementar el juego 'Buscaminas'. Cada objeto de
 * 	esta clase representar? una casilla del tablero del Buscaminas
 * 	La clase guardar? si la casilla correspondiente es una bomba o no, si tiene puesta una bandera, si la casilla ha sido descubierta,
 * 	y cu?ntas bombas hay alrededor de la misma
 * 
 *  El n?mero de bombas se asignar? una vez que todas las casillas en el juego principal se hayan asignado
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 	- isBomb: Boolean, consultable
 * 	- isFlagged: Boolean, consultable, modificable
 *	- isDiscovered: Boolean, consultable, modificable
 *	- numberOfBombs: Boolean, consultable, modificable
 * 
 * - Indicar las propiedades derivadas (f?rmula si necesario):
 * - Indicar si cada propiedad es compartida por los objetos:
 * - Definir operaciones o funcionalidades del objeto:
 * 		boolean getBomb()
 * 		boolean getFlagged()
 * 		boolean getDiscovered()
 * 		int getNumberOfBombs()
 * 
 * 		void setFlagged(boolean flag)
 * 		void setDiscovered(boolean discover)
 * 		void setNumberOfBombs(boolean number)
 * 		
 * 		void changeDiscoveredState()
 * 
*/

import java.io.*;
import java.util.*;

public class Casilla
{
	private boolean isBomb;
	private boolean isFlagged;
	private boolean isDiscovered;
	private int numberOfBombs = 0;
	
	//Constructor ?nico para juego Buscaminas
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
	public int getNumberOfBombs() { return(numberOfBombs); }
	
	public void setFlagged(boolean flag) { this.isFlagged = flag; }
	public void setNumberOfBombs(int number) { this.numberOfBombs = number; }
	
	public void changeToDiscovered() { this.isDiscovered = true; }
	
	public String toString()
	{
		String s = ("isBomb: "+isBomb+", isFlagged: "+isFlagged+", isDiscovered: "+isDiscovered+", numberOfBombs: "+numberOfBombs);
		return(s);
	}
}
	
	
	
	
	
	
		
		
		
		
