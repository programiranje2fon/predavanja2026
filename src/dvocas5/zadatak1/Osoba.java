package dvocas5.zadatak1;

class Osoba {

    // char[]  'A'  "ASA"  "A"
    //String ime = new String("nepoznato");
    String ime = "nepoznato";

    String prezime = "nepoznato";

    String adresa;

    // null  "" equals   isEmpty  equalsIgnoreCase length
    void postaviIme(String ime){
        if (ime == null || ime.isEmpty())
            System.out.println("Greska: ime ne sme biti null niti prazno");
        else
            this.ime = ime;
    }

    void postaviPrezime(String prezime){
        if (prezime == null || prezime.length() == 0)
            System.out.println("Greska: prezime ne sme biti null niti prazno");
        else
            this.prezime = prezime;
    }

    // "ULICA;BROJ;GRAD" indexOf lastIndexOf
    void postaviAdresu(String adresa){
        if (adresa == null || adresa.length() < 5 ||
                //adresa.indexOf(';') == adresa.lastIndexOf(';'))
                prebrojTackaZarez(adresa) != 2)
            System.out.println("Greska: adresa mora da ima bar 5 znakova i dva znaka ;");
        else
            this.adresa = adresa;
    }

    // "ABBA"  [i] -> charAt(i)
    //  0123    length -> length()
    int prebrojTackaZarez(String s){
        int brojac = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ';')
                brojac++;

        return brojac;
    }

    // "ULICA;BROJ;GRAD" endsWith, substring
    void istaAdresa(String ulica, String broj, String grad){
        String adresa2 = ulica + ';' + broj + ';' + grad;

        if (adresa.equalsIgnoreCase(adresa2))
            System.out.println("potpuno ista adresa");
        else {
            String grad2 = adresa.substring(adresa.lastIndexOf(';') + 1);
            if (grad2.equals(grad))
                System.out.println("samo isti grad");
            else
                System.out.println("nije ista adresa");
        }
    }

    // "ULICA;BROJ;GRAD"
    void ispisi(){
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);

        /*String ulica = adresa.substring(0, adresa.indexOf(';'));
        String broj = adresa.substring(adresa.indexOf(';')+1, adresa.lastIndexOf(';'));
        String grad = adresa.substring(adresa.lastIndexOf(';')+1);

        System.out.println("Ulica: " + ulica);
        System.out.println("Broj: " + broj);
        System.out.println("Grad: " + grad);*/

        String[] reci = adresa.split(";");

        System.out.println("Ulica: " + reci[0]);
        System.out.println("Broj: " + reci[1]);
        System.out.println("Grad: " + reci[2]);
    }

}
