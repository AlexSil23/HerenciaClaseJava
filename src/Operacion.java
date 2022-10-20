import java.util.Scanner;

public class Operacion {
	protected Scanner entrada;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	public Operacion() {
		entrada=new Scanner(System.in);
	}
	public void cargar1() {
		System.out.print("Ingrese el primer valor: ");
		valor1=entrada.nextInt();
	}
	public void cargar2() {
		System.out.print("Ingrese el segundo valor: ");
		valor2=entrada.nextInt();
	}
	public void mostrarResultado() {
		System.out.println(resultado);
	}
}
