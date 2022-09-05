
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biudzetas {

    ArrayList<Irasas> sarasas = new ArrayList<Irasas>();

    public void pridetiIrasa(Scanner sc) {
        Programa.printRevenueOrIncomeSelection();
        int pasirinkimas = sc.nextInt();
        sc.nextLine();
        switch (pasirinkimas) {
            case (1) -> {
                PajamuIrasas pi = new PajamuIrasas();
                System.out.println("įveskite Pajamų įrašo sumą");
                pi.setSuma(sc.nextFloat());
                pi.setData(pi.setData());
                System.out.println("Iveskite pajamu kategoriją");
                Programa.showRevenueIndexes();
                int pajamuKategorija = sc.nextInt();
                PajamuKategorijos pk = PajamuKategorijos.getKategorijaById(pajamuKategorija);
                pi.setKategorija(pk);
                Programa.showarIbankaIndexes();
                int ariBanka = sc.nextInt();
                pi.checkIfToBank(ariBanka);
                Programa.showAdditionalCommentSelection();
                int komentarai = sc.nextInt();
                sc.nextLine();
                pi.addCommentsPrintLine(komentarai);
                String papildomaInfo = sc.nextLine();
                pi.addComments(papildomaInfo);
                System.out.println(pi);
                sarasas.add(pi);
            }
            case (2) -> {
                IslaiduIrasas ii = new IslaiduIrasas();
                System.out.println("Įveskite Išlaidų įrašo sumą: ");
                ii.setSuma(sc.nextFloat());
                ii.setData(ii.setData());
                Programa.showExpensesIndexes();
                int islaiduKategorija = sc.nextInt();
                IslaiduKategorijos ik = IslaiduKategorijos.valueOf(islaiduKategorija);
                ii.setKategorija(ik);
                Programa.showAtsiskaitymoBudas();
                System.out.println("įveskite atsiskaitymo būdą: ");
                int atsiskaitymoBudas = sc.nextInt();
                AtsiskaitymoBudas ab = AtsiskaitymoBudas.valueOf(atsiskaitymoBudas);
                ii.setAtsiskaitymoBudas(ab);
                Programa.showAdditionalCommentSelection();
                int komentarai = sc.nextInt();
                sc.nextLine();
                ii.addCommentsPrintLine(komentarai);
                String papildomaInfo = sc.nextLine();
                ii.addComments(papildomaInfo);
                System.out.println(ii);
                sarasas.add(ii);
            }
            default -> {
                System.out.println("įvesties klaida");
            }
        }


    }

    public void gautiIrasus() {
        for (Irasas irasas : sarasas) {
            System.out.println(irasas);
        }
    }


    public void spausdintiPajamuIrasus() {
        for (Irasas irasas : sarasas) {
            if (irasas.getClass().getName().equals("PajamuIrasas")) {
                System.out.println(irasas);
            }
        }
    }

    public void spausdintiIslaiduIrasus() {
        for (Irasas irasas : sarasas) {
            if (irasas.getClass().getName().equals("IslaiduIrasas")) {
                System.out.println(irasas);
            }
        }
    }


    public ArrayList<PajamuIrasas> gautiPajamuIrasus() {
        ArrayList<PajamuIrasas> filtruotaspajamuSarasas = new ArrayList<>();
        for (Irasas irasas : sarasas) {
            filtruotaspajamuSarasas.add((PajamuIrasas) irasas);
        }
        return filtruotaspajamuSarasas;
    }

    public ArrayList<IslaiduIrasas> gautiIslaiduIrasus() {
        ArrayList<IslaiduIrasas> filtruotasIslaiduSaraas = new ArrayList<>();
        for (Irasas irasas : sarasas) {
            filtruotasIslaiduSaraas.add((IslaiduIrasas) irasas);
        }

        return filtruotasIslaiduSaraas;
    }


    void atnaujintiIrasa(Irasas irasas) {

    }

    public Irasas pasirinktiIrasa(int id) {
        for (Irasas irasas : sarasas) {
            if (irasas.getId() == id) {
                return irasas;
            }
        }
        return null;
    }

    public void keistiPajamuIrasoSuma(PajamuIrasas irasas, Scanner sc) {
        System.out.println("ar norite koreguoti įrašo sumą?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Įveskite naują sumą:");
            float suma = sc.nextFloat();
            irasas.setSuma(suma);
            System.out.println("Pakoreguotas įrašas:" + irasas);
        } else {
            System.out.println("Įrašo suma nepakeista");
        }
    }

    public void keistiPajamuIrasoKategorija(PajamuIrasas irasas, Scanner sc) {
        System.out.println("ar norite keisti pajamų įrašo kategoriją?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            Programa.showRevenueIndexes();
            int pajamuKategorija = sc.nextInt();
            PajamuKategorijos pk = PajamuKategorijos.getKategorijaById(pajamuKategorija);
            irasas.setKategorija(pk);
            System.out.println("pakoreguotas įrašas: " + irasas);
        } else {
            System.out.println("Įrašo kategorija nepakeista");
        }
    }


    public void keistiPajamuIrasoPozymi(PajamuIrasas irasas, Scanner sc) {
        System.out.println("Ar norite keisti pajamų įrašo požymį?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            Programa.showarIbankaIndexes();
            int ariBanka = sc.nextInt();
            irasas.checkIfToBank(ariBanka);
            System.out.println("pakoreguotas įrašas: " + irasas);
        } else {
            System.out.println("Įrašo požymis  nepakeistas");
        }
    }

    public void keistiPajamuIrasoKomentarus(PajamuIrasas irasas, Scanner sc) {
        System.out.println("Ar norite pakeisti Įrašo komentarus?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Įveskite naują komentarą: ");
            sc.nextLine();
            String papildomaInfo = sc.nextLine();
            irasas.setPapildomaInfo(papildomaInfo);
            System.out.println("pakoreguotas įrašas: " + irasas);
        } else {
            System.out.println("Įrašo komentarai nepakeisti");
        }
    }

    public void keistiIslaiduIrasoSuma(IslaiduIrasas irasas, Scanner sc) {
        System.out.println("ar norite koreguoti įrašo sumą?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Įveskite naują sumą: ");
            float suma = sc.nextFloat();
            irasas.setSuma(suma);
            System.out.println("Pakoreguotas įrašas:" + irasas);
        } else {
            System.out.println("Įrašo suma nepakeista");
        }
    }

    public void keistiIslaiduIrasoKategorija(IslaiduIrasas irasas, Scanner sc) {
        System.out.println("Ar norite koreguoti išlaidų kategoriją?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            Programa.showExpensesIndexes();
            System.out.println("Įveskite naują kategoriją");
            int islaiduKategorija = sc.nextInt();
            IslaiduKategorijos ik = IslaiduKategorijos.valueOf(islaiduKategorija);
            irasas.setKategorija(ik);
            System.out.println("Pakoreguotas įrašas:" + irasas);
        } else {
            System.out.println("išlaidų kategorija nepakeista");
        }
    }

    public void keistiIslaiduIrasoAtsiskaitymoBuda(IslaiduIrasas irasas, Scanner sc) {
        System.out.println("ar norite koreguoti atsiskaitymo metodą?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if (choice == 1) {
            Programa.showAtsiskaitymoBudas();
            System.out.println("įveskite atsiskaitymo būdą: ");
            int atsiskaitymoBudas = sc.nextInt();
            AtsiskaitymoBudas ab = AtsiskaitymoBudas.valueOf(atsiskaitymoBudas);
            irasas.setAtsiskaitymoBudas(ab);
            System.out.println("Pakoreguotas įrašas:" + irasas);
        } else {
            System.out.println("išlaidų kategorija nepakeista");
        }
    }

    public void keistiIslaiduIrasoKomentarus(IslaiduIrasas irasas, Scanner sc){
        System.out.println("ar norite įvesti naujus komentarus šiam įrašui?");
        Programa.printEditSelection();
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Įveskite naują komentarą: ");
            sc.nextLine();
            String papildomaInfo = sc.nextLine();
            irasas.setPapildomaInfo(papildomaInfo);
            System.out.println("pakoreguotas įrašas: " + irasas);
        }else {
            System.out.println("komentarai nepakeisti");
        }
    }

    public boolean isRevenue(int id) {
        for (Irasas irasas : sarasas) {
            if (irasas.getClass().getName().equals("PajamuIrasas") && (irasas.getId() == id)) {
                return true;
            }
        }
        return false;
    }

    public PajamuIrasas filtruotiPajamasPagalId(int id) {
        PajamuIrasas pi = new PajamuIrasas();
        for (Irasas irasas : sarasas) {
            if (irasas.getClass().getName().equals("PajamuIrasas") && (irasas.getId() == id)) {
                return pi = (PajamuIrasas) irasas;
            }
        }
        return null;
    }


    public IslaiduIrasas filtruotiIslaidaspagalId(int id) {
        IslaiduIrasas ii = new IslaiduIrasas();
        for (Irasas irasas : sarasas) {
            if (irasas.getClass().getName().equals("IslaiduIrasas") && (irasas.getId() == id)) {
                return ii = (IslaiduIrasas) irasas;
            }
        }
        return null;
    }
}
