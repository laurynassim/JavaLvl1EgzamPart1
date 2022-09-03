
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Biudzetas b1 = new Biudzetas();
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            showCommands();
            String input = sc.nextLine();

            switch (input) {
                case "p" -> {
                    b1.pridetiIrasa(sc);
                }
                case "s" -> {
                    System.out.println(b1.gautiPajamuIrasus());
                }
                case "d" -> {
                    System.out.println(b1.gautiIslaiduIrasus());
                }
                case  "q" ->{
                    b1.gautiIrasus();
                }
                case "w" -> {
                    System.out.println("asas");;
                }
                case "e" -> {
                    isRunning = false;
                }
                default -> {
                    System.out.println("incorrect command input");
                }
            }

        }
        sc.close();
    }

    static void showCommands() {
        System.out.println("\n_____________Pasirinkite__________________________");
        System.out.printf("\n%5s %40s", "[p]", "- pridėti naują įrašą");
        System.out.printf("\n%5s %40s", "[s]", "- spausdinti pajamų įrašus");
        System.out.printf("\n%5s %40s", "[d]", "- spausdinti išlaidų įrašus");
        System.out.printf("\n%5s %40s", "[q]", "- spausdinti visus įrašus");
        System.out.printf("\n%5s %40s", "[e]", "- pabaiga");
        System.out.println("\n________________________________________________");
    }

    static void showRevenueIndexes() {
        System.out.println("_____________įveskite pajamų kategoriją____________");
        System.out.printf("%5s %20s", "[1]", PajamuKategorijos.ATLYGINIMAS);
        System.out.printf("\n%5s %20s", "[2]", PajamuKategorijos.NEKILNOJAMAS_TURTAS);
        System.out.printf("\n%5s %20s", "[3]", PajamuKategorijos.INDELIS);
        System.out.printf("\n%5s %20s", "[4]", PajamuKategorijos.DOVANA);
        System.out.printf("\n%5s %20s", "[5]", PajamuKategorijos.PASKOLA);
        System.out.printf("\n%5s %20s", "[6]", PajamuKategorijos.DIVIDENDAI);
        System.out.printf("\n%5s %20s", "[7]", PajamuKategorijos.LOTERIJA);
        System.out.printf("\n%5s %20s", "[8]", PajamuKategorijos.SUSIGRAZINTI_MOKESCIAI);
        System.out.println("\n_________________________________________________");
    }

    static void showarIbankaIndexes() {
        System.out.println("_____________Ar pajamos į banką?____________");
        System.out.printf("%5s %20s", "[1]", "TAIP/TRUE");
        System.out.printf("\n%5s %20s", "[2]", "NE/FALSE");
        System.out.println("\n___________________________________________");
    }

    static void showAdditionalCommentSelection() {
        System.out.println("_____________Ar norite įvesti papildomus komentarus____________");
        System.out.printf("%5s %20s", "[1]", "TAIP");
        System.out.printf("\n%5s %20s", "[2]", "NE");
        System.out.println("\n______________________________________________________________");
    }

    static void showExpensesIndexes() {
        System.out.println("_____________įveskite Išlaidų kategoriją____________");
        System.out.printf("%5s %20s", "[1]", IslaiduKategorijos.BUSTO_MOKESCIAI);
        System.out.printf("\n%5s %20s", "[2]", IslaiduKategorijos.BUSTO_PASKOLA);
        System.out.printf("\n%5s %20s", "[3]", IslaiduKategorijos.MAISTAS);
        System.out.printf("\n%5s %20s", "[4]", IslaiduKategorijos.TRANSPORTAS_AUTO);
        System.out.printf("\n%5s %20s", "[5]", IslaiduKategorijos.SVEIKATA);
        System.out.printf("\n%5s %20s", "[6]", IslaiduKategorijos.VAIKAI);
        System.out.printf("\n%5s %20s", "[7]", IslaiduKategorijos.GYVŪNAI);
        System.out.printf("\n%5s %20s", "[8]", IslaiduKategorijos.RESTORANAI);
        System.out.printf("\n%5s %20s", "[9]", IslaiduKategorijos.NAMAI);
        System.out.printf("\n%5s %20s", "[10]", IslaiduKategorijos.DOVANOS);
        System.out.printf("\n%5s %20s", "[11]", IslaiduKategorijos.EDUKACIJA);
        System.out.printf("\n%5s %20s", "[12]", IslaiduKategorijos.GROZIS_SPA);
        System.out.printf("\n%5s %20s", "[13]", IslaiduKategorijos.KELIONES);
        System.out.printf("\n%5s %20s", "[14]", IslaiduKategorijos.LAISVALAIKIS);
        System.out.printf("\n%5s %20s", "[15]", IslaiduKategorijos.RUBAI);
        System.out.printf("\n%5s %20s", "[16]", IslaiduKategorijos.SPORTAS);
        System.out.printf("\n%5s %20s", "[17]", IslaiduKategorijos.LABDARA);
        System.out.printf("\n%5s %20s", "[18]", IslaiduKategorijos.DRAUDIMAS);
        System.out.println("\n_________________________________________________");
    }

    static void showAtsiskaitymoBudas() {
        System.out.println("_____________įveskite pajamų kategoriją____________");
        System.out.printf("%5s %20s", "[1]", AtsiskaitymoBudas.BANKINIS_PAVEDIMAS);
        System.out.printf("\n%5s %20s", "[2]", AtsiskaitymoBudas.DEBETINE_KORTELE);
        System.out.printf("\n%5s %20s", "[3]", AtsiskaitymoBudas.GRYNIEJI);
        System.out.printf("\n%5s %20s", "[4]", AtsiskaitymoBudas.KREDITINE_KORTELE);
        System.out.printf("\n%5s %20s", "[5]", AtsiskaitymoBudas.MOKEJIMO_ATIDEJIMAS);
        System.out.println("\n_________________________________________________");
    }

    static void printRevenueOrIncomeSelection(){
        System.out.println("\n_____________Pasirinkite įrašo tipą: __________________________");
        System.out.printf("\n%5s %40s", "[1]", "- pridėti pajamų įrašą");
        System.out.printf("\n%5s %40s", "[2]", "- pridėti išlaidų įrašą");
        System.out.println("\n_________________________________________________________________");
    }
}