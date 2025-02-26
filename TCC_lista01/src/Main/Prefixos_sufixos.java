package Main;

import java.util.Scanner;

public class Prefixos_sufixos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.print("Digite uma string (ou pressione Enter para sair): ");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) break; // Sai do loop se a entrada for vazia

            for (int i = 1; i <= input.length(); i++) 
                System.out.println(input.substring(0, i));

            System.out.println();

            for (int i = 0; i < input.length(); i++) 
                System.out.println(input.substring(i));

            System.out.println();
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
