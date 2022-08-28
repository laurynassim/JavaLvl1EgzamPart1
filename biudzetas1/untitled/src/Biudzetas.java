import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];


    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

     private int totalRevenueCount = 0;


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

    public void pridetiPajamuIrasa(){
//        PajamuIrasas pajamuIrasas = new PajamuIrasas();
//        Scanner ri = new Scanner(System.in);
        pajamos[totalRevenueCount] = new PajamuIrasas(58.9f,LocalDateTime.now(), PajamuKategorijos.LOTERIJA, true, "nera info");
        totalRevenueCount++;
//        pajamos[1] = new PajamuIrasas(58.9f,LocalDateTime.now(), PajamuKategorijos.LOTERIJA, true, "nera info");
//        System.out.println("įveskite Pajamų įrašo suma");
//        pajamuIrasas.suma =ri.nextFloat();
//        pajamuIrasas.data = LocalDateTime.now();
//        System.out.println(pajamuIrasas.toString());
//        System.out.println("Iveskite pajamu kategotija");
//        Programa.showRevenueIndexes();
//        int pajamuKategorija = ri.nextInt();
//        switch (pajamuKategorija){
//            case(1) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.ATLYGINIMAS;
//            }
//            case(2) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.NEKILNOJAMAS_TURTAS;
//            }
//            case(3) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.INDELIS;
//            }
//            case(4) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.DOVANA;
//            }
//            case(5) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.PASKOLA;
//            }
//            case(6) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.DIVIDENDAI;
//            }
//            case(7) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.LOTERIJA;
//            }
//            case(8) ->{
//                pajamuIrasas.kategorija  = PajamuKategorijos.SUSIGRAZINTI_MOKESCIAI;
//            }
//            default -> {
//                System.out.println("įvesta kategotija neegzistuoja");
//            }
//        }
//        System.out.println(pajamuIrasas.toString());
//        Programa.showarIbankaIndexes();
//
//        int ibanka  = ri.nextInt();
//
//        switch (ibanka){
//            case(1) ->{
//                pajamuIrasas.pozymisArIBanka = true;
//            }
//            case (2) ->{
//                pajamuIrasas.pozymisArIBanka = false;
//            }
//        }
//
//        System.out.println(pajamuIrasas.toString());
////        ri.close();
//        Programa.showAdditionalCommentSelection();
//        int komentarai = ri.nextInt();
//        switch (komentarai){
//            case (1) ->{
//                System.out.println("Įveskite komentarą: ");
//                String comment  = ri.next();
//                pajamuIrasas.papildomaInfo  = comment;
//                System.out.println(pajamuIrasas.toString());
//            }
//            case (2) ->{
//                System.out.println();
//                System.out.println(pajamuIrasas.toString());
//            }
//        }
////        ri.close();
//        System.out.println(pajamos);
    };

    public void pridetiIslaiduIrasa(){
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas();
        System.out.println("islaidu irasas)");
    };

    public void gautiPajamuIrasa(){
        for (int i = 0; i < pajamos.length ; i++) {
            System.out.println(pajamos[i]);
        }
    };

    public void gautiIslaiduIrasa(){
        System.out.println("gauti islaidas");
    };
}
