package ExerLogica5;//Exercício 5 - Media Ponderada

import java.util.Scanner;

public class ExerLogica5 {
	
	public static void main (String args []) {
		
		Scanner ler = new Scanner (System.in);
		float n1,n2,n3,mediaponderada;
		
		
		System.out.println("Escreva a N1: ");
		n1 = ler.nextFloat();
		System.out.println("Escreva a N2: ");
		n2 = ler.nextFloat();
		System.out.println("Escreva a N3: ");
		n3 = ler.nextFloat();
		
		mediaponderada = (n1*2+n2*3+n3*5)/(2+3+5);
		
		System.out.println("Sua média é: "+mediaponderada);
		
		
		
	}
	

}
