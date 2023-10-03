import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int n = Integer.parseInt(input.nextLine());
        stampaInLettere(n);
        input.close();
    }
    public static void stampaInLettere(int num){
        switch (num){
            case 1: {
                System.out.println("il numero inserito è uno");
                break;
            }case 2: {
                System.out.println("il numero inserito è due");
                break;
            }case 3: {
                System.out.println("il numero inserito è tre");
                break;
            }
            default:
                System.out.println("il numero inserito è superiore a 3");
        }
    }
}
