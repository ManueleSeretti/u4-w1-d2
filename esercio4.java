import java.util.Scanner;

public class esercio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("inserisci un numero per far partire il conto alla rovescia");
        int counter = Integer.parseInt(input.nextLine());
        countDown(counter);
        input.close();
    }
    public static void countDown(int n){
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
}
