import java.util.ArrayList;

/*Esta clase sirve para comprobar cuantos impares hay en un arraylist*/
public class Clase3 {
	public static void main(String [] args) {
		/*creamos un arrayList y lo reyenamos con numeros enteros*/
		ArrayList numeros = new ArrayList();
		for (int i = 0; i <= 15 ; i++) {
			numeros.add(i);
			}
		/*llamamos al metodo impares*/
		impares(numeros);
	}
	
	/*este metodo realizamos la comprobacion de cuantos numeros impares hay*/
	
	public static int impares(ArrayList numeros) {
	
		/*recorremos el arraylist y sacamos los impares*/
		int contador = 0;
		for (int j = 0; j < numeros.size(); j++) {
			if (j%2!=0) {		
				contador = contador + 1;			
			}
		}
		System.out.println(contador);
		return contador;
	}
}
