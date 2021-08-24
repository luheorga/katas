
public class Square_Every_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(SquareEveryDigit(0));

	}
	
	
	public static int SquareEveryDigit(int numero) {
		
		int i=0;
		int resultado =0;
		String cadena;
		String palabra = "";
		
		while(i < String.valueOf(numero).length()) {

		String numero2 = String.valueOf(numero);
		resultado = Character.getNumericValue(numero2.charAt(i));
		resultado = resultado*resultado;
		System.out.println(resultado);
		cadena = String.valueOf(resultado);
		palabra = palabra.concat(cadena);
		i++;
		
		}
		resultado = Integer.parseInt(palabra);
		
		return resultado; 

	}

}
