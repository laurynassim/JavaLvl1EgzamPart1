
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {


    private int bendraPajamuSuma;
    private int bendraIslaiduSuma;


    ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();


    ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();


    public ArrayList<PajamuIrasas> getPajamos() {
        return pajamos;
    }

    public void setPajamos(ArrayList<PajamuIrasas> pajamos) {
        this.pajamos = pajamos;
    }

    public ArrayList<IslaiduIrasas> getIslaidos() {
        return islaidos;
    }

    public void setIslaidos(ArrayList<IslaiduIrasas> islaidos) {
        this.islaidos = islaidos;
    }

    public Biudzetas() {
        this.pajamos = pajamos;
        this.islaidos = islaidos;
    }


    public void spausdintiPajamuIrasus() {
        System.out.println("\nPajamų sąrašas: ");
        for (int i = 0; i < pajamos.size(); i++) {
            System.out.printf("%-10s %-20s %-30s %-30s %-20s %-20s",
                    "\nID: " + pajamos.get(i).getId(),
                    "suma: " + pajamos.get(i).getSuma(),
                    "data: " + pajamos.get(i).getData(),
                    "kategorija: " + pajamos.get(i).getKategorija(),
                    "Ar į banką : " + pajamos.get(i).getPozymisArIBanka(),
                    "komentarai: " + pajamos.get(i).getPapildomaInfo());
        }

    }

    public void spausdintiIslaiduIrasus() {
        System.out.println("\nIŠlaidų sąrašas: ");
        for (int i = 0; i < islaidos.size(); i++) {
            System.out.printf("%-10s %-20s %-30s %-30s %-40s %-20s",
                    "\nID: " + islaidos.get(i).getId(),
                    "suma: " + islaidos.get(i).getSuma(),
                    "data: " + islaidos.get(i).getDataSuLaiku(),
                    "kategorija: " + islaidos.get(i).getKategorija(),
                    "metodas: " + islaidos.get(i).getAtsiskaitymoBudas(),
                    "komentarai: " + islaidos.get(i).getPapildomaInfo());
        }
    }

    public float suskaiciuotiVisasPajamas() {
        for (int i = 0; i < pajamos.size(); i++) {
            bendraPajamuSuma += pajamos.get(i).getSuma();
        }
        return bendraPajamuSuma;
    }

    public float suskaiciuotiVisasIslaidas() {
        for (int i = 0; i < islaidos.size(); i++) {
            bendraIslaiduSuma += islaidos.get(i).getSuma();
        }
        return bendraIslaiduSuma;
    }

    public float balansas() {
        return suskaiciuotiVisasPajamas() - suskaiciuotiVisasIslaidas();
    }
}
