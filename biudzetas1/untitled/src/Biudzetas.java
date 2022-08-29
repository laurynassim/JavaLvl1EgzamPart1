
import java.util.Scanner;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];


    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    private int totalRevenueListCount = 0;
    private int totalExpensesListCount = 0;


    public Biudzetas() {
        this.pajamos = pajamos;
        this.islaidos = islaidos;
    }

    public PajamuIrasas[] getPajamos() {
        return pajamos;
    }

    public void setPajamos(PajamuIrasas[] pajamos) {
        this.pajamos = pajamos;
    }

    public IslaiduIrasas[] getIslaidos() {
        return islaidos;
    }

    public void setIslaidos(IslaiduIrasas[] islaidos) {
        this.islaidos = islaidos;
    }

    public void pridetiPajamuIrasa() {
        Scanner ri = new Scanner(System.in);
        pajamos[totalRevenueListCount] = new PajamuIrasas();
        System.out.println("įveskite Pajamų įrašo sumą");
        pajamos[totalRevenueListCount].suma = ri.nextFloat();
        pajamos[totalRevenueListCount].data = pajamos[totalRevenueListCount].setData();
        System.out.println("Iveskite pajamu kategotija");
        Programa.showRevenueIndexes();
        int pajamuKategorija = ri.nextInt();
        switch (pajamuKategorija) {
            case (1) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.ATLYGINIMAS;
            }
            case (2) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.NEKILNOJAMAS_TURTAS;
            }
            case (3) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.INDELIS;
            }
            case (4) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.DOVANA;
            }
            case (5) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.PASKOLA;
            }
            case (6) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.DIVIDENDAI;
            }
            case (7) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.LOTERIJA;
            }
            case (8) -> {
                pajamos[totalRevenueListCount].kategorija = PajamuKategorijos.SUSIGRAZINTI_MOKESCIAI;
            }
            default -> {
                System.out.println("įvesta kategorija neegzistuoja");
            }
        }

        Programa.showarIbankaIndexes();
//
        int ibanka = ri.nextInt();

        switch (ibanka) {
            case (1) -> {
                pajamos[totalRevenueListCount].pozymisArIBanka = true;
            }
            case (2) -> {
                pajamos[totalRevenueListCount].pozymisArIBanka = false;
            }
        }
//
        Programa.showAdditionalCommentSelection();
        int komentarai = ri.nextInt();
        switch (komentarai) {
            case (1) -> {
                ri.nextLine();
                System.out.println("Įveskite komentarą: ");
                pajamos[totalRevenueListCount].papildomaInfo = ri.nextLine();
                System.out.println(pajamos[totalRevenueListCount]);
            }
            case (2) -> {
                System.out.println();
                System.out.println(pajamos[totalRevenueListCount]);
            }
        }

        totalRevenueListCount++;
    }




    public void pridetiIslaiduIrasa() {
        Scanner ei = new Scanner(System.in);
        islaidos[totalExpensesListCount] = new IslaiduIrasas();
        System.out.println("Įveskite Išlaidų įrašo sumą: ");
        islaidos[totalExpensesListCount].suma = ei.nextFloat();
        islaidos[totalExpensesListCount].dataSuLaiku = islaidos[totalExpensesListCount].setDataSuLaiku();
        System.out.println("Įveskite išlaidų kategoriją");
        Programa.showExpensesIndexes();
        int islaiduKategorija = ei.nextInt();
        switch (islaiduKategorija) {
            case (1) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.BUSTO_MOKESCIAI;
            }
            case (2) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.BUSTO_PASKOLA;
            }
            case (3) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.MAISTAS;
            }
            case (4) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.TRANSPORTAS_AUTO;
            }
            case (5) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.SVEIKATA;
            }
            case (6) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.VAIKAI;
            }
            case (7) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.GYVŪNAI;
            }
            case (8) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.RESTORANAI;
            }
            case (9) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.NAMAI;
            }
            case (10) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.DOVANOS;
            }
            case (11) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.EDUKACIJA;
            }
            case (12) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.GROZIS_SPA;
            }
            case (13) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.KELIONES;
            }
            case (14) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.LAISVALAIKIS;
            }
            case (15) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.RUBAI;
            }
            case (16) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.SPORTAS;
            }
            case (17) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.LABDARA;
            }
            case (18) -> {
                islaidos[totalExpensesListCount].kategorija = IslaiduKategorijos.DRAUDIMAS;
            }
            default -> System.out.println("įvesta kategorija neegzistuoja");
        }

        Programa.showAtsiskaitymoBudas();
        System.out.println("Įveskite atsiskaitymo metodą: ");

        int atsiskaitymoMetodas = ei.nextInt();

        switch (atsiskaitymoMetodas) {
            case (1) -> {
                islaidos[totalExpensesListCount].atsiskaitymoBudas = AtsiskaitymoBudas.BANKINIS_PAVEDIMAS;
            }
            case (2) -> {
                islaidos[totalExpensesListCount].atsiskaitymoBudas = AtsiskaitymoBudas.DEBETINE_KORTELE;
            }
            case (3) -> {
                islaidos[totalExpensesListCount].atsiskaitymoBudas = AtsiskaitymoBudas.GRYNIEJI;
            }
            case (4) -> {
                islaidos[totalExpensesListCount].atsiskaitymoBudas = AtsiskaitymoBudas.KREDITINE_KORTELE;
            }
            case (5) -> {
                islaidos[totalExpensesListCount].atsiskaitymoBudas = AtsiskaitymoBudas.MOKEJIMO_ATIDEJIMAS;
            }
        }

        Programa.showAdditionalCommentSelection();
        int komentarai = ei.nextInt();
        switch (komentarai) {
            case (1) -> {
                ei.nextLine();
                System.out.println("Įveskite komentarą: ");
                islaidos[totalExpensesListCount].papildomaInfo = ei.nextLine();
                System.out.println(islaidos[totalExpensesListCount]);
            }
            case (2) -> {
                System.out.println(islaidos[totalExpensesListCount]);
            }
        }

        totalExpensesListCount++;

    }

    ;

    public void gautiPajamuIrasa() {
        for (int i = 0; i < pajamos.length; i++) {
            if (pajamos[i] != null)
                System.out.println(pajamos[i]);
        }
    }



    public void gautiIslaiduIrasa() {
        for (int i = 0; i < islaidos.length; i++) {
            if (islaidos[i] != null)
                System.out.println(islaidos[i]);
        }
    }


}
