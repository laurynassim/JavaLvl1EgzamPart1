
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
            System.out.printf("%-20s %-30s %-40s %-20s %-20s",
                    "\nsuma: " + pajamos.get(i).suma,
                    "data: " + pajamos.get(i).data,
                    "kategorija: " + pajamos.get(i).kategorija,
                    "Ar į banką : " + pajamos.get(i).pozymisArIBanka,
                    "komentarai: " + pajamos.get(i).papildomaInfo);
        }

    }

    public void spausdintiIslaiduIrasus() {
        System.out.println("\nIŠlaidų sąrašas: ");
        for (int i = 0; i < islaidos.size(); i++) {
            System.out.printf("%-20s %-30s %-30s %-40s %-20s",
                    "\nsuma: " + islaidos.get(i).suma,
                    "data: " + islaidos.get(i).dataSuLaiku,
                    "kategorija: " + islaidos.get(i).kategorija,
                    "metodas: " + islaidos.get(i).atsiskaitymoBudas,
                    "komentarai: " + islaidos.get(i).papildomaInfo);
        }
    }

    public float suskaiciuotiVisasPajamas() {
        for (int i = 0; i < pajamos.size(); i++) {
            bendraPajamuSuma += pajamos.get(i).suma;
        }
        return bendraPajamuSuma;
    }

    public float suskaiciuotiVisasIslaidas() {
        for (int i = 0; i < islaidos.size(); i++) {
            bendraIslaiduSuma += islaidos.get(i).suma;
        }
        return bendraIslaiduSuma;
    }

    public float balansas() {
        return suskaiciuotiVisasPajamas() - suskaiciuotiVisasIslaidas();
    }
}
