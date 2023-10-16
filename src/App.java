import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){

            System.out.println("Vad är svergies huvudstad?");
            String Stockholm = tangentbord.nextLine();
            System.out.println("Vad heter läraren i webbutveckling?");
            String Johan = tangentbord.nextLine();
            System.out.println("Vilken är världens största religion?");
            String Kristendom = tangentbord.nextLine();
            System.out.println("Vem målade målade Mona lisa");
            String Leaonardo_da_Vinci = tangentbord.nextLine();
            System.out.println("Vad heter Sverige stadsminister?");
            String Ulf_kristersson = tangentbord.nextLine();
            int Poäng = 0;
            if(Stockholm.equalsIgnoreCase("stockholm")){
                Poäng++;
            }
             if(Johan.equalsIgnoreCase("johan")){
                Poäng++;
            }
             if(Kristendom.equalsIgnoreCase("kristendommen")){
                Poäng++;
            }
             if(Leaonardo_da_Vinci.equalsIgnoreCase("Leaonardo da Vinci")){
                Poäng++;
            }
             if(Ulf_kristersson.equalsIgnoreCase("Ulf kristersson")){
                Poäng++;
            }
            System.out.println("du fick "+Poäng+" poäng maxpoäng var 5");


        }
    }
    
}
