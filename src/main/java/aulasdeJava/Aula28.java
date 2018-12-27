package aulasdeJava;

public class Aula28 {

	public static void main(String[] args) {
		label: for (int i=0; i<20; i++) {
			if(i==10) {
				continue label;
			} else if(i==15) {
				break label;
			}
			System.out.println(i);
		}

	}

}
