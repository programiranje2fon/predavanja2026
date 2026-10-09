package dvocas2.zadatak1;

class TestAutomobil {

    public static void main(String[] args) {
        Osoba o = new Osoba();
        o.ime = "Zika";
        o.prezime = "Zikic";
        o.jmbg = "2352352341";
        o.adresa = "Jove Ilica 154, Beograd";


        Automobil a = new Automobil("Nissan", "Micra", "NS-567-HH",
                1199, 50.5, o, TipGoriva.BENZIN);

        a.ispisi();

        /*Automobil a2 = new Automobil();

        a2.model = "Opel";
        a2.unesiKubikazu(45);

        a2.ispisi();

        Automobil a3 = new Automobil("Opel", "Korsa", 1399,
                70.2, TipGoriva.DIZEL);*/
    }
}
