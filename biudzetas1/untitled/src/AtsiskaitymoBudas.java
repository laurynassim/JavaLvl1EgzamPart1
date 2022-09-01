import java.util.HashMap;
import java.util.Map;

public enum AtsiskaitymoBudas {
    BANKINIS_PAVEDIMAS(1),
    GRYNIEJI(3),
    KREDITINE_KORTELE(4),
    DEBETINE_KORTELE(2),
    MOKEJIMO_ATIDEJIMAS(5);

    private int value;
    private static final Map map = new HashMap<>();

    private AtsiskaitymoBudas(int value) {
        this.value = value;
    }

    static{
        for (AtsiskaitymoBudas atsiskaitymobudas : AtsiskaitymoBudas.values()){
            map.put(atsiskaitymobudas.value, atsiskaitymobudas);
        }
    }

    public static AtsiskaitymoBudas valueOf(int budas) {
        return(AtsiskaitymoBudas) map.get(budas);
    }

    public int getValue(){
        return value;
    }


}
