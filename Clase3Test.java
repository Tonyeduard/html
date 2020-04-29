import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

/*Creamos una clase en el cual comprobamos  cuantos impares tiene el array list
 * */

import org.junit.jupiter.api.Test;

class Clase3Test {
	/* Aquí creamos el test*/ /*Este test da correcto*/
	@Test
	public void Clase3_Prueba1() {
		/*Creamos el array list e introducimos un numero*/
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		/*añadimos numeros al array list*/
		numeros.add(4);
		numeros.add(53);
		
		/*hacemos una relacion de el test a la clase*/
		int num = Clase3.impares(numeros);
		assertEquals(1,num);
	}

	/*Este test da negativo*/
	@Test
	public void Clase3_Prueba2() {
		/*Creamos el array list e introducimos un numero*/
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		/*añadimos numeros al array list*/
		numeros.add(4);
		numeros.add(53);
		
		/*hacemos una relacion de el test a la clase*/
		int num = Clase3.impares(numeros);
		assertEquals(1,num);
	}

}
