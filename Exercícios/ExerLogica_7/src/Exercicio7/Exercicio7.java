package Exercicio7;//Exercício 7 - Encontre os valores de X e Y

import java.util.Scanner;

public class Exercicio7 {
	
		public static void main (String args [])
		{
		Scanner ler = new Scanner (System.in);
		
		int a,b,c,d,e,f,x,y;
		
		System.out.println("\nEscreva o valor de A: ");
		a = ler.nextInt();
		System.out.println("\nEscreva o valor de B: ");
		b = ler.nextInt();
		System.out.println("\nEscreva o valor de C: ");
		c = ler.nextInt();
		System.out.println("\nEscreva o valor de D: ");
		d = ler.nextInt();
		System.out.println("\nEscreva o valor de E: ");
		e = ler.nextInt();
		System.out.println("\nEscreva o valor de F: ");
		f = ler.nextInt();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("\nO Valor de x é: "+x);
		System.out.println("\nO Valor de y é: "+y);
		}

	

}
