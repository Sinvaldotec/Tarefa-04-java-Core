package lista04exercicio04;

import java.util.Scanner;

public class Lista04Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos reais voê tem?");

		double reais= sc.nextInt();

		double cotação = 5;

		double total = reais/cotação;

		System.out.println("O valor em moedas americanas é de :" + total);
		System.out.println("O valor em reais é de:" + reais );
		System.out.println("O valor da cotação do dólar é de :" + cotação );


}}
