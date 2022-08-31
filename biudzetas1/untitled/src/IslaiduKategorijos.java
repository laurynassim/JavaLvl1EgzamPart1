import java.util.HashMap;
import java.util.Map;

public enum IslaiduKategorijos {
    BUSTO_PASKOLA(2),
    BUSTO_MOKESCIAI(1),
    MAISTAS(3),
    TRANSPORTAS_AUTO(4),
    SVEIKATA(5),
    VAIKAI(6),
    GYVŪNAI(7),
    RESTORANAI(8),
    NAMAI(9),
    DOVANOS(10),
    EDUKACIJA(11),
    GROZIS_SPA(12),
    KELIONES(13),
    LAISVALAIKIS(14),
    RUBAI(15),
    SPORTAS(16),
    LABDARA(17),
    DRAUDIMAS(18);


    private int value;

    private static final Map map = new HashMap<>();

    private IslaiduKategorijos(int value){
        this.value = value;
    }

    static{
        for (IslaiduKategorijos islaiduKategorijos : IslaiduKategorijos.values()){
            map.put(islaiduKategorijos.value, islaiduKategorijos);
        }
    }

    public static IslaiduKategorijos valueOf(int islaiduIndeksas) {
        return (IslaiduKategorijos) map.get(islaiduIndeksas);
    }

    public int getValue(){
        return value;
    }

}
