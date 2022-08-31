
import java.util.Scanner;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];


    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    public int totalRevenueListCount = 0;
    public int totalExpensesListCount = 0;


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


    public void spausdintiBendraPajamuIrasa() {
        for (int i = 0; i < pajamos.length; i++) {
            if (pajamos[i] != null)
                System.out.println(pajamos[i]);
        }
    }


    public void spausdintiBendraIslaiduIrasa() {
        for (int i = 0; i < islaidos.length; i++) {
            if (islaidos[i] != null)
                System.out.println(islaidos[i]);
        }
    }


}
