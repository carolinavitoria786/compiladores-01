package Main;

import java.util.Scanner;

public class automato {
    public static String processarPalavra(String palavra) {
        String estado = "q0"; 

        for (char simbolo : palavra.toCharArray()) {
            switch (estado) {
                case "q0":
                    if (simbolo == 'a') estado = "q1";
                    else if (simbolo == 'b') estado = "q2";
                    else return "Palavra rejeitada";
                    break;
                case "q1":
                    if (simbolo == 'a') estado = "qf";
                    else if (simbolo == 'b') estado = "q0";
                    else return "Palavra rejeitada";
                    break;
                case "q2":
                    if (simbolo == 'a') estado = "q0";
                    else if (simbolo == 'b') estado = "qf";
                    else return "Palavra rejeitada";
                    break;
                case "qf":
                    return "Palavra aceita";
            }
        }
        return estado.equals("qf") ? "Palavra aceita" : "Palavra rejeitada";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        System.out.println(processarPalavra(palavra));
        scanner.close();
    }
}

