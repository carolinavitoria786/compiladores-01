package Main;

import java.util.Scanner;

public class automato02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();
        scanner.close();

        if (processaAutomato(palavra)) {
            System.out.println("Palavra aceita.");
        } else {
            System.out.println("Palavra rejeitada.");
        }
    }

    public static boolean processaAutomato(String palavra) {
        int estado = 0; // Estado inicial q0

        for (char c : palavra.toCharArray()) {
            switch (estado) {
                case 0: // Estado inicial q0
                    if (c == 'a') estado = 3; //para s3
                    else if (c == 'b') estado = 0; // Loop 
                    else return false; 
                case 3: // Estado s3
                    if (c == 'a') estado = 6; //para s6
                    else if (c == 'b') estado = 3; // Loop 
                    else return false; // 
                    break;
                case 6: // final s6
                    if (c == 'a') estado = 6; // Loop
                    else if (c == 'b') estado = 4; //para s4
                    else return false; 
                    break;
                case 4: // final s4
                    if (c == 'b') estado = 4; // Loop
                    else if (c == 'a') estado = 6; //para s6
                    else return false;
                    break;
                default:
                    return false; 
            }
        }
        return estado == 4 || estado == 6;
    }
}