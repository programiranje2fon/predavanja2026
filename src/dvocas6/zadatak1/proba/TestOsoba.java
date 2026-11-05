package dvocas6.zadatak1.proba;

import dvocas6.zadatak1.osoba.Osoba;
import dvocas6.zadatak1.student.Student;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba o1 = new Osoba();

        o1.postaviIme("Pera");
        //o1.ime = null;
        o1.postaviPrezime("Peric");
        o1.postaviAdresu("Jove Ilica 154, Beograd");

        //o1.ispisi();
        System.out.println( o1 );

        Student s = new Student();

        s.postaviIme("Mika");
        s.postaviPrezime("Mikic");
        s.postaviAdresu("Vojvode Stepe 1");
        s.postaviFakultet("FON");
        s.postaviProsek(9.5);

        //s.ispisi();
        System.out.println( s );


        System.out.println( o1.equals(s) );
    }
}
