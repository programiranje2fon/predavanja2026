package dvocas4.zadatak1;

class TestPredmet {

    public static void main(String[] args) {
        Predmet p = new Predmet("Programiranje 1" , 8);

        p.unesiOcenu(10);
        p.unesiOcenu(8);
        p.unesiOcenu(5);

        p.ispisi();

        System.out.println( "Prosek je: " + p.izracunajProsek() );
    }
}
