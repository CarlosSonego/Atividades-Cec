package tri;
import tri2.Triangulo;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
	
		System.out.println("Digite o valor de a");
		t1.a = sc.nextDouble();
		System.out.println("Digite o valor de b");
		t1.b = sc.nextDouble();
		System.out.println("Digite o valor de c");
		t1.c = sc.nextDouble();
		System.out.println("Digite o valor de a");
		t2.a = sc.nextDouble();
		System.out.println("Digite o valor de b");
		t2.b = sc.nextDouble();
		System.out.println("Digite o valor de c");
		t2.c = sc.nextDouble();
		
		t1.calculararea();
		t2.calculararea();
		
		System.out.println(String.format("%.2f", t1.area));
		System.out.println(String.format("%.2f", t2.area));
		
		if (t1.area>t2.area) {
			System.out.println("A area de t1 e maior: "+String.format("%.2f", t1.area));
		}else if(t2.area>t1.area) {
			System.out.println("A area de t2 e maior: "+String.format("%.2f", t2.area));
		}else {
			System.out.println("As area do triangulo sao iguais");
		}	
		
		
	sc.close();
}
    }