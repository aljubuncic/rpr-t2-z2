package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Banka {
    private Long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;

    Banka() {
        korisnici = new ArrayList<>(0);
        uposlenici = new ArrayList<>(0);
        brojRacuna= 0L;
    }
    Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik user=new Korisnik(ime,prezime);
        korisnici.add(user);
        return user;
    }
    Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik employee=new Uposlenik(ime,prezime);
               uposlenici.add(employee);
        return employee;
    }
    Racun kreirajRacunZaKorisnika(Korisnik user){
        Racun racun=new Racun(user.racun.brojRacuna,user);
        korisnici.get(korisnici.indexOf(user)).dodajRacun(racun);
        return racun;
    }
}
