
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
                    PajamuIrasas pi = new PajamuIrasas();
                    System.out.println("įveskite Pajamų įrašo sumą");
                    pi.suma = sc.nextFloat();
                    pi.data = pi.setData();
                    System.out.println("Iveskite pajamu kategoriją");
                    showRevenueIndexes();
                    int pajamuKategorija = sc.nextInt();
                    PajamuKategorijos pk = PajamuKategorijos.valueOf(pajamuKategorija);
                    pi.kategorija = pk;
                    showarIbankaIndexes();
                    int ariBanka = sc.nextInt();
                    pi.checkIfToBank(ariBanka);
                    showAdditionalCommentSelection();
                    int komentarai = sc.nextInt();
                    sc.nextLine();
                    pi.addCommentsPrintLine(komentarai);
                    String papildomaInfo = sc.nextLine();
                    pi.addComments(papildomaInfo);
                    System.out.println(pi);
                    b1.pajamos.add(pi);
                }
                case "i" -> {
                    IslaiduIrasas ii = new IslaiduIrasas();
                    System.out.println("Įveskite Išlaidų įrašo sumą: ");
                    ii.suma = sc.nextFloat();
                    ii.dataSuLaiku = ii.setDataSuLaiku();
                    showExpensesIndexes();
                    int islaiduKategorija = sc.nextInt();
                    IslaiduKategorijos ik = IslaiduKategorijos.valueOf(islaiduKategorija);
                    ii.kategorija = ik;
                    showAtsiskaitymoBudas();
                    System.out.println("įveskite atsiskaitymo būdą: ");
                    int atsiskaitymoBudas = sc.nextInt();
                    AtsiskaitymoBudas ab = AtsiskaitymoBudas.valueOf(atsiskaitymoBudas);
                    ii.atsiskaitymoBudas = ab;
                    showAdditionalCommentSelection();
                    int komentarai = sc.nextInt();
                    sc.nextLine();
                    ii.addCommentsPrintLine(komentarai);
                    String papildomaInfo = sc.nextLine();
                    ii.addComments(papildomaInfo);
                    System.out.println(ii);
                    b1.islaidos.add(ii);
                }
                case "s" -> {
                    b1.spausdintiBendraPajamuIrasa();
                }
                case "d" -> {
                    b1.spausdintiBendraIslaiduIrasa();
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
        System.out.println("_____________Pasirinkite__________________________");
        System.out.printf("%5s %40s", "[p]", "- pridėti pajamų įrašą");
        System.out.printf("\n%5s %40s", "[i]", "- pridėti išlaidų įrašą");
        System.out.printf("\n%5s %40s", "[s]", "- spausdinti bendrą pajamų sarašą");
        System.out.printf("\n%5s %40s", "[d]", "- spausdinti bendrą išlaidų įrašą");
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
        System.out.println("_____________įveskite pajamų kategoriją____________");
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
}