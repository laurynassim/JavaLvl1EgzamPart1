
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {

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


    public void spausdintiBendraPajamuIrasa() {
        System.out.println(pajamos);
    }


    public void spausdintiBendraIslaiduIrasa() {
        System.out.println(islaidos);
    }


}
