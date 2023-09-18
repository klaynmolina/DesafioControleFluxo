package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean controle = false;

        do {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                int parametroUm = terminal.nextInt();

                System.out.print("Digite o segundo parâmetro: ");
                int parametroDois = terminal.nextInt();

                contar(parametroUm, parametroDois);
                controle = true;

            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida. Tente Novamente.".toUpperCase());
                terminal.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (controle == false);

        terminal.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.".toUpperCase());
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
            System.out.println("Fim.");
        }
    }
}