package Main;

import java.util.Scanner;

public class Verificacao_palidromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Digite uma palavra ou frase (ou pressione Enter para sair): ");
            String textoOriginal = scanner.nextLine();
            
            if (textoOriginal.isEmpty()) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Sem espaços, pontuação e transforma em minúsculas
            String textoFormatado = textoOriginal.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Inverte o texto
            String textoInvertido = new StringBuilder(textoFormatado).reverse().toString();

            // FAz a comparação das strings 
            if (textoFormatado.equals(textoInvertido)) {
                System.out.println("Resultado: \"" + textoOriginal + "\" é um palíndromo!\n");
            } else {
                System.out.println("Resultado: \"" + textoOriginal + "\" não é um palíndromo.\n");
            }
        }

        scanner.close();
    }
}

