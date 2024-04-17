package Aula1704;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int impar;
		
		System.out.println("Informe um intervalo de valores: ");
		impar = ler.nextInt();
		
		for(int i=0; i <=impar ; i++) {
			if (i%2 ==1) {
			System.out.println(i+" é impar");
		}

	}
ler.close();
	}
}
