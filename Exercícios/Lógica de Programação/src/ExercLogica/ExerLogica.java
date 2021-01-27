package ExercLogica; //Exercício 4 - Encontre o valor de D

import java.util.Scanner;

public class ExerLogica {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);

		int a,b,c;
		double r,s,d;
		
			System.out.println("Entre com o valor de A: ");
			a = ler.nextInt();
			System.out.println("Entre com o valor de B: ");
			b = ler.nextInt();
			System.out.println("Entre com o valor de C: ");
			c = ler.nextInt();
			
		r=Math.pow((a+b), 2);
		s=Math.pow((b+c), 2);
		d=(r+s)/2;
		
		System.out.println("\nO valor de S é: "+s);
		System.out.println("\nO valor de R é: "+r);
		System.out.println("\nO valor de D é: "+d);
	}
}



