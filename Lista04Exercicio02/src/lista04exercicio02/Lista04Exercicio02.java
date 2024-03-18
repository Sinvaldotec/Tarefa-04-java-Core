package lista04exercicio02;

import java.util.Scanner;

public class Lista04Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o comprimento ds caixa");

		int comprimento= sc.nextInt();

		System.out.println("Digite a largura da caixa");

		int largura= sc.nextInt();

		System.out.println("Digite a altura da caixa");

		int altura= sc.nextInt();

		System.out.println("O volume da caixa é de :" + comprimento*largura*altura + "M3");

}}