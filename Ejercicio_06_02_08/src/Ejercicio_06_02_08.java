
public class Ejercicio_06_02_08 {

	public static void main(String[] args) {
		

	}

	/*
	 * metodo para generar numeros aleatorios
	 * entre dos dadod
	 */
	public static double generarNumeroAleatorio(int desde, int hasta) {
		return Math.random()*(hasta-desde+1)+desde;
	}
}
