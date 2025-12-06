package Exercicios;

/*
Elabore três scripts que mostrem a mensagem "Estou aparecendo pela <numero_de_vezes> na tela!" 10 vezes. Substitua <numero_de_vezes>
pela iteração atual do loop. Utilize uma estrutura de repetição diferente em cada um dos scripts (for e while).
 */

public class Exercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Estou aparecendo pela " + (i + 1) + " vezes - FOR ");
        }


        int i = 0;
        while (i <= 10){
            System.out.println("Estou aparecendo pela " + (i + 1) + " vezes - While ");
            i++;
        }

        i = 1;

        do {
            System.out.println("Estou aparecendo pela " + i + " vezes - Do While ");
            i++;
        }while (i <= 10);

    }
}
