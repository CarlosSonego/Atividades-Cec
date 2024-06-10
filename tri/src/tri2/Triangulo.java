package tri2;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	public double p;
	public double area;
	
	public void calculararea(){
		
		p = (a+b+c)/2;
		area= p*(p-a)*(p-b)*(p-c);
		java.lang.Math.sqrt(area);

	}
	
}
