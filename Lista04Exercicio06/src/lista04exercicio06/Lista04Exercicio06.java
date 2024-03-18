package lista04exercicio06;

import java.util.Scanner;

public class Lista04Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor1,valor2,valor3,total;

		System.out.println("Digite o primeiro valor");
		valor1= sc.nextInt();

		System.out.println("Digite o segundo valor");
		valor2= sc.nextInt();

		System.out.println("Digite o terceiro valor");
		valor3= sc.nextInt();

		total = valor1 + valor2 + valor3 ;

		System.out.println("A soma dos quadrados dos três valores lidos é:" + total*total);
					
	}
	}

