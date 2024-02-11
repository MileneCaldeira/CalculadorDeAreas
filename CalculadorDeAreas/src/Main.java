import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Informe três valores para calcularmos as áreas: ");
	double A = sc.nextDouble(); // base triangulo, base trapézio
	double B = sc.nextDouble(); // base trapézio, lados do quadrado, lado do retangulo
	double C = sc.nextDouble(); //altura triangulo, raio circulo, altura trapezio, lado do retangulo
	double pi = 3.14159;
	double RaioQuadrado = Math.pow(C, 2);
	
	double AreaT = (A*C)/2; //triangulo retangulo
	double AreaC = pi*RaioQuadrado; //circulo
	double AreaTR = ((A+B)*C)/2; // trapezio
	double AreaQ = B*B; //Quadrado
	double AreaR = A*B; // retangulo
	
	System.out.printf("TRIANGULO %.3f %n",AreaT);
	System.out.printf("CIRCULO %.3f %n",AreaC);
	System.out.printf("TRAPEZIO %.3f %n",AreaTR);
	System.out.printf("QUADRADO %.3f %n",AreaQ);
	System.out.printf("RETANGULO %.3f %n",AreaR);

	}

}
