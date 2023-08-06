//Faça um programa que o usuário informe uma temperatura em celcius e retorne em farenheit

import java.util.Scanner;

public class LogicaSix {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos graus Celsius está fazendo ai hoje? ");
        int c = input.nextInt();
        double fcalc = c*(9.0/5.0) + 32;
        System.out.print("Essa temperatura em Fahrenheit é: " + fcalc);

        input.close();
    }
}
