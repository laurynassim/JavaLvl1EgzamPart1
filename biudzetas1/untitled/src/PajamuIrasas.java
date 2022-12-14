import java.text.SimpleDateFormat;
import java.util.Date;

public class PajamuIrasas {
    float suma;
    String data;
    PajamuKategorijos kategorija;
    Boolean pozymisArIBanka;
    String papildomaInfo;


    public PajamuIrasas() {
    }

    public PajamuIrasas(float suma, String data, PajamuKategorijos kategorija, Boolean pozymisArIBanka, String papildomaInfo) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
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

    public String setData() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        return formatter.format(date);
    }

    public PajamuKategorijos getKategorija() {
        return kategorija;
    }

    public void setKategorija(PajamuKategorijos kategorija) {
        this.kategorija = kategorija;
    }

    public Boolean getPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(Boolean pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public void showRevenueCommands() {

    }

    public void checkIfToBank(int x){
        switch (x){
            case(1) ->{
                pozymisArIBanka  = true;
            }
            case (2) ->{
               pozymisArIBanka = false;
            }
        }

    }

    public void addCommentsPrintLine(int x){
        if (x==1){
            System.out.println("Įveskite Papildomą informaciją");
        }
        else System.out.println("komentarų nėra, spauskite enter norėdami tęsti");

    }

    public void addComments(String komentaras){
        papildomaInfo = komentaras;
    }

    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "suma=" + suma +
                ", data=" + data +
                ", kategorija=" + kategorija +
                ", pozymisArIBanka=" + pozymisArIBanka +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }
}
