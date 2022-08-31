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
    private static final Map map = new HashMap<>();

    private PajamuKategorijos(int value) {
        this.value = value;
    }

    static {
        for (PajamuKategorijos pajamuKategorijos : PajamuKategorijos.values()) {
            map.put(pajamuKategorijos.value, pajamuKategorijos);
        }
    }

    public static PajamuKategorijos valueOf(int pajamuIndeksas) {
        return (PajamuKategorijos) map.get(pajamuIndeksas);
    }

    public int getValue() {
        return value;
    }
}



