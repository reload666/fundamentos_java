package aulasdeJava;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um n�mero de 1 � 7: ");
		int dia = in.nextInt(); // domingo
		
		switch (dia) {
		case 1: System.out.println("Donmingo"); break;
		case 2: System.out.println("Segunda-Feira"); break;
		case 3:	System.out.println("Ter�a-Feira");	break;
		case 4:	System.out.println("Quarta-Feira");	break;
		case 5:	System.out.println("Quinta-Feira");	break;
		case 6: System.out.println("Sexta-Feira");	break;
		case 7:	System.out.println("Sabado");	break;
		default: System.out.println("A variavel dia n�o possu� nenhum valor!");
		}
	}

}
