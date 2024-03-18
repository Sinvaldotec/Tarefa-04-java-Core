package lista04exercicio09;

import java.util.Scanner;

public class Lista04Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o salário mensal?");
		double salariomensal = sc.nextInt();

		System.out.println("Qual o percentual de reajuste?");
		double reajuste= sc.nextInt();

		double totalreajuste;
		double novosalario;
		totalreajuste = salariomensal/100*reajuste ;
		novosalario = totalreajuste+ salariomensal;

		System.out.println("O novo salario será de :" + novosalario);
	}
	}
