package dvocas1.zadatak1;

public class TestOsoba {

    public static void main(String[] args){
       Osoba osoba1 = new Osoba();//null pocetna vrednost
       Osoba osoba2 = new Osoba();

       osoba1.ime = "Lara";
       osoba1.prezime = "Peric";
       osoba1.pol = 'Z';
       osoba1.godinaRodjenja = 1990;
       osoba1.uBraku = false;

       osoba2.ime = "Mika";
       osoba2.prezime = "Mikic";
       osoba2.pol = 'M';
       osoba2.godinaRodjenja = 1983;
       osoba2.uBraku = true;

       osoba1.ispisi();

       osoba2.ispisi();

       System.out.println("Starost druge osobe je: " + osoba2.izracunajStarost(2026));
    }
}
