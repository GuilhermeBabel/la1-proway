import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        //Saber o número é par:
        //15 % 2 =
        //  15 | 2
        // -14  7
        //  1 - > Esse é o resto

        //15 % 2 != 0 -> Ímpar

        while (num % 2 == 0){
            System.out.println("O número par: " + num);
            System.out.println("Digite um número ar para continuar ou um número impar para parar: ");
            num = Integer.parseInt(sc.nextLine()); //Conversão de um tipo string para inteiro = "123" -> 123
        }

        System.out.println("O número impar que parou o código foi: " + num);

        sc.close();
    }
}
