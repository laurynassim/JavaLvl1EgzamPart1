import java.text.SimpleDateFormat;
import java.util.Date;

public class IslaiduIrasas {
    float suma;
    String dataSuLaiku;
    IslaiduKategorijos kategorija;
    AtsiskaitymoBudas atsiskaitymoBudas;
    String papildomaInfo;

    public IslaiduIrasas() {
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

    @Override
    public String toString() {
        return "IslaiduIrasas{" +
                "suma=" + suma +
                ", dataSuLaiku=" + dataSuLaiku +
                ", kategorija=" + kategorija +
                ", atsiskaitymoBudas=" + atsiskaitymoBudas +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }
}
