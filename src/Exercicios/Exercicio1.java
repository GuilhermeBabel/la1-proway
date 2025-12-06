package Exercicios;

/*
Faça dois scripts que mostrem a mensagem "Olá mundo!"
10 vezes na tela. Utilize uma estrutura de repetição diferente em cada um dos scripts (for e while).
 */

public class Exercicio1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i +" Olá mundo! - For");

        }



        int i = 1;
        while (i <= 10){
            System.out.println(i + " Olá mundo - While ");
            i++;
        }
    }
}
