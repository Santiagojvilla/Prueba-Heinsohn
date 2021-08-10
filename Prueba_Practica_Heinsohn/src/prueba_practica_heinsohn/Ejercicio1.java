package prueba_practica_heinsohn;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[] vector = new int[] {1,0,1,0,0,0,1,1};
		int[] vper = new int[] {};
		int np = 1;
		int vs = 0;
		
		//Ejecución de permutación
		for(int i=0; i< vector.length; i++) {
			//Primera posición del arreglo
			if(i == 0 && vector[i+1] == 0) {
				vs = 0;
			}else {
				vs = 1;
			}
			//Cuerpo del arreglo
			if(i != 0 && i !=(vector.length-1)) {
				if(vector[i-1] == vector [i+1]) {
					vs = 0;
				}else {
					vs = 1;
				}
			}
			//Ultima posición del arreglo sin importar el tamaño
			if(i == vector.length-1) {
				if(vector[(vector.length-1)-1] == 0) {
					vs = 0;
				}else {
					vs = 1;
				}
			}
			System.out.println(vs);
		}

	}

}
