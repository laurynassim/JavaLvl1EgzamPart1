import java.util.HashMap;
import java.util.Map;

public enum PajamuKategorijos {
    ATLYGINIMAS(1),
    NEKILNOJAMAS_TURTAS(2),
    INDELIS(3),
    DOVANA(4),
    PASKOLA(5),
    DIVIDENDAI(6),
    LOTERIJA(7),
    SUSIGRAZINTI_MOKESCIAI(8);

    private int value;

    private PajamuKategorijos(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public static PajamuKategorijos getKategorijaById(int id){
        for(PajamuKategorijos kategorija : PajamuKategorijos.values()){
            if(kategorija.getValue()==id){
                return kategorija;
            }
        }
        return null;
    }

}



