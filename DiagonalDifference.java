import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiagonalDifference {

	private static Random r = new Random();
	private static List<List<Integer>> lista = new ArrayList<List<Integer>>();
	private static int diferencia, sumdiag1, sumdiag2;
	private static int count, count2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(diagonalDifference1(crearLista()));	

	}
	
	public static List<List<Integer>> crearLista(){
		
		for (int i = 0; i < 3; i++) {
			
			List<Integer>lista2 = new ArrayList<Integer>();
			
			for (int j=0; j<3;j++) {
			lista2.add(r.nextInt(10));
			}
			
			lista.add(lista2);	
		}
		
		System.out.println("Esta es la lista");
		lista.forEach(name-> System.out.println(name));
		
		return lista;
		
	}
	
	public static int diagonalDifference1(List<List<Integer>>lista) {
		
		lista.forEach(name-> sumdiag1 += name.get(count++));
	    count2 = lista.size()-1;
	    lista.forEach(name-> sumdiag2 += name.get(count2--));
		return Math.abs(sumdiag1-sumdiag2);
		
	}
	
	

}
