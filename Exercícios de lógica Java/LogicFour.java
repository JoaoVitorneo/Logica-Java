import java.util.Scanner;

//Escreva uma função que receba dois números inteiros e retorne o menor número.
public class LogicFour {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int num1 = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        int num2 = input.nextInt();

        if(num1 < num2){
            System.out.println("O menor número é: " + num1);
        }else{
            System.out.println("O menor número é: " + num2);
        }

        input.close();

    }
}
