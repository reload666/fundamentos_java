package aulasdeJava;

import java.util.Scanner;

public class Aula16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1, num2, soma, sub, mult, div;
		
		System.out.println("Digite um n�mero: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Valor da soma �: " + soma);
		System.out.println("Valor da subtra��o �: " + sub);
		System.out.println("Valor da multiplica��o �: " + mult); 
		System.out.println("Valor da divis�o �: " + div);
	}

}
