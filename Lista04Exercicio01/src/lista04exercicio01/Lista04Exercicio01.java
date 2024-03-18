package lista04exercicio01;

import java.util.Scanner;

public class Lista04Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numero1,numero2,numero3,numero4;

		System.out.println("digite o primeiro numero para que deseja que seja multiplicado e somado");
		numero1= sc.nextInt();

		System.out.println("digite o segundo numero para que deseja que seja multiplicado e somado");
		numero2= sc.nextInt();

		System.out.println("digite o terceiro numero para que deseja que seja multiplicado e somado");
		numero3= sc.nextInt();

		System.out.println("digite o quarto numero para que deseja que seja multiplicado e somado");
		numero4= sc.nextInt();

		System.out.println("A soma do numero1 com o numero2 é:" + numero1+numero2);
		System.out.println("A MULTIPLICACAO do numero1 com o numero2 é:" + numero1*numero2);
		System.out.println("A soma do numero1 com o numero3 é:"+ numero1+numero3);
		System.out.println ("A MULTIPLICACAO do numero1 com o numero3 é:"+ numero1*numero3);
		System.out.println("A SOMA do numero1 com numero4 é:"+ numero1+numero4);
		System.out.println("A MULTIPLICACAO do numero1 com o numero4 é:"+ numero1*numero4);
		System.out.println("A soma do numero 2 com o numero3 é:"+numero2+numero3);
		System.out.println("A multiplicacao do numero 2 com o numero3 é:"+numero2*numero3);
		System.out.println("A SOMA do numero2 com o numero 4 é:"+numero2+numero4);
		System.out.println("A MULTIPLICACAO do numero2 com o numero4 é:" + numero2*numero4);
		System.out.println("A SOMA do numero3 com o numero4 é:"+ numero3+numero4);
		System.out.println("A MULTIPLICACAO do numero3 com o numero4 é:"+ numero3*numero4);


			
	}
	}