package dvocas8.zadatak1.test;

import dvocas8.zadatak1.Automobil;
import dvocas8.zadatak1.Kamion;
import dvocas8.zadatak1.Motocikl;
import dvocas8.zadatak1.MotornoVozilo;

public class TestVozila {

    public static void main(String[] args) {
        MotornoVozilo mv;// = new MotornoVozilo();

        MotornoVozilo a = new Automobil();
        a.setMarkaModel("Ford Focus");
        a.setSnaga(70);
        a.setKubikaza(1799);
        a.setRegistarskaOznaka("BG123JK");

        MotornoVozilo m = new Motocikl();
        m.setMarkaModel("Suzuki GS 750");
        m.setSnaga(100);
        m.setKubikaza(749);
        m.setRegistarskaOznaka("NS987TT");

        System.out.println(a);
        System.out.println(a.izracunajRegistraciju());

        System.out.println(m);
        System.out.println(m.izracunajRegistraciju());

        Kamion k = new Kamion();
        k.setMarkaModel("FAP 300");
        k.setSnaga(200);
        k.setKubikaza(4000);
        k.setRegistarskaOznaka("NI543MM");

        System.out.println(k);
        System.out.println(k.izracunajRegistraciju());

        MotornoVozilo[] niz = new MotornoVozilo[3];
        niz[0] = a;
        niz[1] = m;
        niz[2] = k;

        izracunajUkupnuRegistraciju(niz);
    }

    //  Motocikl  Automobil  Motocikl  Automobil Automobil
    public static void izracunajUkupnuRegistraciju(MotornoVozilo[] vozila){
        double ukupnaRegistracija = 0;

        for (MotornoVozilo v: vozila)
            ukupnaRegistracija = ukupnaRegistracija + v.izracunajRegistraciju();

        System.out.println("Ukupna cena je: " + ukupnaRegistracija);
    }
}
