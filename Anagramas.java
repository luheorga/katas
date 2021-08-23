
public class Anagramas {

	private static int[] arrpalabra1 = new int[123];
    private static int[] arrpalabra2 = new int[123];
    private static int suma =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.out.println(makeAnagram("cde", "abc")); 	

	}
	
	static int makeAnagram(String a, String b) {
	    
	    for(int i=0;i< a.length(); i++)
	        {
	                int direccion = a.charAt(i);
	                arrpalabra1[direccion] = arrpalabra1[direccion] + 1  ;     
	        }
	        
	    for(int i=0;i< b.length(); i++)
	        {
	                int direccion = b.charAt(i);
	                arrpalabra2[direccion] = arrpalabra2[direccion] + 1  ;     
	        }
	        
	    for (int i=97; i<123;i++)
	        {
	             suma = suma + Math.abs(arrpalabra1[i]-arrpalabra2[i]);
	        }
	        
	        return suma;
	    }


}
