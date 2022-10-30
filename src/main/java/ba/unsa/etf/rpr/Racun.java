package ba.unsa.etf.rpr;

public class Racun {
    long stanjeRacuna;
    long brojRacuna;
    Osoba korisnikRacuna;
    boolean odobrenjePrekoracenja;
    Osoba korisnik;
    Racun(Long brojRacuna, Osoba o){
        this.stanjeRacuna =0;
        korisnik=o;
        this.brojRacuna=brojRacuna;
        odobrenjePrekoracenja=false;
    }
    boolean provjeriOdobrenjePrekoracenja(long iznos){
        if(iznos<0)
            return true;
        return false;
    }
    boolean izvrsiUplatu(double uplata){
        if(uplata<0)
            return false;
        stanjeRacuna= (long) (stanjeRacuna+uplata);
        return true;
    }
    boolean izvrsiIsplatu(double isplata){
        if(isplata>stanjeRacuna)
            return false;
        stanjeRacuna= (long) (stanjeRacuna-isplata);
        return true;
    }
    void odobriPrekoracenje(double iznos){
        stanjeRacuna-=iznos;
        if(stanjeRacuna<0)
        odobrenjePrekoracenja=true;
        odobrenjePrekoracenja=false;
    }
}
