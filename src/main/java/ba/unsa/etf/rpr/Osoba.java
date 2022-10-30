package ba.unsa.etf.rpr;

public class Osoba {
    private String ime, prezime;
    Osoba(String ime,String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
    @Override
    public String toString(){
        return ime + " " + prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
