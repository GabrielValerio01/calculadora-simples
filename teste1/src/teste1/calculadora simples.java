package teste1;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		int opcao;

		System.out.println("n1: ,n2: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();

		System.out.println("Oque deseja fazer: ");
		System.out.println("Somar: ");
		System.out.println("Subtrair: ");
		System.out.println("multiplicar: ");
		System.out.println("divis�o: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			n3 = n1 + n2;
			System.out.println("o valor da soma �: " + n3);
			break;
		case 2:
			n3 = n1 - n2;
			System.out.println("o valor da subtra��o �: " + n3);
			break;
		case 3:
			n3 = n1 * n2;
			System.out.println("o valor da multiplica��o �: " + n3);
			break;
		case 4:
			n3 = n1 / n2;
			System.out.println("o valor da divis�o �: " + n3);
			break;
		}
		leia.close();

	}

}
