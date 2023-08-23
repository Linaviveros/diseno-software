/**
esta es mi applicacion para circulos
 * 
 */
package apliacionCirculo;
import java.util.Scanner;

/**
 este es el programa principal
 */
public class Programas {

	/**
	 * este es el constructor de la clase
	 */
	public Programas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * este es el punto de entrada del programa
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		Circulo miCirculo=new Circulo();
		System.out.println("ingrese el radio del circulo");
		miCirculo.setRadio(teclado.nextDouble());
		
	
	    System.out.println(miCirculo.getArea());
	    System.out.println(miCirculo);

	}

}
