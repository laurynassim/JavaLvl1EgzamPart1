import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];


    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

     private int totalRevenueListCount = 0;


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
        Scanner ri = new Scanner(System.in);
        pajamos[totalRevenueListCount] = new PajamuIrasas();
        System.out.println("įveskite Pajamų įrašo sumą");
        pajamos[totalRevenueListCount].suma = ri.nextFloat();
        pajamos[totalRevenueListCount].data = pajamos[totalRevenueListCount].setData();
        System.out.println("Iveskite pajamu kategotija");
        Programa.showRevenueIndexes();
                int pajamuKategorija = ri.nextInt();
        switch (pajamuKategorija){
            case(1) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.ATLYGINIMAS;
            }
            case(2) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.NEKILNOJAMAS_TURTAS;
            }
            case(3) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.INDELIS;
            }
            case(4) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.DOVANA;
            }
            case(5) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.PASKOLA;
            }
            case(6) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.DIVIDENDAI;
            }
            case(7) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.LOTERIJA;
            }
            case(8) ->{
                pajamos[totalRevenueListCount].kategorija  = PajamuKategorijos.SUSIGRAZINTI_MOKESCIAI;
            }
            default -> {
                System.out.println("įvesta kategotija neegzistuoja");
            }
        }

        Programa.showarIbankaIndexes();
//
        int ibanka  = ri.nextInt();

        switch (ibanka){
            case(1) ->{
                pajamos[totalRevenueListCount].pozymisArIBanka = true;
            }
            case (2) ->{
                pajamos[totalRevenueListCount].pozymisArIBanka = false;
            }
        }
//
        Programa.showAdditionalCommentSelection();
        int komentarai = ri.nextInt();
        switch (komentarai){
            case (1) ->{
                ri.nextLine();
                System.out.println("Įveskite komentarą: ");
                pajamos[totalRevenueListCount].papildomaInfo  = ri.nextLine();
                System.out.println(pajamos[totalRevenueListCount]);
            }
            case (2) ->{
                System.out.println();
                System.out.println(pajamos[totalRevenueListCount]);
            }
        }


        totalRevenueListCount++;

        System.out.println( "Jūsų įrašas: " + pajamos[totalRevenueListCount]);
    };

    public void pridetiIslaiduIrasa(){
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas();
        System.out.println("islaidu irasas)");
    };

    public void gautiPajamuIrasa(){
        for (int i = 0; i < pajamos.length ; i++) {
            if(pajamos[i] != null)
            System.out.println(pajamos[i]);
        }
    };

    public void gautiIslaiduIrasa(){
        System.out.println("gauti islaidas");
    };
}
