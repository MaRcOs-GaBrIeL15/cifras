package cifras;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		CifraDeCesar c = new CifraDeCesar();
		CifraVigenere v = new CifraVigenere();
		int y = 0;

		do {

			System.out.println("O que você quer fazer?");
			System.out.println("1- cifrar usando cifra de cesar");
			System.out.println("2- decifrar usando cifra de cesar");
			System.out.println("3- cifrar usando cifra de vigenere");
			System.out.println("4- decifrar usando cifra de vigenere");
			System.out.println("5- sair");
			switch (t.nextInt()) {

			case 1:
				t.nextLine();
				c.cifrar(t.nextLine(), t.nextInt());
				t.nextLine();
				break;
			case 2:
				t.nextLine();
				c.decifrar(t.nextLine(), t.nextInt());
				t.nextLine();
				break;
			case 3:
				t.nextLine();
				v.cifrar(t.nextLine(), t.nextLine());
				break;
			case 4:
				t.nextLine();
				v.decifrar(t.nextLine(), t.nextLine());
				break;
			case 5:
				y = 1;
				break;
			default:
				System.out.println("!Valor invalido!");
				break;
			}

		} while (y == 0);

		t.close();
	}

}
