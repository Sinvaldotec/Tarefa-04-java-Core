package lista04exercicio05;

import java.util.Scanner;

public class Lista04Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a cotação atual do dólar?");

		double cotação = sc.nextInt();

		System.out.println("Quantos dólares você possui? ");

		double total= sc.nextInt();

		double reais = total/cotação;

		System.out.println("O valor em moedas americanas é de :" + reais );

}}