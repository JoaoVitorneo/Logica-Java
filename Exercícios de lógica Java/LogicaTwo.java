//Faça um programa que o usuário informe 3 valores e retorne a média.

import java.util.Scanner;

public class LogicaTwo {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        int num3 = input.nextInt();

        int soma = (num1 + num2 + num3)/3;

        System.out.println("A média é: " + soma);
        input.close();
    }
}
