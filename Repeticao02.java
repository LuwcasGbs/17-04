package Aula1704;

import java.util.Scanner;

public class Repeticao02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nom;
		
		for(int i=1; i <=3 ; i++) {
		System.out.print("Insira seu nome: ");
		nom = ler.next();
		System.out.println("Seu nome é: "+nom);
	}
		
		ler.close();

	}

}
