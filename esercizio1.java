import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String str = input.nextLine();
        boolean risultato=stringaPariDispari(str);
        System.out.println(risultato);
        System.out.println("inserisci un anno");
        int anno = Integer.parseInt(input.nextLine());
        boolean isBisestile=annoBisestile(anno);
        System.out.println(isBisestile);

input.close();

    }
    public static boolean stringaPariDispari(String str){
        if(str.length()%2==0){
            return true;
        }else {return false;}
    }
    public static boolean annoBisestile(int year){
        if(year%100==0 && year%400==0){
            return true;

        }else if(year%4 == 0){
            return true;
        }else return false;

    }
}
