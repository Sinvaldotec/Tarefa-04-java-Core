package lista04exercicio10;

import java.util.Scanner;

public class Lista04Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de Votos Validos Para Candidato A");
		double a = sc.nextInt();

		System.out.println("Quantidade de Votos Validos Para Candidato B");
		double b = sc.nextInt();

		System.out.println("Quantidade de Votos Validos Para Candidato C");
		double c = sc.nextInt();

		System.out.println("Quantidade de Votos Nulos");
		double vn = sc.nextInt();

		System.out.println("Quantidade de Votos Brancos");
		double vb = sc.nextInt();

		double vv,te,ptv,pva,pvb,pvc,pn,pb;

		vv =  a + b + c;//votos validos
		te = vv + vn + vb; //número total de eleitores,
		ptv = (vv * 100) / te; //percentual de votos válidos
		pva = (a * 100) / te;// votos válidos do candidato a
		pvb = (b * 100) / te;//votos válidos do candidato b
		pvc = (c * 100) / te;//votos válidos do candidato C
		pn = (vn * 100) / te;//percentual correspondente de votos nulos
		pb = (vb * 100) / te; //percentual correspondente de votos brancos

		System.out.println("O número total de eleitores é:" + vv);
		System.out.println("O percentual de votos válidos:" + ptv);
		System.out.println("O percentual de Votos válidos do candidato a:" + pva);
		System.out.println("O percentual de Votos válidos do candidato b:" + pvb);
		System.out.println("O percentual de Votos válidos do candidato c:" + pvc);
		System.out.println("O percentual correspondente de votos nulos:" + pn);
		System.out.println("O percentual correspondente de votos brancos:" + pb);
	}}
