public class For {
    public static void main(String[] args) {
        //For tradicionla
        for (int i = 0; i < 100; i++) {
            System.out.println("Repetindo pela " + i + " vez");
        }


        //i++ - > i = i + 1
        //i-- - > i = i - 1
        //i +=2 - > i = i + 2
        //i *=3- > i = i * 3
        //i /= 4 -> i = i / 4
        for (int i = 2; i<=100; i+=2){
            System.out.println(i);
        }


        //For reverso(Decrescente)

        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
