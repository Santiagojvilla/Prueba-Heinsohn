package prueba_practica_heinsohn;

//Paquetes necesarios
import java.util.Arrays;
import java.util.Scanner;

//Se crea una clase para el ejercicio 3
public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		//Interacción con el usuario
		Scanner teclado = new Scanner(System.in);
		int[] secuencia;
		System.out.print("Introduzca el tamaño del vector: ");
		int n = teclado.nextInt();
		secuencia = new int [n];
		
		for(int i=0; i < secuencia.length; i++) {
			System.out.printf("Introduzca el numero %d: ",i+1);
			secuencia[i] = teclado.nextInt();
		}
		ordenarvector(secuencia);
	}
	//Creación de la función
	public static void ordenarvector(int[] vector) {
		
		Arrays.sort(vector);
		for(int i=0; i< vector.length; i++) {
			if(vector[i] % 2 == 0) {
				System.out.println("" +vector[i]);
			}
		}
		for(int i=0; i< vector.length; i++) {
			if(vector[i] % 2 !=0) {
				System.out.println("" +vector[i]);
			}
		}
	}

}
