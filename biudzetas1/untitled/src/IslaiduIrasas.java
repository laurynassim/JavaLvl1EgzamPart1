import java.util.Date;

public class IslaiduIrasas {
    float suma;
    Date dataSuLaiku;
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

    public Date getDataSuLaiku() {
        return dataSuLaiku;
    }

    public void setDataSuLaiku(Date dataSuLaiku) {
        this.dataSuLaiku = dataSuLaiku;
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
