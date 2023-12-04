
public class Lista {
	//atributos
	private int numDecimales;
	private int numEspacios;
	private int lonArray;
	double [] lista1;
	double [] lista2;
	double [] lista3;
	
	//constructor
	public Lista(int numDecimales, int numEspacios, int lonArray) {
		this.numDecimales=numDecimales;
		this.numEspacios=numEspacios;
		this.lonArray=lonArray;
		lista1 = new double[lonArray];
		lista2 = new double[lonArray];
		lista3 = new double[lonArray];
		
	}
	
	//rellenar listas
	public void rellenarListas() {
		for (int i=0;i<lonArray;i++) {
			lista1[i]= generarNumeroAleatorio(10, 5000);
			lista2[i]= generarNumeroAleatorio(20, 80000);
			lista3[i] = generarNumeroAleatorio(5, 2000000);
		}	
	}
	
	//imprimir listas
	public void imprimirListas() {
		for (int i=0;i<lista1.length;i++) {
			double num1 = lista1[i];
			double num2 = lista2[i];
			double num3 = lista3[i];
			
			int total = 5+numDecimales;
			String formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num1);
			
			total = 6+numDecimales+numEspacios;
			formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num2);
			
			total = 8+numDecimales+numEspacios;
			formato = "%"+total+"."+numDecimales+"f";
			System.out.printf(formato, num3);
			
			System.out.println();
		}
	}
	
	//generar numero aleatorio
	public double generarNumeroAleatorio(int desde, int hasta){
		return Math.random()*(hasta-desde+1)+desde;
	}
}
