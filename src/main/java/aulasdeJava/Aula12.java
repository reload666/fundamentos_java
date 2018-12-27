package aulasdeJava;

import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite sua idade: ");
		a = in.nextInt();
		
		System.out.println("Digite seu numero da sorte: ");
		b = in.nextInt();
		
		
		System.out.println("Sua idade é: " + a + " e seu número da sorte é: " + b);
	}

}
