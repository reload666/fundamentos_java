package aulasdeJava;

import java.util.Random;

public class Aula25 {

	public static void main(String[] args) {
		
		Random num = new Random();
		int linha = 1;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Linha "+ linha++ + " :"+ num.nextInt(8)+1);
		}
	}

}
