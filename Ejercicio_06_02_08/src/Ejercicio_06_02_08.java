import java.util.Scanner;

public class Ejercicio_06_02_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Numero de decimales entres 0 y 6");
		int numDecimales = in.nextInt();
		System.out.println("Numero de espacios de separacion entre 8 y 15");
		int numSeparacion = in.nextInt();
		System.out.println("Longitud del array entre 5 y 100");
		int lonArray = in.nextInt();
		
		//crear arrays
		double lista1 [] = new double[lonArray];
		double lista2 [] = new double[lonArray];
		double lista3 [] = new double[lonArray];
		
		//añadir elementos a los array
		for (int i=0;i<lonArray;i++) {
			lista1[i]= generarNumeroAleatorio(10, 5000);
			lista2[i]= generarNumeroAleatorio(20, 80000);
			lista3[i] = generarNumeroAleatorio(5, 2000000);
		}
		
		//imprimir datos
		for (int i=0;i<lista1.length;i++) {
			double num1 = lista1[i];
			double num2 = lista2[i];
			double num3 = lista3[i];
			
			int total = 5+numDecimales;
			String formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num1);
			
			total = 6+numDecimales+numSeparacion;
			formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num2);
			
			total = 8+numDecimales+numSeparacion;
			formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num3);
			
			System.out.println();
		}

	}

	/*
	 * metodo para generar numeros aleatorios
	 * entre dos dado
	 */
	public static double generarNumeroAleatorio(int desde, int hasta) {
		return Math.random()*(hasta-desde+1)+desde;
	}
}
