import java.util.Scanner;

public class TestLista {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Numero de decimales entres 0 y 6");
		int numDecimales = in.nextInt();
		System.out.println("Numero de espacios de separacion entre 8 y 15");
		int numSeparacion = in.nextInt();
		System.out.println("Longitud del array entre 5 y 100");
		int lonArray = in.nextInt();
		//crear un nuevo objeto
		Lista nuevaLista= new Lista(numDecimales, numSeparacion, lonArray);
		//añadir numeros a las listas
		nuevaLista.rellenarListas();
		//imprimir listas
		nuevaLista.imprimirListas();
		//prueba enviar desde remoto a local 2

	}

}
