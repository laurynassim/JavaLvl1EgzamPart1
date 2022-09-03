import java.text.SimpleDateFormat;
import java.util.Date;

public class Irasas {
    private float suma;
    private String data;
    private String papildomaInfo;
    private static int counter = 0;
    private int id;
    public Irasas() {
        this.id = counter++;
    }


    public Irasas(float suma, String data, String papildomaInfo, int id) {
        this.suma = suma;
        this.data = data;
        this.papildomaInfo = papildomaInfo;
        this.id = id;
    }

    public String setData() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        return formatter.format(date);
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Irasas.counter = counter;
    }

    public int getId() {
        return id;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    @Override
    public String toString() {
        return "Irasas{" +
                "suma=" + suma +
                ", data='" + data + '\'' +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                ", id=" + id +
                '}';
    }

    public void addComments(String komentaras){
        papildomaInfo = komentaras;
    }
}
