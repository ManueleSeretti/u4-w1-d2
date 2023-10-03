import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String str = input.nextLine();
        suddividiStringa(str);
    }
    public static void suddividiStringa(String str){
        int i=0;
        while(i<str.length()){

            String carattere = String.valueOf(str.charAt(i));

            if(carattere.equals("q")){
                break;
            }else  {System.out.println(carattere+",");
            i++;}

        }
    }
}
