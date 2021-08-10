package prueba_practica_heinsohn;

//Aqui esta el paquete de Scanner
import java.util.Scanner;

//Se creo una clase para el ejercicio 2
public class Ejercicio2 {
	
	//El main ejecuta la funci�n
	public static void main(String[] args) {
		
		Scanner cuadro = new Scanner(System.in);
		int n1, n2, n3, N;
		
		//Se interactua con el usuario
		System.out.print("Introduzca el primer n�mero: ");
		n1 = cuadro.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		n2 = cuadro.nextInt();
		System.out.print("Introduzca el tercer n�mero: ");
		n3 = cuadro.nextInt();
		N = imprimemayor(n1,n2,n3);
		
		System.out.println("El n�mero mayor es: "+N);

	}
	//Creaci�n de la funci�n
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
