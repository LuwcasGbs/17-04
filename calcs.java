package Aula1704;

import java.util.Scanner;

public class calcs {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int val,soma;
		soma=0;
		for(int i=1; i <=5 ; i++) {
		System.out.print("Digite um valor: ");
		val = ler.nextInt(); 
		soma=soma+val;
		System.out.println("A soma dos valores é: " +soma);
	}
		double media = soma/5;
		System.out.println("A média dos valores é: "+media);
ler.close();
}
}