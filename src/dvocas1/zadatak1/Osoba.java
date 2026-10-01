package dvocas1.zadatak1;
/*
    Predstavlja klasu Osoba koja ima ime, prezime
    pol, godinu rodjenja i da li je u braku.
 */
class Osoba {
    // int double char boolean String
    String ime;
    String prezime;
    char pol = 'N';
    int godinaRodjenja;

    // Opisuje da li je osoba u braku (true) ili nije (false)
    boolean uBraku = true;

    void ispisi(){
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Pol: " + pol);
        System.out.println("Godina rodjenja: " + godinaRodjenja + ".");
        System.out.println("U braku: " + uBraku);
    }

    int izracunajStarost(int trenutnaGodina){
        int starost = trenutnaGodina - godinaRodjenja;
        return starost;
    }

}
