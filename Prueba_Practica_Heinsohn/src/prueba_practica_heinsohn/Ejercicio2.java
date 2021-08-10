package prueba_practica_heinsohn;

//Aqui esta el paquete de Scanner
import java.util.Scanner;

//Se creo una clase para el ejercicio 2
public class Ejercicio2 {
	
	//El main ejecuta la función
	public static void main(String[] args) {
		
		Scanner cuadro = new Scanner(System.in);
		int n1, n2, n3, N;
		
		//Se interactua con el usuario
		System.out.print("Introduzca el primer número: ");
		n1 = cuadro.nextInt();
		System.out.print("Introduzca el segundo número: ");
		n2 = cuadro.nextInt();
		System.out.print("Introduzca el tercer número: ");
		n3 = cuadro.nextInt();
		N = imprimemayor(n1,n2,n3);
		
		System.out.println("El número mayor es: "+N);

	}
	//Creación de la función
	public static int imprimemayor (int a, int b, int c) {
		
		int mayor = 0;
		
		if(a>b && a>c) {
			mayor = a;
		}else {
			if(b>a && b>c) {
				mayor = b;
			}else {
				mayor = c;
			}
		}
		return mayor;
	}

}
