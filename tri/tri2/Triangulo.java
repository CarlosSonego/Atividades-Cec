package tri2;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	public double p;
	public double area;
	public double aux;
	
	public void calculararea(){
		
		p = (a+b+c)/2;
		aux= p*(p-a)*(p-b)*(p-c);
		area = java.lang.Math.sqrt(aux);

	}
	
}
