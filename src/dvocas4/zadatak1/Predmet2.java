package dvocas4.zadatak1;

class Predmet2 {

    String naziv;

    int[] ocene; // = {5, 7, 8, 10, 10, 8};  //new int[10];
    int brojac = 0;


    Predmet2(){
        ocene = new int[100];
    }

    Predmet2(String naziv){
        this.naziv = naziv;
        ocene = new int[100];
    }

    Predmet2(String naziv, int brojStudenata){
        this.naziv = naziv;

        if (brojStudenata > 0)
            ocene = new int[brojStudenata];
        else{
            ocene = new int[100];
            System.out.println("GRESKA");
        }
    }

    //  niz ocene  10   8    5   0
    //  indeksi    0   1    2    3
    //
    void ispisi(){
        for (int i = 0; i < brojac; i++)
            System.out.println( ocene[i] );
    }

    void unesiOcenu(int novaOcena){
        if (novaOcena < 5 || novaOcena > 10){
            System.out.println("GRESKA");
            return;
        }

        if (brojac >= ocene.length)
            System.out.println("NEMA MESTA");
        else{
            ocene[brojac] = novaOcena;
            brojac++;
        }
    }

    double izracunajProsek(){
        double suma = 0;
        int brojPolagali = 0;

        for (int i = 0; i < brojac; i++){
                suma = suma + ocene[i];
                brojPolagali++;
            }

        return suma / brojPolagali;
    }

    void pronadjiNajvisuOcenu(){
        int max = 0; //Integer.MIN_VALUE;

        for (int i = 0; i < brojac; i++)
            if (ocene[i] > max)
                max = ocene[i];

        System.out.println(max);
    }

    void izracunajProlaznost(){
        int brojPolozili = 0;

        for (int i = 0; i < brojac; i++)
            if ( ocene[i] > 5)
                brojPolozili++;


        double procenatProlaznosti = (100.0 * brojPolozili) / brojac;

        System.out.println( procenatProlaznosti );
    }

}
