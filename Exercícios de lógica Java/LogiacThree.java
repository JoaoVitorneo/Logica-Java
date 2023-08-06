//Faça um program que o usuário informe 1 valor e retorne a quinta parte deste valor.
import java.util.Scanner;

public class LogiacThree {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int num1 = input.nextInt();
        int quintaParte = num1/5;
        System.out.println("A quinta parte deste valor é: " + quintaParte);

        input.close();
    }
}
