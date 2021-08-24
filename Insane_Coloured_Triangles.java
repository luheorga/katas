
public class Insane_Coloured_Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseTriangulo = "B";
    }
	
	
	public static char Triangle(String row) {
	
		String nuevaBase="";
		int contador=0;
		char resultado =' ';
		
		if (row.length() == 1) {
			
			resultado = row.charAt(0);
		}

		while(row.length()>1)
		{
			for (int i = 0; i+1 < row.length(); i++) {
				
				String Red="R";
				String Green= "G";
				String Blue = "B";
				
				char color1 = row.charAt(i);
				char color2 = row.charAt(i+1);
				
				if (color1 == color2) {
				 
				 nuevaBase	= nuevaBase.concat(String.valueOf(color1));
				}
				else if( color1 == 'R' && color2 == 'G' ) {
					
					nuevaBase = nuevaBase.concat(Blue);
				}
	            else if( color1 == 'R' && color2 == 'B' ) {
					
	            	nuevaBase	=  nuevaBase.concat(Green);
				}
	            else if( color1 == 'G' && color2 == 'R' ) {
					
	            	nuevaBase	= 	nuevaBase.concat(Blue);
				}
	            else if( color1 == 'G' && color2 == 'B' ) {
					
	            	nuevaBase	= 	nuevaBase.concat(Red);
				}
	            else if( color1 == 'B' && color2 == 'R' ) {
					
	            	nuevaBase	= 	nuevaBase.concat(Green);
				}
	            else {
					
	            	nuevaBase	= 	nuevaBase.concat(Red);
				}
			}
			 
			row = nuevaBase;
			nuevaBase = "";
			contador++;
			resultado = row.charAt(0);
			}
		
		return resultado;
	}
	 

}
