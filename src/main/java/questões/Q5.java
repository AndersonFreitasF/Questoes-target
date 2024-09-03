package questões;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("Digite uma string:");
		str = sc.nextLine();

		char[] letras = str.toCharArray();

		char[] invertida = new char[letras.length];

		for (int i = 0; i < letras.length; i++) {
			invertida[i] = letras[letras.length - 1 - i];
		}

		String resultado = new String(invertida);

		System.out.println("String invertida: " + resultado);
		sc.close();
	}
}
