package test_target;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitando ao usuário que insira uma string
		System.out.print("Digite uma string para inverter: ");
		String str = scanner.nextLine();

		// Chamando o método que inverte a string
		String strInvertida = inverterString(str);

		// Exibindo o resultado
		System.out.println("String original: " + str);
		System.out.println("String invertida: " + strInvertida);

		// Fechando o scanner
		scanner.close();
	}

	// Método para inverter os caracteres de uma string sem usar funções prontas
	public static String inverterString(String str) {
		// Convertendo a string em um array de caracteres
		char[] caracteres = str.toCharArray();

		// Invertendo os caracteres manualmente
		int esquerda = 0;
		int direita = caracteres.length - 1;

		while (esquerda < direita) {
			// Troca os caracteres nas posições "esquerda" e "direita"
			char temp = caracteres[esquerda];
			caracteres[esquerda] = caracteres[direita];
			caracteres[direita] = temp;

			// Move os índices
			esquerda++;
			direita--;
		}

		// Convertendo o array de volta para uma string e retornando
		return new String(caracteres);
	}

}
