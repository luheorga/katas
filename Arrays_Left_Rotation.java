
public class Arrays_Left_Rotation {

	static int nuevaPosicion = 0;
	static int[] arreglo = { 1, 2, 3, 4, 5 };
	static int posicionesaRotar = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int indices : arreglo) {

			System.out.print(indices);
		}

		System.out.println();

		int[] arrayresult = rotarArregloaIzquierda(arreglo, posicionesaRotar);

		for (int i = 0; i < arrayresult.length; i++) {

			System.out.print(arrayresult[i]);

		}

	}

	static int[] rotarArregloaIzquierda(int[] arreglo, int n) {

		int[] arregloResultante = new int[arreglo.length];
		int maxarray = arreglo.length - 1;

		int rotacion = n % arreglo.length;

		for (int i = 0; i < rotacion; i++) {
			
			nuevaPosicion = nuevaPosicion - 1;

			if (nuevaPosicion < 0) {
				nuevaPosicion = maxarray;
			}

		}

		//nuevaPosicion = res;

		for (int valor : arreglo) {
			arregloResultante[nuevaPosicion] = valor;
			nuevaPosicion++;

			if (nuevaPosicion > arreglo.length - 1) {
				nuevaPosicion = 0;
			}
		}

		return arregloResultante;

	}

}
