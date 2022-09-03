
import java.text.SimpleDateFormat;
import java.util.Date;


public class IslaiduIrasas extends Irasas {

    private IslaiduKategorijos kategorija;

    private AtsiskaitymoBudas atsiskaitymoBudas;

    public IslaiduIrasas() {
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


    public void addCommentsPrintLine(int x) {
        if (x == 1) {
            System.out.println("Įveskite papildomą informaciją");
        } else System.out.println("komentarų nėra, spauskite enter norėdami tęsti");
    }




    @Override
    public String toString() {
        return "IslaiduIrasas{" +
                "ID: " + getId() +
                ", suma: " + getSuma() +
                ", data: " + getData() +
                ", kategorija=" + getKategorija() +
                ", atsiskaitymoBudas=" + getAtsiskaitymoBudas() +
                ", komentarai: " + getPapildomaInfo() +
                '}';
    }
}
