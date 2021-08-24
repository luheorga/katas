
public class Sum_of_Prefect_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.out.println(sumaEnteros(19));
	   //SquareNumbers();
	}
	
	
	public static int sumaEnteros(int numero) {
		
		int suma=0;
		int resultado =0;
		int contador=0;
		int numeroInicial=1;
		int[] arreglo;
		
		while(numeroInicial*numeroInicial < numero ) {
			 numeroInicial++ ;
		}
		
		System.out.print("Este es el numero " + numeroInicial);
		
		
		for (int i = numero; i > 0; i--) {
			
			
			if(Math.sqrt(i) % 1 ==0) {
				
				System.out.print(i + ",");
			    suma += i;
			    contador++; 
			    
			    if (numero == (i*2)) {
			    	
			    	resultado = 2; 
			    	i =0;
			    }
			    
			    else if (numero == (i*2)+1) {
			    	
			    	resultado = 3; 
			    	i =0;
			    }
			    
			    else if (suma > numero && i!=1) {	
			    	suma -= i;
			    	contador--;
			    }
			    
			    else if ( suma == numero) {
			    	resultado = contador;
			    }
			    
			    else if ( i== 1) {
			    	   	
			    	resultado = numero - suma + contador;
			    }
			    
			    
			}
			
		}
		
		return resultado;
		
	}
	
	
	public static void SquareNumbers() {
		
		int numeroInicial = 1;
		int diferencia = 3;
		int contador = 0;
		
		while (contador <5 ) {
			
			if (numeroInicial == 1) {
				
				System.out.print(numeroInicial);
				numeroInicial = numeroInicial + diferencia;
			}
			else {
				
				System.out.print(numeroInicial);
				diferencia +=2;
				numeroInicial += diferencia; 
			}
				
			contador++;
		}
		
		
		
	}

}
