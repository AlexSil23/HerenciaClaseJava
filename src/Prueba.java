
public class Prueba {
	public static void main(String[] args) {
		//Suma
		Suma suma1=new Suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.print("El resultado de la suma es: ");
		suma1.mostrarResultado();
		//Resta
		Resta resta1=new Resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.print("El resultado de la resta es: ");
		resta1.mostrarResultado();
	}
}
