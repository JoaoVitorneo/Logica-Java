//Faça um programa que o usuário informe 1 valor e retorne o quarado do número.

import java.util.Scanner;

public class LogicaFive {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número para calcularo quadrado: ");
        int num = input.nextInt();
        int quad = num * num;
        System.out.print("O quadrado do número é: " + quad);

        input.close();
    }
}
