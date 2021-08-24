
public class Count_The_Divisor_Of_A_Number {

	public static void main(String[] args) {
		
		System.out.println(Divisors(0));

	}
	
	public static int Divisors(int numero) {
		int i =1;
		int contador=0; 
		
		if (numero == 0) {
			return 0;
		}
		
		while(i < numero) {
			
			if (numero % i == 0) {
				contador++;
			}
			i++;
		}
		
		return contador + 1;	
	}
	

}
