package prueba_practica_heinsohn;

//Utilice la funci�n contains para saber si la palabra contiene SOH
public class Ejercicio4 {
//El main ejecuta la funci�n
	public static void main(String[] args) {
		
		String nombreEmpresa = "Heinsohn";
		extraersoh(nombreEmpresa);

	}
//Generaci�n de la funci�n
	public static void extraersoh(String nombreEmpresa) {
		
		String soh = "soh";
		if(nombreEmpresa.contains(soh) == true) {
			System.out.println("La palabra " +nombreEmpresa+ " contiene soh ");			
		}else {
			System.out.println("La palabra " +nombreEmpresa+ " no contiene soh ");
		}
		System.out.println(nombreEmpresa.contains("soh"));
	}
}
