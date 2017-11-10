/* Nombre del programa: fol_salario
 * 
 * Análisis:
 * El usuario podrá hacer las sumas de los devengos, las deducciones, el salario bruto,
 * el salario líquido, el BCCC y el BCCP .
 * 
 * Se obligará a introducir los datos estrictamente necesarios para el cálculo de la nómina.
 * Lo son el IRPF y el Salario Base
 * 
 * Requisitos:
 * - Se deberán introducir los datos en forma de números naturales positivos mayores que 0
 * 
 * Entradas:
 * - Datos del salario
 * 
 * Salidas:
 * - Nómina calculada
*/

/* Pseudocódigo Generalizado:
 *	Inicio
 * 		Declarar variables
 * 
 * 		//Bloque de percepciones salariales
 * 
 * 		Leer y validar Salario Base
 * 		Leer y validar si tiene pluses
 * 		Si tiene pluses
 * 			Leer y validar entrada de pluses
 * 		Fin (Si tiene pluses)
 * 		Leer y validar si tiene horas extraordinarias
 * 		Si cobra horas extraordinarias
 *			Leer y validar horas extraordinarias
 *		Fin (Si cobra horas extraordinarias)
 *		Leer y validar si cobra pagas extraordinarias
 *		Si cobra pagas extraordinarias
 *			Leer y validar número de pagas totales
 *			Leer y validar cantidad remunerada
 *		Fin (Si cobra pagas extraordinarias)
 * 
 * 		//Fin Bloque de percepciones salariales
 * 
 * 
 * 		//Bloque de percepciones extrasalariales
 * 
 * 		Leer y validar si tiene percepciones extrasalariales
 * 		Si tiene percepciones extrasalariales
 * 			Leer y validar entrada de percepciones extrasalariales
 * 		Fin (Si tiene percepciones extrasalariales)
 * 
 * 		//Fin Bloque de percepciones extrasalariales
 * 
 * 
 * 		//Bloque Deducciones
 * 		
 * 		Leer y validar si es Temporal o Indefinido
 * 		Leer y validar porcentaje de IRPF
 * 		Leer y validar anticipos
 * 		Leer y validar valor de los productos recibidos en especie
 * 		
 * 		Calcular BCCC
 * 		Calcular BCCP
 * 		Calcular Contingencias comunes
 * 		Calcular Desempleo
 * 		Calcular Formación profesional
 * 		Calcular horas extraordinarias
 * 		Calcular IRPF
 * 		
 * 		//Fin Bloque Deducciones
 *
 *		
 * Mostrar nómina
 * 		
 * 		
 * 		
*/

import java.util.Scanner;
import java.io.*;

public class fol_salario
{
	
	public static void main (String[] args) 
	{
		// Inicializamos las variables
		Scanner teclado = new Scanner (System.in);
		double base = 0;
		double pluses = 0;
		double horasextra = 0;
		double pagasextracant = 0;
		double percextracant = 0;
		double BCCC;
		double BCCP;
		double anticipo = 0;
		double especie = 0;
		double dedCC = 0;
		double dedDesempleo = 0;
		double dedFP = 0;
		double dedHorasExtra = 0;
		double dedIRPF = 0;
		
		byte pagasextranumero = 0;
		byte irpfporcentaje;
		
		char plusesyon;
		char horasextrayon;
		char pagasextrayon;
		char percextrayon;
		char tipocontrato;
		char anticipoyon;
		char especieyon;
		
		// ******************************************************************************
		
		//Bloque de percepciones salariales
		
		//Leer y validar Salario base
		System.out.println("¿Cuál es tu salario base?");
		
		do
		{
			base = teclado.nextDouble();
			if (base <= 0)
				System.out.println("¡El salario base solo puede ser mayor que 0!");
		} while (base <= 0);
		
		//Leer y validar si tiene pluses
		System.out.println("\n¿Cobras pluses? (Y / N)");
		do
		{
			plusesyon = Character.toUpperCase(teclado.next().charAt(0));
			if (plusesyon != 'Y' && plusesyon != 'N')
				System.out.println("¡Solo Y o N!");
		} while (plusesyon != 'Y' && plusesyon != 'N');
		
		//Si tiene pluses
		if (plusesyon == 'Y')
		{
			System.out.println("Introduce la cantidad del total de los pluses");
			do
			{
				pluses = teclado.nextDouble();
				if (pluses <= 0)
					System.out.println("¡La suma de los pluses debe ser mayor a 0!");
			} while (pluses <= 0);
		}
		//Fin (Mientras tenga pluses)
		
		
		//Leer y validar si tiene horas extraordinarias
		System.out.println("\n¿Cobras horas extraordinarias? (Y / N)");
		do
		{
			horasextrayon = Character.toUpperCase(teclado.next().charAt(0));
			if (horasextrayon != 'Y' && horasextrayon != 'N')
				System.out.println("¡Solo Y o N!");
		} while (horasextrayon != 'Y' && horasextrayon != 'N');
		
		//Si cobra horas extraordinarias
		if (horasextrayon == 'Y')
		{
			System.out.println("¿Cuánto es el total de las horas extraordinarias?");
			do
			{
				horasextra = teclado.nextDouble();
				if (horasextra <= 0)
					System.out.println("¡La suma de las horas extraordinarias debe ser mayor a 0!");
			} while (horasextra <= 0);
		}
		//Fin (Si cobra horas extraordinarias)
		
		//Leer y validar si cobra pagas extraordinarias
		System.out.println("\n¿Cobras pagas extraordinarias? (Y / N)");
		do
		{
			pagasextrayon = Character.toUpperCase(teclado.next().charAt(0));
			if (pagasextrayon != 'Y' && pagasextrayon != 'N')
				System.out.println("¡Solo Y o N!");
		} while (pagasextrayon != 'Y' && pagasextrayon != 'N');
		
		//Si cobra pagas extraordinarias
		if (pagasextrayon == 'Y')
		{
			//Leer y validar número de pagas totales
			System.out.println("¿Cuántas pagas extra cobras al año?");
			do
			{
				pagasextranumero = teclado.nextByte();
				if (pagasextranumero <= 0)
					System.out.println("¡Debes cobrar al menos 1 al año!");
			} while (pagasextranumero <= 0);
			
			//Leer y validar cantidad remunerada
			System.out.println("¿Cuánto cobras por paga extra?");
			do
			{
				pagasextracant = teclado.nextDouble();
				if (pagasextracant <= 0)
					System.out.println("¡Cantidad no válida!");
			} while (pagasextracant <= 0);
		}
		// Fin (Si cobra pagas extraordinarias)
		
		//Fin Bloque de percepciones salariales
		
		
		// ******************************************************************************
		
		
		//Bloque de percepciones extrasalariales
		
		//Leer y validar si tiene percepciones extrasalariales
		System.out.println("\n¿Cobras percepciones extrasalariales? (Y / N)");
		do
		{
			percextrayon = Character.toUpperCase(teclado.next().charAt(0));
			if (percextrayon != 'Y' && percextrayon != 'N')
				System.out.println("¡Solo Y o N!");
		} while (percextrayon != 'Y' && percextrayon != 'N');
		
		//Si cobra pagas extraordinarias
		if (percextrayon == 'Y')
		{
			//Leer y validar entrada de percepciones extrasalariales
			System.out.println("¿Cuál es la suma de todas tus percepciones extrasalariales?");
			do
			{
				percextracant = teclado.nextDouble();
				if (percextracant <= 0)
					System.out.println("¡Cantidad no válida!");
			} while (percextracant <= 0);
		}
		//Fin (Si tiene percepciones extrasalariales)
		
		//Fin Bloque de percepciones extrasalariales
		
		
		// ******************************************************************************
		
		
		//Bloque Deducciones
		
		//Leer y validar si es temporal o indefinido
		System.out.println("\n¿Tu contrato es de tipo temporal o indefinido?");
		do
		{
			tipocontrato = Character.toUpperCase(teclado.next().charAt(0));
			if (tipocontrato != 'T' && tipocontrato != 'I')
				System.out.println("¡Solo Temporal o Indefinido!");
		} while(tipocontrato != 'T' && tipocontrato != 'I');
		
		//Leer y validar porcentaje de IRPF
		System.out.println("\n¿Cuál es el porcentaje de IRPF deducido en tu contrato?");
		do
		{
			irpfporcentaje = teclado.nextByte();
			if (irpfporcentaje <= 0 || irpfporcentaje >= 100)
				System.out.println("¡El IRPF no puede ser menor o igual a 0% ni mayor o igual al 100%!");
		} while(irpfporcentaje <= 0 || irpfporcentaje >= 100);
		
		//Leer y validar anticipos
		System.out.println("\n¿Te han dado un anticipo este mes? (Y / N)");
		do
		{
			anticipoyon = Character.toUpperCase(teclado.next().charAt(0));
			if (anticipoyon != 'Y' && anticipoyon != 'N')
				System.out.println("¡Solo Y o N!");
		}while (anticipoyon != 'Y' && anticipoyon != 'N');
		
		if (anticipoyon == 'Y')
		{
			System.out.println("¿De cuánto ha sido el anticipo?");
			do
			{
				anticipo = teclado.nextDouble();
				if (anticipo <= 0)
					System.out.println("¡El anticipo no puede haber sido de 0 o menos euros!");
			}while (anticipo <= 0);
		}
		
		//Leer y validar valor de los productos recibidos en especie
		System.out.println("\n¿Has recibido productos en especie? (Y / N)");
		do
		{
			especieyon = Character.toUpperCase(teclado.next().charAt(0));
			if (especieyon != 'Y' && especieyon != 'N')
				System.out.println("¡Solo Y o N!");
		}while (especieyon != 'Y' && especieyon != 'N');
		
		if (especieyon == 'Y')
		{
			System.out.println("¿Por valor de cuánto?");
			do
			{
				especie = teclado.nextDouble();
				if (especie <= 0)
					System.out.println("¡El valor no puede ser de 0 o menos euros!");
			}while (especie <= 0);
		}
		
		
		//Calcular BCCC
		BCCC = base + pluses + (pagasextracant * pagasextranumero)/12.0;
		if (BCCC > 3230.1)
			BCCC = 3230.1;
		System.out.println("BCCC: "+BCCC);
		
		//Calcular BCCP
		BCCP = base + pluses + horasextra + (pagasextracant * pagasextranumero)/12.0;
		if (BCCP > 3230.1)
			BCCP = 3230.1;
		System.out.println("BCCP: "+BCCP);
		
		//Calcular contingencias comunes
		dedCC = BCCC * 0.047;
		
		//Calcular desempleo
		if (tipocontrato == 'I')
			dedDesempleo = BCCP * 0.0155;
		else
			dedDesempleo = BCCP * 0.016;
		
		//Calcular Formación Profesional
		dedFP = BCCP * 0.001;
		
		//Calcular horas extraordinarias
		if (horasextrayon == 'Y')
			dedHorasExtra = horasextra * 0.047;
		
		//Calcular IRPF
		dedIRPF = irpfporcentaje/100.0 * (base+pluses+horasextra);
		
		//Fin Bloque Deducciones
		
		
		// ******************************************************************************
		
		
		//Mostrar nómina
		
		System.out.println("\n\nNÓMINA FINAL:");
		System.out.println("\nI. DEVENGOS");
		System.out.println("	1.Percepciones salariales");
		System.out.println("		Salario base................................__"+base+" euros__");
		System.out.println("		Complementos salariales:");
		System.out.println("		Pluses......................................__"+pluses+" euros__");
		if (horasextrayon == 'Y')
			System.out.println("		Horas extraordinarias.......................__"+horasextra+" euros__");
		else
			System.out.println("		Horas extraordinarias.......................______");
		System.out.println("	2. Percepciones extrasalariales");
		if (percextrayon == 'Y')
			System.out.println("		Total de percepciones extrasalariales.......__"+percextracant+" euros__");
		else
			System.out.println("		Total de percepciones extrasalariales.......______");
		System.out.println("	A. TOTAL DEVENGADO......................................__"+(base+pluses+horasextra+percextracant)+" euros__");
		System.out.println("II. DEDUCCIONES");
		System.out.println("	1. Cotizaciones a la Seguridad Social:");
		System.out.println("		Contingencias comunes (4.70%)...............__"+dedCC+" euros__");
		if (tipocontrato == 'I')
			System.out.println("		Desempleo (1.55%)...........................__"+dedDesempleo+" euros__");
		else
			System.out.println("		Desempleo (1.60%)...........................__"+dedDesempleo+" euros__");
		System.out.println("		Formación profesional (0.10%)...............__"+dedFP+" euros__");
		if (horasextrayon == 'Y')
			System.out.println("		Otras horas extraordinarias (4.70%).............__"+dedHorasExtra+" euros__");
		System.out.println("	TOTAL APORTACIONES..............................__"+(dedCC+dedDesempleo+dedFP+dedHorasExtra)+" euros__");
		System.out.println("	2. IRPF ........................................__"+dedIRPF+" euros__");
		if (anticipoyon == 'Y')
			System.out.println("	3. Anticipos....................................__"+anticipo+" euros__");
		else
			System.out.println("	3. Anticipos....................................______");
		if (especieyon == 'Y')
			System.out.println("	4. Valor de los productos recibidos en especie..__"+especie+" euros__");
		else
			System.out.println("	4. Valor de los productos recibidos en especie..______");
		System.out.println("	B. TOTAL A DEDUCIR......................................__"+(dedCC+dedDesempleo+dedFP+dedHorasExtra+anticipo+especie+dedIRPF)+" euros__");
		System.out.println("	LÍQUIDO TOTAL A PERCIBIR (A - B)........................__"+((base+pluses+horasextra+percextracant)-(dedCC+dedDesempleo+dedFP+dedHorasExtra+anticipo+especie+dedIRPF))+" euros__");
	}
}	
