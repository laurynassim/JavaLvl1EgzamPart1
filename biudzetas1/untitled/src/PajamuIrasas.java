public class PajamuIrasas extends Irasas {

   private  PajamuKategorijos kategorija;
   private  Boolean pozymisArIBanka;


//    public PajamuIrasas(float suma, String data, String papildomaInfo, int id, PajamuKategorijos kategorija, Boolean pozymisArIBanka) {
//        super(suma, data, papildomaInfo, id);
//        this.kategorija = kategorija;
//        this.pozymisArIBanka = pozymisArIBanka;
//    }


    public PajamuIrasas() {
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


    @Override
    public String toString() {
        return "PajamuIrasas{" +
                "ID: " + getId() +
                ", suma: " + getSuma() +
                ", data: " + getData() +
                ", kategorija = " + getKategorija() +
                ", pozymisArIBanka = " + getPozymisArIBanka() +
                ", komentarai: " + getPapildomaInfo() +
                '}';
    }


}
