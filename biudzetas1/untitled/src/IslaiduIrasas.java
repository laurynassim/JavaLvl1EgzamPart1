
import java.text.SimpleDateFormat;
import java.util.Date;


public class IslaiduIrasas {
    private float suma;
    private String dataSuLaiku;
    private IslaiduKategorijos kategorija;

    private AtsiskaitymoBudas atsiskaitymoBudas;
    private String papildomaInfo;

    private static int counter = 0;

    private int id;

    public IslaiduIrasas() {
        this.id = counter++;
    }
    public int getId() {
        return id;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public void setDataSuLaiku(String dataSuLaiku) {
        this.dataSuLaiku = dataSuLaiku;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        IslaiduIrasas.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }




    public float getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getDataSuLaiku() {
        return dataSuLaiku;
    }

    public String setDataSuLaiku() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        return formatter.format(date);
    }

    public IslaiduKategorijos getKategorija() {
        return kategorija;
    }

    public void setKategorija(IslaiduKategorijos kategorija) {
        this.kategorija = kategorija;
    }

    public AtsiskaitymoBudas getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(AtsiskaitymoBudas atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public void addCommentsPrintLine(int x) {
        if (x == 1) {
            System.out.println("Įveskite papildomą informaciją");
        } else System.out.println("komentarų nėra, spauskite enter norėdami tęsti");
    }


    public void addComments(String komentaras) {
        papildomaInfo = komentaras;
    }

    @Override
    public String toString() {
        return "IslaiduIrasas{" +
                "suma=" + suma +
                ", dataSuLaiku='" + dataSuLaiku + '\'' +
                ", kategorija=" + kategorija +
                ", atsiskaitymoBudas=" + atsiskaitymoBudas +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                ", id=" + id +
                '}';
    }
}
