
public class Clock_Singularity {

	static int[] arreglo = { 8 };
	static int[] arreglo1 = arreglo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			for (int i = 0; i < arreglo1.length; i++) {

				arreglo1[i] = arreglo1[i] - 1;
				System.out.print(arreglo1[i]);
				if (arreglo1[i] == 0) {
					arreglo1[i] = arreglo[0];
				}
			}
		}
	}

	public static int Solucion(int[] arreglo) {

		int longitudArreglo = arreglo.length - 1;
		boolean bandera = false;

		for (int i : arreglo) {
			System.out.print(i);
		}

		while (bandera == false) {

			for (int i = 0; i < arreglo.length; i++) {
				if (arreglo[i] != arreglo[i + 1]) {
					break;
				}
				;

				if (i == arreglo.length) {
					bandera = true;
				}
			}

			for (int indice : arreglo) {
				arreglo[indice] = arreglo[indice] - 1;
			}
		}

		System.out.println("arreglo resultante");
		for (int i : arreglo) {
			System.out.print(i);
		}
		return 6;

	}
}
