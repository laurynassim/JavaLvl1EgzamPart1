
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Biudzetas b1 = new Biudzetas();
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning){
            showCommands();
            String input = sc.nextLine();

            switch (input){
                case "p" -> {
                    b1.pridetiPajamuIrasa();
//
                }
                case "i" ->{
                    b1.pridetiIslaiduIrasa();

                }
                case "s" -> {
                    b1.gautiPajamuIrasa();
                }
                case "d" ->{
                    b1.gautiIslaiduIrasa();
                }
                case "e" ->{
                    isRunning = false;
                }
                default -> {
                    System.out.println("incorrect command input");
                }
            }

        }
        sc.close();
    }
    static void showCommands(){
        System.out.println("_____________Pasirinkite____________");
        System.out.printf("%5s %20s", "[p]", "- pridėti pajamų įrašą");
        System.out.printf("\n%5s %20s", "[i]", "- pridėti išlaidų įrašą");
        System.out.printf("\n%5s %20s", "[s]", "gauti pajamų įrašą");
        System.out.printf("\n%5s %20s", "[d]", "- gauti išlaidų įrašą");
        System.out.printf("\n%5s %20s", "[e]", "- pabaiga");
        System.out.println("\n_____________________________________");
    }
    static void showRevenueIndexes(){
        System.out.println("_____________įveskite pajamų kategoriją____________");
        System.out.printf("%5s %20s", "[1]",  PajamuKategorijos.ATLYGINIMAS);
        System.out.printf("\n%5s %20s", "[2]", PajamuKategorijos.NEKILNOJAMAS_TURTAS);
        System.out.printf("\n%5s %20s", "[3]", PajamuKategorijos.INDELIS);
        System.out.printf("\n%5s %20s", "[4]", PajamuKategorijos.DOVANA);
        System.out.printf("\n%5s %20s", "[5]", PajamuKategorijos.PASKOLA);
        System.out.printf("\n%5s %20s", "[6]", PajamuKategorijos.DIVIDENDAI);
        System.out.printf("\n%5s %20s", "[7]", PajamuKategorijos.LOTERIJA);
        System.out.printf("\n%5s %20s", "[8]", PajamuKategorijos.SUSIGRAZINTI_MOKESCIAI);
        System.out.println("\n_________________________________________________");
    }

    static void showarIbankaIndexes(){
        System.out.println("_____________Ar pajamos į banką?____________");
        System.out.printf("%5s %20s", "[1]",  "TAIP/TRUE");
        System.out.printf("\n%5s %20s", "[2]", "NE/FALSE");
        System.out.println("\n___________________________________________");
    }

    static void showAdditionalCommentSelection(){
        System.out.println("_____________Ar norite įvesti papildomus komentarus____________");
        System.out.printf("%5s %20s", "[1]",  "TAIP");
        System.out.printf("\n%5s %20s", "[2]", "NE");
        System.out.println("\n______________________________________________________________");
    }
}