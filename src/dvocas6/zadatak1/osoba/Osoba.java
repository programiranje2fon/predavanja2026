package dvocas6.zadatak1.osoba;

// fon.bg.ac.rs
// rs.ac.bg.fon.ai.programiranje1.Osoba

import java.util.Objects;

// public   private  protected
public class Osoba {

    private String ime = "nepoznato";
    private String prezime = "nepoznato";
    private String adresa = "nepoznato";

    public void postaviIme(String ime){
        if (ime == null || ime.isEmpty())
            System.out.println("Greska, ime ne sme biti null niti prazno");
        else this.ime = ime;
    }

    public void postaviPrezime(String prezime){
        if (prezime == null || prezime.isEmpty())
            System.out.println("Greska, prezime ne sme biti null niti prazno");
        else this.prezime = prezime;
    }

    public void postaviAdresu(String adresa){
        if (adresa == null || adresa.length() < 5)
            System.out.println("Adresa mora imati bar 5 slova");
        else this.adresa = adresa;
    }

    /*public void ispisi(){
        System.out.print("Ime: " + ime + ", Prezime: " + prezime + ", Adresa: " + adresa);
    }*/

    @Override
    public String toString(){
        return "Ime: " + ime + ", Prezime: " + prezime + ", Adresa: " + adresa;
    }

    /*Generisana toString metoda
    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }*/

    public String vratiIme(){
        return  ime;
    }

    public String vratiPrezime(){
        return  prezime;
    }

    public String vratiAdresu(){
        return  adresa;
    }

    public boolean equals(Object o){
        if (o instanceof Osoba){
            Osoba os = (Osoba) o;

            if (ime.equals(os.ime) && prezime.equals(os.prezime))
                return true;
        }

        return false;
    }

    /* Generisana equals metoda
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Osoba osoba)) return false;
        return Objects.equals(ime, osoba.ime) && Objects.equals(prezime, osoba.prezime);
    }*/
}
