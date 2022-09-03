
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biudzetas {

    ArrayList<Irasas> sarasas= new ArrayList<Irasas>();

    public void pridetiIrasa(Scanner sc){
        Programa.printRevenueOrIncomeSelection();
        int pasirinkimas  = sc.nextInt();
        sc.nextLine();
        switch (pasirinkimas){
            case(1) ->{
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
            case(2) -> {
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

    public void gautiIrasus(){
        for (Irasas irasas: sarasas){
            System.out.println(irasas);
        }
    }


    public Irasas gautiPajamuIrasus(){
        for (Irasas irasas: sarasas){
            if(irasas.getClass().getName().equals("PajamuIrasas")){
                return irasas;
            }
        }

        return null;
    }


    public Irasas gautiIslaiduIrasus(){
        for (Irasas irasas: sarasas){
            if(irasas.getClass().getName().equals("IslaiduIrasas")){
                return irasas;
            }
        }

        return null;
    }

}
