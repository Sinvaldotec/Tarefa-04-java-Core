package lista04exercicio08;

import java.util.Scanner;

public class Lista04Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		double valor1= sc.nextInt();

		System.out.println("Digite o segundo valor");
		double valor2= sc.nextInt();

		System.out.println("Digite o terceiro valor");
		double valor3= sc.nextInt();

		System.out.println("Digite o quarto valor");
		double valor4= sc.nextInt();

		double produto ;
		produto = valor1*valor3 ;

		double soma;
		soma = valor2 + valor4;

		System.out.println(" O produto (variável P) do primeiro com o terceiro valor:" + produto);
		System.out.println("O resultado da soma (variável S) do segundo com o quarto valor" + soma);

}} 
