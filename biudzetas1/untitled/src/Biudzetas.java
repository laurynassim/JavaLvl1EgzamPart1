
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
        for (PajamuIrasas irasas: pajamos) {
            System.out.printf("%-10s %-20s %-30s %-30s %-20s %-20s",
                    "\nID: " + irasas.getId(),
                    "suma: " + irasas.getSuma(),
                    "data: " + irasas.getData(),
                    "kategorija: " + irasas.getKategorija(),
                    "Ar į banką : " + irasas.getPozymisArIBanka(),
                    "komentarai: " + irasas.getPapildomaInfo());
        }

    }

    public void spausdintiIslaiduIrasus() {
        System.out.println("\nIŠlaidų sąrašas: ");
        for (IslaiduIrasas irasas: islaidos) {
            System.out.printf("%-10s %-20s %-30s %-30s %-40s %-20s",
                    "\nID: " + irasas.getId(),
                    "suma: " + irasas.getSuma(),
                    "data: " + irasas.getDataSuLaiku(),
                    "kategorija: " + irasas.getKategorija(),
                    "metodas: " + irasas.getAtsiskaitymoBudas(),
                    "komentarai: " + irasas.getPapildomaInfo());
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

    public void pasalintiPajamuIrasa(int id){
        for(PajamuIrasas irasas: pajamos){
            if(irasas.getId()==id){
                pajamos.remove(irasas);
            }
        }
    }
    public void pasalintiIslaiduIrasa(int id){
        for (IslaiduIrasas irasas: islaidos){
            if(irasas.getId()==id){
                islaidos.remove(irasas);
            }
        }
    }
}
