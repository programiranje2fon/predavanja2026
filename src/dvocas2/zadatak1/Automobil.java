package dvocas2.zadatak1;

class Automobil {

    String marka, model, registarskaOznaka;
    int kubikaza;
    double snaga;
    Osoba vlasnik;
    TipGoriva vrstaGoriva;

    final double KS_KW = 0.74;
    final double KW_KS = 1.34;

    Automobil(){

    }


    Automobil(String marka, String model, int kubikaza,
              double snaga, TipGoriva vrstaGoriva){
        this.marka = marka;
        this.model = model;
        unesiKubikazu(kubikaza);
        unesiSnagu(snaga);
        this.vrstaGoriva = vrstaGoriva;
    }

    Automobil(String marka, String model, String registarskaOznaka, int kubikaza,
              double snaga, Osoba vlasnik, TipGoriva vrstaGoriva){
        this.marka = marka;
        this.model = model;
        this.registarskaOznaka = registarskaOznaka;
        unesiKubikazu(kubikaza);
        unesiSnagu(snaga);
        this.vlasnik = vlasnik;
        this.vrstaGoriva = vrstaGoriva;
    }

    void unesiSnagu(double snaga) {
        //   <  >   <=  >=  ==  !=
        //  &&   ||   !
        if (snaga < 10 || snaga > 800)
            System.out.println("Snaga je van granica 10-800");
        else
            this.snaga = snaga;
    }

    void unesiKubikazu(int kubikaza) {
        //   <  >   <=  >=  ==  !=
        //  &&   ||   !
        if (kubikaza >= 700 && kubikaza <= 5000)
            this.kubikaza = kubikaza;
        else
            System.out.println("Kubikaza je van granica 700-5000");
    }

    void ispisi(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Registracija: " + registarskaOznaka);
        System.out.println("Kubikaza: " + kubikaza);
        System.out.println("Snaga: " + snaga + " kW (" + (snaga* KW_KS) + " ks) 1 kW = " + KW_KS + " Ks");
        System.out.print("Vlasnik: ");
        vlasnik.ispisi();
        System.out.println("Vrsta goriva: " + vrstaGoriva);
        System.out.printf("Marka: %-10s, model: %s, snaga: %.2f \n", marka, model, snaga);
    }
}
