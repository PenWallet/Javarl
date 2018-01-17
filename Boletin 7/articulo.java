/* Estudio interfaz (clase):
 * 
 * - Definición:
 * 		Objeto tipo artículo, que tiene las propiedades comunes a todos los artículos
 * 		Tendrá nombre, precio sin IVA, tipo de producto, IVA y precio de costo (
 * 
 * - Por cada propiedad, indicar su tipo y si es consultable/modificable:
 * 		Nombre: String, consultable y modificable
 * 		Precio sin IVA: Double, consultable, modificable
 * 		IVA: Entero, consultable, y modificable
 * 		Precio de costo: Double, consultable y modificable
 * 
 * - Indicar las propiedades derivadas (fórmula si necesario):
 * 		Precio: Double, consultable (Precio sin IVA * IVA)
 * 		
 * - Indicar si cada propiedad es compartida por los objetos:
 * 		No comparte ninguna propiedad con los objetos
 * 
 * - Definir operaciones o funcionalidades del objeto:
 * 		String getNombre()
 * 		Double getPrecioSinIva()
 * 		String getTipo();
 * 		Int getIva()
 * 		Double getPrecioCosto()
 * 		Double getPrecio()
 * 
 * 		Void setNombre(string nombre)
 * 		Void setPrecioSinIva(double preciosiniva)
 * 		Void setTipo(string tipo)
 * 		Void setIva(entero iva)
 * 		Void setFechaDeCaducidad(fecha fechacad)
 * 		Void setPrecioCosto(double preciocosto)
 * 
 * 		
 * 		
 * 			
*/

public class Articulo 
{
	
	//Atributos
	private String nombre;
	private double precioSinIva;
	private String tipo;
	private int iva;
	private double precioCosto;
	
	//defecto, todos, copia
	
	//Constructores
	public Articulo()
	{
		nombre = "null";
		precioSinIva = 0;
		tipo = "null";
		iva = 0;
		precioCosto = 0;
	}
	
	public Articulo(String n, double pSinIva, String t, int i, double pCosto)
	{
		nombre = n;
		precioSinIva = pSinIva;
		tipo = t;
		iva = i;
		precioCosto = pCosto;
	}
	
	public Articulo(Articulo articulo)
	{
		this.nombre = articulo.nombre;
		this.precioSinIva = articulo.precioSinIva;
		this.tipo = articulo.tipo;
		this.iva = articulo.iva;
		this.precioCosto = articulo.precioCosto;
	}
	
	//Métodos
	
	public String getNombre() {return nombre;}
	public double getPrecioSinIva() {return precioSinIva;}
	public String getTipo() {return tipo;}
	public int getIva() {return iva;}
	public double getPrecioCosto() {return precioCosto;}
	
	public double getPrecio()
	{
		double precio = precioSinIva + precioSinIva * iva/100;
		return(precio);
	}
	
	public void setNombre(String n) {nombre = n;}
	public void setPrecioSinIva(double pSinIva){precioSinIva = pSinIva;}
	public void setTipo(String t) {tipo = t;}
	public void setIva(int i) {iva = i;}
	public void setPrecioCosto(double pCosto) {precioCosto = pCosto;}
		
		
	
}

